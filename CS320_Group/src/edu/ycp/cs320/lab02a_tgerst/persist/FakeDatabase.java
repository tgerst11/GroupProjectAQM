package edu.ycp.cs320.lab02a_tgerst.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.lab02a_tgerst.model.Admin;
import edu.ycp.cs320.lab02a_tgerst.model.Module;

public class FakeDatabase implements IDatabase {
	
	// Fake database constructor - initializes the DB
	// the DB only consists for a List of Authors and a List of Books
	public FakeDatabase() {
		
		// Add initial data
		
//		System.out.println(authorList.size() + " authors");
//		System.out.println(bookList.size() + " books");
	}

	@Override
	public List<Admin> validateCred(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Module> findAllModules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Module> findDataByModuleID(int module_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Module> findDataByModuleLocation(String module_name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int addLocation(String coordinates, String city, String state, String country) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*
	public void readInitialData() {
		try {
			authorList.addAll(InitialData.getAuthors());
			bookList.addAll(InitialData.getBooks());
		} catch (IOException e) {
			throw new IllegalStateException("Couldn't read initial data", e);
		}
	}
	*/

}
