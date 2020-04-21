package edu.ycp.cs320.lab02a_tgerst.moduleDB;

import java.util.List;
import java.util.Scanner;

import edu.ycp.cs320.lab02a_tgerst.model.Module;
import edu.ycp.cs320.lab02a_tgerst.persist.DatabaseProvider;
import edu.ycp.cs320.lab02a_tgerst.persist.DerbyDatabase;
import edu.ycp.cs320.lab02a_tgerst.persist.IDatabase;
import edu.ycp.cs320.lab02a_tgerst.persist.InitDatabase;

public class DataQueryByModuleID{
public static void main(String[] args) throws Exception {
		
		Scanner keyboard = new Scanner(System.in);

		// Create the default IDatabase instance
		
		InitDatabase.init(keyboard);
		
		DatabaseProvider.setInstance(new DerbyDatabase());
		
		System.out.print("Enter a Module ID: ");
		int module_id = keyboard.nextInt();
		
		
		// get the DB instance and execute transaction
		IDatabase db = DatabaseProvider.getInstance();
		List<Module> moduleList = db.findDataByModuleID(module_id);
		
		// check if anything was returned and output the list
		if (moduleList.isEmpty()) {
			System.out.println("There are no modules in the database");
		}
		else {
			for (Module module : moduleList) {
				//print the tings here
				System.out.println(module.getAQI() +","+ module.getHumidity() +","+ module.getMainPol() +","+ module.getPressure() +","+ module.getTemp() +","+ module.getWindDir() +","+ module.getWindSpeed());	
			}
		}
	}
	
}