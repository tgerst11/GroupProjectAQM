package edu.ycp.cs320.lab02a_tgerst.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.ycp.cs320.lab02a_tgerst.model.Admin;
import edu.ycp.cs320.lab02a_tgerst.model.Data;
import edu.ycp.cs320.lab02a_tgerst.model.Location;
import edu.ycp.cs320.lab02a_tgerst.model.Module;


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
		public static List<Data> getData() throws IOException {
			List<Data> dataList = new ArrayList<Data>();
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
					Data data = new Data();
					
					// auto-generate Data ID, instead
					Integer.parseInt(i.next());
					data.setDataID(dataID++);
					
					data.setTime(i.next());
					data.setPercentHumidity(Float.parseFloat(i.next()));
					data.setTemperature(Float.parseFloat(i.next()));
					data.setAirPressure(Float.parseFloat(i.next()));
					data.setVOC(Float.parseFloat(i.next()));
					data.setModuleID(Integer.parseInt(i.next()));
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
					
					location.setLatitude(Double.parseDouble(i.next()));
					location.setLongitude(Double.parseDouble(i.next()));
					location.setVerticalDirection(i.next());
					location.setHorizontalDirection(i.next());
					location.setModuleID(Integer.parseInt(i.next()));
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
				while (true) {
					List<String> tuple = readModules.next();
					if (tuple == null) {
						break;
					}
					Iterator<String> i = tuple.iterator();
					Module module = new Module();

					module.setModuleId(Integer.parseInt(i.next()));	
					module.setCoordinates(Integer.parseInt(i.next()));	
					module.setCity(i.next());
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