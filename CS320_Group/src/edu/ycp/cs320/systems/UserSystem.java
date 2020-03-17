package edu.ycp.cs320.systems;

import java.util.HashMap;

import edu.ycp.cs320.lab02a_tgerst.model.Admin;

class UserSystem {
	private Admin admin;
	private String username;
	private String password;
	private String temp_pass;
	HashMap<String, String> accounts = new HashMap<>();
	
	public void setModel(Admin admin) {
		this.admin = admin;
	}
	
	public boolean validateLogin() {
		//TODO: returns true if the username and password
		username = admin.getUsername();
		password = admin.getPassword();
		
		if(accounts.containsKey(username)) {
			temp_pass= accounts.get(username);
		}
		
		if(temp_pass.contentEquals(password)) {
				return true;
		}
		else {
			return false;
		}
		
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
		
		}
		
		 

	public void createAdmin() {
		//adds the admin username and password to the Hashmap
		accounts.put(admin.getUsername(),admin.getPassword());
	
	}
}
