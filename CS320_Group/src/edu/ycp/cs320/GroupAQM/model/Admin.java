package edu.ycp.cs320.GroupAQM.model;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Admin {
	//attribute
	private String username,password,email;
	private ArrayList<String> usernames;
	private ArrayList<String> passwords;
	private Map<String, String> credentials;
	
	//constructor
	public Admin() {
		usernames = new ArrayList<String>();
		passwords = new ArrayList<String>();
		credentials = new TreeMap<String, String>();
		
		usernames.add("tgerst");
		usernames.add("dmchugh");
		usernames.add("mtrost");
		usernames.add("dbieber");
		usernames.add("DJHake");
		
		passwords.add("adminTG");
		passwords.add("adminDM");
		passwords.add("adminMT");
		passwords.add("adminDB");
		passwords.add("TeslaBD");
		
		for (int i = 0; i < usernames.size(); i++) {
			credentials.put(usernames.get(i), passwords.get(i));
		}
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
	
	public boolean validateUserName(String name) {
		return credentials.containsKey(name);
	}

	// login credentials - test version
	public boolean validatePW(String name, String pw) {
		if (credentials.containsKey(name)) {
			if  (credentials.get(name).equals(pw)) {
				return true;
			}
		}			
		return false;
	}

}