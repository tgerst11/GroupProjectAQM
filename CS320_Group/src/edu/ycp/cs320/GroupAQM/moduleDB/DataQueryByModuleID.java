package edu.ycp.cs320.GroupAQM.moduleDB;

import java.util.List;
import java.util.Scanner;

import edu.ycp.cs320.GroupAQM.model.Module;
import edu.ycp.cs320.GroupAQM.persist.DatabaseProvider;
import edu.ycp.cs320.GroupAQM.persist.DerbyDatabase;
import edu.ycp.cs320.GroupAQM.persist.IDatabase;
import edu.ycp.cs320.GroupAQM.persist.InitDatabase;

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
				//getDate(module.getTime());
			}
		}
	}

	public static String getDate(String timeStamp)
	{
		//String timeStamp = "2020-04-27T15:00:00.000Z";
		int i = 0;
		int charAt = 0;
		char c;
		String date;
		
		while(charAt == 0) {
			c = timeStamp.charAt(i);
			
			if(c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '9' && c != '0' && c != '-')
			{
				charAt = i;
			}
			
			i++;
		}
		
		date = timeStamp.substring(0, charAt);
		
		System.out.println(date);
		
		return date;
	}
	
	public static String getTime(String timeStamp)
	{
		//String timeStamp = "2020-04-27T15:00:00.000Z";
		int i = 0;
		int start = 0;
		int charAt = 0;
		char c;
		String time;
		boolean dateFound = false;
		
		while(charAt == 0) {
			c = timeStamp.charAt(i);
			if(dateFound)
			{
				if(c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '9' && c != '0' && c != '-' && c != ':')
				{
					charAt = i;
				}
			}
			//timeStamp.indexOf(getDate());
			else
			{
				if(c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '9' && c != '0' && c != '-' && c != ':')
				{
					i++;
					start = i;
					dateFound = true;
				}
			}
			i++;
		}
		
		time = timeStamp.substring(start, charAt);
		
		System.out.println("Time: " + time);
		
		return time;
	}
	
}