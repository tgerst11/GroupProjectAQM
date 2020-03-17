package edu.ycp.cs320.systems;

import edu.ycp.cs320.lab02a_tgerst.model.Admin;

class UserSystem {
	private Admin admin;
	private String username;
	private String password;
	
	public void setModel(Admin admin) {
		this.admin = admin;
	}
	
	public boolean validateLogin() {
		//TODO: returns true if the username and password
		username = admin.getUsername();
		password = admin.getPassword();
		
		//search the database for the username and password
		/*
		 * This would consist of preparing a JDBC statement that would search the database for the username/password
		 * if (rowsReturned==0){
		 * return false;
		 * }
		 * else{
		 * return true;
		 * }
		 */
		return (Boolean) null;
		
		}
		
		 

	public void createAdmin() {
		
		//TODO: creates a new admin account
	}
}
