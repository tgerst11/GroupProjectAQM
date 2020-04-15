package edu.ycp.cs320.lab02a_tgerst.persist;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.lab02a_tgerst.model.Admin;
import edu.ycp.cs320.lab02a_tgerst.model.Data;


public class DerbyDatabase implements IDatabase {
	static {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (Exception e) {
			throw new IllegalStateException("Could not load Derby driver");
		}
	}
	
	private interface Transaction<ResultType> {
		public ResultType execute(Connection conn) throws SQLException;
	}

	private static final int MAX_ATTEMPTS = 10;


	
	// wrapper SQL transaction function that calls actual transaction function (which has retries)
	public<ResultType> ResultType executeTransaction(Transaction<ResultType> txn) {
		try {
			return doExecuteTransaction(txn);
		} catch (SQLException e) {
			throw new PersistenceException("Transaction failed", e);
		}
	}
	
	// SQL transaction function which retries the transaction MAX_ATTEMPTS times before failing
	public<ResultType> ResultType doExecuteTransaction(Transaction<ResultType> txn) throws SQLException {
		Connection conn = connect();
		
		try {
			int numAttempts = 0;
			boolean success = false;
			ResultType result = null;
			
			while (!success && numAttempts < MAX_ATTEMPTS) {
				try {
					result = txn.execute(conn);
					conn.commit();
					success = true;
				} catch (SQLException e) {
					if (e.getSQLState() != null && e.getSQLState().equals("41000")) {
						// Deadlock: retry (unless max retry count has been reached)
						numAttempts++;
					} else {
						// Some other kind of SQLException
						throw e;
					}
				}
			}
			
			if (!success) {
				throw new SQLException("Transaction failed (too many retries)");
			}
			
			// Success!
			return result;
		} finally {
			DBUtil.closeQuietly(conn);
		}
	}

	// TODO: Here is where you name and specify the location of your Derby SQL database
	// TODO: Change it here and in SQLDemo.java under CS320_LibraryExample_Lab06->edu.ycp.cs320.sqldemo
	// TODO: DO NOT PUT THE DB IN THE SAME FOLDER AS YOUR PROJECT - that will cause conflicts later w/Git
	private Connection connect() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:derby:C:/CS320-GroupProject/data.db;create=true");		
		
		// Set autocommit() to false to allow the execution of
		// multiple queries/statements as part of the same transaction.
		conn.setAutoCommit(false);
		
		return conn;
	}

	
	//  creates the tables
	public void createTables() {
		executeTransaction(new Transaction<Boolean>() {
			@Override
			public Boolean execute(Connection conn) throws SQLException {
				PreparedStatement stmt1 = null;			
				PreparedStatement stmt2 = null;
				PreparedStatement stmt3 = null;
				PreparedStatement stmt4 = null;
			
				try {
					stmt1 = conn.prepareStatement(
						"create table admins (" +								
						"	username varchar(40)," +
						"	password varchar(40)," +
						"	email varchar(40)" +
						")"
					);	
					stmt1.executeUpdate();
					
					System.out.println("Admins table created");
									
					stmt2 = conn.prepareStatement(
							"create table data (" +								
							"	data_id integer primary key " +
							"		generated always as identity (start with 1, increment by 1), " +
							"	time varchar(40)," +
							"	humidity float," +
							"	temp float," +
							"	air_pressure float," +
							"	voc float," +
							"	module_id integer" +
							")"
					);	
					
					stmt2.executeUpdate();
						
					System.out.println("Data table created");
					
					return true;
				} finally {
					DBUtil.closeQuietly(stmt1);
					DBUtil.closeQuietly(stmt2);
				}
			}
		});
	}
	
	// loads data retrieved from CSV files into DB tables in batch mode
	public void loadInitialData() {
		executeTransaction(new Transaction<Boolean>() {
			@Override
			public Boolean execute(Connection conn) throws SQLException {
				List<Admin> adminList;
				List<Data> dataList;
				
				try {
					adminList     = InitialData.getAdmins();
					dataList      = InitialData.getData();
									
				} catch (IOException e) {
					throw new SQLException("Couldn't read initial data", e);
				}

				PreparedStatement insertAdmin     = null;
				PreparedStatement insertData     = null;

				try {
					// must completely populate Authors table before populating BookAuthors table because of primary keys
					insertAdmin = conn.prepareStatement("insert into admins (username, password, email) values (?, ?, ?)");
					for (Admin admin : adminList) {
						insertAdmin.setString(1, admin.getUsername());
						insertAdmin.setString(2, admin.getPassword());
						insertAdmin.setString(3, admin.getEmail());
						insertAdmin.addBatch();
					}
					insertAdmin.executeBatch();
					
					System.out.println("Admins table populated");
									
					insertData = conn.prepareStatement("insert into data (time, humidity, temp, air_pressure, voc, module_id) values (?, ?, ?, ?, ?, ?)");
					for (Data data : dataList) {
						insertData.setString(1, data.getTime());
						insertData.setFloat(2, data.getPercentHumidity());
						insertData.setFloat(3, data.getTemperature());
						insertData.setFloat(4, data.getAirPressure());
						insertData.setFloat(5, data.getVOC());
						insertData.setInt(6, data.getModuleID());
						insertData.addBatch();
					}
					insertData.executeBatch();
					
					System.out.println("Data table populated");
					return true;
				} finally {
					DBUtil.closeQuietly(insertAdmin);	
					DBUtil.closeQuietly(insertData);
				}
			}
		});
	}
	
	// The main method creates the database tables and loads the initial data.
	public static void main(String[] args) throws IOException {
		System.out.println("Creating tables...");
		DerbyDatabase db = new DerbyDatabase();
		db.createTables();
		
		System.out.println("Loading initial data...");
		db.loadInitialData();
		
		System.out.println("Data DB successfully initialized!");
	}
}
