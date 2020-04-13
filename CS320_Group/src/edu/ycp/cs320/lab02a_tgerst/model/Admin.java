package edu.ycp.cs320.lab02a_tgerst.model;

public class Admin {
	//attribute
	private String username,password,email;
	
	//constructor
	public Admin(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}


	public void setUsername(String username){
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void editModule() {
		//Todo
	}
	
	public void addModule() {
		//Todo
	}
	
	public void requestData() {
		//Todo
	}

}