package edu.ycp.cs320.lab02a_tgerst.controller;


import edu.ycp.cs320.lab02a_tgerst.model.Admin;

public class adminController {
	//create a Numbers model
	private Admin admin;
	
	public void setModel(Admin admin) {
		//create the model
		this.admin = admin;
	}
	
	public boolean checkUsername() {
		//UPDATE
		//pull username from the database
		String username = "UPDATE";
		if(admin.getUsername() == username)
		{
			return true;
		}
		return false;
	}
	
	public boolean checkPassword() {
		//UPDATE
		//pull password from the database
		String password = "UPDATE";
		if(admin.getPassword() == password)
		{
			return true;
		}
		return false;
	}
	
	public boolean checkEmail() {
		//UPDATE
		//pull username from the database
		String email = "UPDATE";
		if(admin.getEmail() == email)
		{
			return true;
		}
		return false;
	}
}
