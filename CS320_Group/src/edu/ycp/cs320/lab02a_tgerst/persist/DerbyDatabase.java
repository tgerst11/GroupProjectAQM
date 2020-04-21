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
import edu.ycp.cs320.lab02a_tgerst.model.Location;
import edu.ycp.cs320.lab02a_tgerst.model.Module;


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
	
// AQI | mainPollutant | humidity | windSpeed |windDirection | pressure | temperature | time
					stmt2 = conn.prepareStatement(
							"create table data (" +								
							"	data_id integer primary key " +
							"		generated always as identity (start with 1, increment by 1), " +
							"	aqi varchar(40)," +
							"	mainPollutant varchar(40)," +
							"	humidity varchar(40)," +
							"	windSpeed varchar(40)," +
							"	windDirection varchar(40)," +
							"	pressure varchar(40)," +
							"	temperature varchar(40)," +
							"	timedate timestamp" +
							")"
					);	
					
					
					stmt2.executeUpdate();
						
					System.out.println("Data table created");
					
//coordinates | city | state | country 
					stmt3 = conn.prepareStatement(
							"create table locations (" +								
							"	location_id integer primary key " +
							"		generated always as identity (start with 1, increment by 1), " +
							"	coordinates varchar(40)," +
							"	city varchar(40)," +
							"	state varchar(40)," +
							"	country varchar(40)" +
							")"
					);	
					
					stmt3.executeUpdate();
						
					System.out.println("Location table created");
					
					stmt4 = conn.prepareStatement(
							"create table modules (" +								
							"	data_id integer," +
							"	location_id integer," +
							"	name varchar(40)," +
							"	status varchar(40)" +
							")"
					);	
					
					stmt4.executeUpdate();
						
					System.out.println("Module table created");
					
					return true;
				} finally {
					DBUtil.closeQuietly(stmt1);
					DBUtil.closeQuietly(stmt2);
					DBUtil.closeQuietly(stmt3);
					DBUtil.closeQuietly(stmt4);
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
				List<Module> dataList;
				List<Location> locationList;
				List<Module> moduleList;
				
				try {
					adminList     = InitialData.getAdmins();
					dataList      = InitialData.getData();
					locationList  = InitialData.getLocations();
					moduleList    = InitialData.getModules();
									
				} catch (IOException e) {
					throw new SQLException("Couldn't read initial data", e);
				}

				PreparedStatement insertAdmin        = null;
				PreparedStatement insertData         = null;
				PreparedStatement insertLocation     = null;
				PreparedStatement insertModule       = null;

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
									
					insertData = conn.prepareStatement("insert into data (aqi, mainPollutant, humidity, windSpeed, windDirection, pressure, temperature, timedate) values (?, ?, ?, ?, ?, ?, ?, ?)");
					for (Module module : moduleList) {
						insertData.setObject(1, module.getAQI());
						insertData.setObject(2, module.getMainPol());
						insertData.setObject(3, module.getHumidity());
						insertData.setObject(4, module.getWindSpeed());
						insertData.setObject(5, module.getWindDir());
						insertData.setObject(6, module.getPressure());
						insertData.setObject(7, module.getTemp());
						insertData.setObject(8, module.getTime());
						insertData.addBatch();
					}
					insertData.executeBatch();
					
					System.out.println("Data table populated");
					
					insertLocation = conn.prepareStatement("insert into locations (coordinates, city, state, country ) values (?, ?, ?, ?)");
					for (Location location : locationList) {
						insertData.setObject(1, location.getCoordinates());
						insertData.setString(2, location.getCity());
						insertData.setString(3, location.getState());
						insertData.setString(4, location.getCountry());
						insertLocation.addBatch();
					}
					insertLocation.executeBatch();
					
					System.out.println("Location table populated");
					
					insertModule = conn.prepareStatement("insert into modules (data_id, location_id, name, status) values (?, ?, ?, ?)");
					for (Module module : moduleList) {
						insertModule.setInt(1, module.getDataId());
						insertModule.setInt(2, module.getLocationId());
						insertModule.setString(3, module.getName());
						insertModule.setString(4, module.getStatus());
						insertModule.addBatch();
					}
					insertModule.executeBatch();
					
					System.out.println("Module table populated");
					
					return true;
				} finally {
					DBUtil.closeQuietly(insertAdmin);	
					DBUtil.closeQuietly(insertData);
					DBUtil.closeQuietly(insertLocation);
					DBUtil.closeQuietly(insertModule);
				}
			}
		});
	}
	
	//SQL Methods
	
	@Override
	public List<Admin> validateCred(String username, String password) {
		// TODO Auto-generated method stub
		return null;
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

	public List<Module> findAllModules() {
		return executeTransaction(new Transaction<List<Module>>() {
			@Override
			public List<Module> execute(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				ResultSet resultSet = null;
				
				try {
					stmt = conn.prepareStatement(
							"select * from module " +
							" order by city asc"
					);
					
					List<Module> result = new ArrayList<Module>();
					
					resultSet = stmt.executeQuery();
					
					// for testing that a result was returned
					Boolean found = false;
					
					while (resultSet.next()) {
						found = true;
						
						Module module = new Module();
						loadModule(module, resultSet, 1);
						
						result.add(module);
					}
					
					// check if any authors were found
					if (!found) {
						System.out.println("No modules were found in the database");
					}
					
					return result;
				} finally {
					DBUtil.closeQuietly(resultSet);
					DBUtil.closeQuietly(stmt);
				}
			}
		});
	}

	private void loadModule(Module module, ResultSet resultSet, int index) throws SQLException {
		//TODO STUFF HERE
	}
	
	
}
