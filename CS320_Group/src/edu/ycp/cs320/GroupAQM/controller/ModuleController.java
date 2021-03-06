package edu.ycp.cs320.GroupAQM.controller;


import edu.ycp.cs320.GroupAQM.model.Module;
import edu.ycp.cs320.GroupAQM.persist.DatabaseProvider;
import edu.ycp.cs320.GroupAQM.persist.DerbyDatabase;
import edu.ycp.cs320.GroupAQM.persist.IDatabase;

import java.util.List;

public class ModuleController {
	//create a module model
	private Module model;
	
	private IDatabase db    = null;

	public ModuleController() {
		// creating DB instance here
		DatabaseProvider.setInstance(new DerbyDatabase());
		db = DatabaseProvider.getInstance();		
	}
	
	public List<Module> getModuleData (String module_name){
		IDatabase db = DatabaseProvider.getInstance();
		List<Module> moduleList = db.findDataByModuleLocation(module_name);
		
		// check if anything was returned and output the list
		if (moduleList.isEmpty()) {
			System.out.println("There are no modules in the database");
		}
		else {
			//returns all data, adds to moduleList, and prints data for specified module. Used for moduleData page.
			for (Module module : moduleList) {
				module.setTimeAndDate(module.getTimeStamp());
				//Testing: System.out.println(module.getAQI() +","+ module.getHumidity() +","+ module.getMainPol() +","+ module.getPressure() +","+ module.getTemp() +","+ module.getWindDir() +","+ module.getWindSpeed());
			}
		}
		return moduleList;
	}
	
	public List<Module> getAllModules(){
		IDatabase db = DatabaseProvider.getInstance();
		List<Module> modules = db.findAllModules();
		
		if(modules.isEmpty()) {
			System.out.println("No modules in the database");
		}
		else {
			//adds all modules to list, prints out name, and returns all modules in db. Used for homePage. 
			for (Module module : modules) {
				System.out.println(module.getName());
			}
		}
		return modules;
		
	}
	
	public void addData(Module mod) { //Adds data within module parameter to db.
		IDatabase db = DatabaseProvider.getInstance();
		int status = db.insertData(mod.getCity(), mod.getCoordinates(), mod.getState(), mod.getCountry(), mod.getTimeStamp(), mod.getTemp(), mod.getPressure(), mod.getHumidity(), mod.getWindSpeed(), mod.getWindDir(), mod.getAQI(), mod.getMainPol());
		if (status != 0) {
			System.out.println("New module data added successfully!");
		}
		else {
			System.out.println("New module data FAILED!");
		}
	}
	
	//miscellaneous methods that are used to display data on webpage
	public String aqiMessage(String AQI) {//returns appropriate message based on given AQI
		int aqi=0;
		String message = null;
		try {
			aqi = Integer.parseInt(AQI);
		}
		catch (NumberFormatException e) {
			System.out.println("This string can't be converted to an integer");
		}
		
		if (aqi >=0 && aqi <=50) {
			message = "Air Quality is satisfactory and air pollution poses little or no risk to the public.";
		}
		else if (aqi>= 51 && aqi <=100) {
			message = "Air quality is acceptable. There may be a risk for those who are sensitive.";
		}
		else if (aqi >=101 && aqi <= 150) {
			message = "Members of sensitive groups may experience health effects. The general public is less likely to be affected";
		}
		else if (aqi>= 151 && aqi <=200) {
			message = "Members of sensitive groups may experience more serious health effects";
		}
		else if(aqi >= 201 && aqi <=300) {
			message = "Health alert: The risk of health effects is increased for everyone. Take caution!";
		}
		else {
			message = "Health warning of emergency conditions: everyone must take caution";
		}
		return message;
	}
	
	public String mainPol (String mainPol) {//returns appropriate method based on given main pollutant param.
		String mainpol=null;
		if (mainPol.equals("p1")) {
			mainpol = "Main pollutant is PM10. This includes particulate matter of 10 microns.";
		}
		if (mainPol.equals("p2")){
			mainpol ="Main pollutant is PM2.5. This includes particulate matter of 2.5 microns.";
		}
		if (mainPol.equals("o3")){
			mainpol ="Main pollutant is Ozone (O3).";
		}
		if (mainPol.equals("n2")){
			mainpol ="Main pollutant is Nitrogen Dioxide (NO2).";
		}
		if (mainPol.equals("s2")){
			mainpol ="Main pollutant is Sulfur Dioxide (SO2).";
		}
		if (mainPol.equals("co")){
			mainpol ="Main pollutant is Carbon Monoxide (CO).";
		}
		return mainpol;
	}
	
	public void addModule(Module mod) { //adds a new module to the database. Used on addModule page for admin.
		IDatabase db = DatabaseProvider.getInstance();
		int status = db.addModule(mod);
		if (status != 0) {
			System.out.println("New module data added successfully!");
		}
	}
	
}
