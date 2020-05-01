package edu.ycp.cs320.GroupAQM.controller;

public class adminController {
	//create a Numbers model
	private String username;
	private String password;
	private String email;
	
	public adminController(String username, String password) {
		//create the model
		this.username = username;
		this.password = password;
	}
	
	public adminController(String username, String password, String email) {
		//create the model
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public boolean checkUsername() {
		//UPDATE
		//pull username from the database
		String username = "admin";
		if(this.username == username)
		{
			return true;
		}
		return false;
	}
	
	public boolean checkPassword() {
		//UPDATE
		//pull password from the database
		String password = "p@ssword";
		if(this.password == password)
		{
			return true;
		}
		return false;
	}
	
	public boolean checkEmail() {
		//UPDATE
		//pull email from the database
		String email = "admin@ycp.edu";
		if(this.email == email)
		{
			return true;
		}
		return false;
	}
}
