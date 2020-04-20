package edu.ycp.cs320.lab02a_tgerst.persist;

import java.util.List;

import edu.ycp.cs320.lab02a_tgerst.model.Admin;


public interface IDatabase {

	List<Admin> validateCred(String username, String password);		
}
