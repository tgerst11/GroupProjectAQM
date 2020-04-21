package edu.ycp.cs320.lab02a_tgerst.moduleDB;

import java.util.List;
import java.util.Scanner;

import edu.ycp.cs320.lab02a_tgerst.persist.DerbyDatabase;
import edu.ycp.cs320.lab02a_tgerst.model.Module;
import edu.ycp.cs320.lab02a_tgerst.persist.InitialData;
import edu.ycp.cs320.lab02a_tgerst.persist.DatabaseProvider;
import edu.ycp.cs320.lab02a_tgerst.persist.IDatabase;

public class AllModulesQuery{
	public static void main(String[] args) throws Exception {

		// Create the default IDatabase instance
		
		DatabaseProvider.setInstance(new DerbyDatabase());
		
		
		// get the DB instance and execute transaction
		IDatabase db = DatabaseProvider.getInstance();
		List<Module> moduleList = db.findAllModules();
		
		// check if anything was returned and output the list
		if (moduleList.isEmpty()) {
			System.out.println("There are no modules in the database");
		}
		else {
			for (Module module : moduleList) {
				//print the tings here 
				
				
				
			}
		}
	}
}









