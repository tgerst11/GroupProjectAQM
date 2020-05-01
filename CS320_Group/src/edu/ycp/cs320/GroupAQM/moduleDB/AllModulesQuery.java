package edu.ycp.cs320.GroupAQM.moduleDB;

import java.util.List;
import java.util.Scanner;

import edu.ycp.cs320.GroupAQM.model.Module;
import edu.ycp.cs320.GroupAQM.persist.DatabaseProvider;
import edu.ycp.cs320.GroupAQM.persist.DerbyDatabase;
import edu.ycp.cs320.GroupAQM.persist.IDatabase;
import edu.ycp.cs320.GroupAQM.persist.InitDatabase;
import edu.ycp.cs320.GroupAQM.persist.InitialData;

public class AllModulesQuery{
	public static void main(String[] args) throws Exception {
		
		Scanner keyboard = new Scanner(System.in);

		// Create the default IDatabase instance
		
		InitDatabase.init(keyboard);
		
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
				System.out.println(module.getName() + "," + module.getStatus());	
			}
		}
	}
}









