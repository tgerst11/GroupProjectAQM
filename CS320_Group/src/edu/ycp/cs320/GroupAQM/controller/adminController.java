package edu.ycp.cs320.GroupAQM.controller;

import edu.ycp.cs320.GroupAQM.model.Admin;

public class adminController {
	//create a Numbers model
	private String username;
	private String password;
	private String email;
	private Admin model;
	
	public adminController(Admin model) {
		//create the model
		this.model = model;
	}
	
	public boolean checkUserName(String name) {
		return model.validateUserName(name);
	}
	
	public boolean validateCredentials(String name, String pw) {
		return model.validatePW(name, pw);
	}
}
