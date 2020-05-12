package edu.ycp.cs320.GroupAQM.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.ycp.cs320.GroupAQM.model.Admin;
import edu.ycp.cs320.GroupAQM.model.Data;
import edu.ycp.cs320.GroupAQM.model.Location;
import edu.ycp.cs320.GroupAQM.model.Module;


public class InitialData {
	
	// reads initial Admin data from CSV file and returns a List of Admins
		public static List<Admin> getAdmins() throws IOException {
			List<Admin> adminList = new ArrayList<Admin>();
			ReadCSV readAdmins = new ReadCSV("account.csv");
			try {
				// auto-generated primary key for authors table
				while (true) {
					List<String> tuple = readAdmins.next();
					if (tuple == null) {
						break;
					}
					Iterator<String> i = tuple.iterator();
					Admin admin = new Admin();

					admin.setUsername(i.next());	
					admin.setPassword(i.next());
					admin.setEmail(i.next());
					adminList.add(admin);
				}
				System.out.println("adminList loaded from CSV file");
				return adminList;
			} finally {
				readAdmins.close();
			}
		}
		
		
		// reads initial Data from CSV file and returns a List of Data
		public static List<Module> getData() throws IOException {
			List<Module> dataList = new ArrayList<Module>();
			ReadCSV readData = new ReadCSV("data.csv");
			try {
				// auto-generated primary key for table books
				Integer dataID = 1;
				while (true) {
					List<String> tuple = readData.next();
					if (tuple == null) {
						break;
					}
					Iterator<String> i = tuple.iterator();
					Module data = new Module();
					
					// auto-generate Data ID, instead
					Integer.parseInt(i.next());
					data.setDataId(dataID++);
					data.setLocationId(Integer.parseInt(i.next()));
					
					// AQI | mainPollutant | humidity | windSpeed |windDirection | pressure | temperature | time
					data.setAQI(i.next());
					data.setMainPol(i.next());
					data.setHumidity(i.next());
					data.setWindSpeed(i.next());
					data.setWindDir(i.next());
					data.setPressure(i.next());
					data.setTemperature(i.next());
					data.setTimeStamp(i.next());
					dataList.add(data);
				}
				System.out.println("dataList loaded from CSV file");			
				return dataList;
			} finally {
				readData.close();
			}
		}
		
		// reads initial Location data from CSV file and returns a List of Locations
		public static List<Location> getLocations() throws IOException {
			List<Location> locationList = new ArrayList<Location>();
			ReadCSV readLocation = new ReadCSV("location.csv");
			try {
				Integer locationID = 1;
				while (true) {
					List<String> tuple = readLocation.next();
					if (tuple == null) {
						break;
					}
					Iterator<String> i = tuple.iterator();
					Location location = new Location();
					
					// auto-generate Data ID, instead
					Integer.parseInt(i.next());
					location.setLocationID(locationID++);
					
					//coordinates | city | state | country 
					location.setCoordinates(i.next());
					location.setCity(i.next());
					location.setState(i.next());
					location.setCountry(i.next());
					locationList.add(location);
				}
				System.out.println("locationList loaded from CSV file");			
				return locationList;
			} finally {
				readLocation.close();
			}
		}
		
		
		// reads initial Module data from CSV file and returns a List of Modules
		public static List<Module> getModules() throws IOException {
			List<Module> moduleList = new ArrayList<Module>();
			ReadCSV readModules = new ReadCSV("module.csv");
			try {
				Integer moduleID = 1;
				Integer locationID = 1;
				while (true) {
					List<String> tuple = readModules.next();
					if (tuple == null) {
						break;
					}
					Iterator<String> i = tuple.iterator();
					Module module = new Module();
					
					Integer.parseInt(i.next());
					Integer.parseInt(i.next());
					
					module.setDataId(moduleID++);	
					module.setLocationId(locationID++);	
					module.setName(i.next());
					module.setStatus(i.next());
					moduleList.add(module);
				}
				System.out.println("moduleList loaded from CSV file");
				return moduleList;
			} finally {
				readModules.close();
			}
		}
}