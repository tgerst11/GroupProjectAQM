package edu.ycp.cs320.lab02a_tgerst.moduleDB;

import java.util.Scanner;

import edu.ycp.cs320.lab02a_tgerst.persist.DatabaseProvider;
import edu.ycp.cs320.lab02a_tgerst.persist.IDatabase;
import edu.ycp.cs320.lab02a_tgerst.persist.InitDatabase;
import edu.ycp.cs320.lab02a_tgerst.apiConnection.apiParseData;
import edu.ycp.cs320.lab02a_tgerst.model.Module;

public class AddData {
	public static void main(String[] args) throws Exception {
		
		Scanner keyboard = new Scanner(System.in);
		Module mod = new Module();
		
		apiParseData controller = new apiParseData();
		controller.setModel(mod);
		
		try {
			controller.call();
			} 
			catch (Exception e){
				
				System.out.println("There has been an error populating your model");
			}
		// Create the default IDatabase instance
		InitDatabase.init(keyboard);
		
		IDatabase db = DatabaseProvider.getInstance();
		
		Integer location_id = db.insertData(mod.getCity(), mod.getCoordinates(), mod.getState(), mod.getCountry(), mod.getTime(), mod.getTemp(), mod.getPressure(), mod.getHumidity(), mod.getWindSpeed(), mod.getWindDir(), mod.getAQI(), mod.getMainPol());
		
		if (location_id > 0)
		{
			System.out.println("Successful addition of data.");
		}
		else
		{
			System.out.println("Failed to insert data.");			
		}
		
	}//end of main
}	
