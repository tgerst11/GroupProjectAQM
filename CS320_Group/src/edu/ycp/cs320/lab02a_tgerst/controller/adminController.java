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
}
