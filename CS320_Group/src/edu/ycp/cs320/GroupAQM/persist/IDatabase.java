package edu.ycp.cs320.GroupAQM.persist;

import java.util.List;

import edu.ycp.cs320.GroupAQM.model.Admin;
import edu.ycp.cs320.GroupAQM.model.Module;


public interface IDatabase {

	List<Admin> validateCred(String username, String password);		
	
	List<Module> findAllModules();

	List<Module> findDataByModuleID(int module_id);
	
	List<Module> findDataByModuleLocation(String module_name);
	
	int addLocation (String coordinates, String city, String state, String country);
	
	Integer insertData(String city, String coordinates, String state, String country, String ts, String temp, String pressure, String humidity, String windSpeed, String windDirection, String aqi, String mainPol);
	
	int addModule (Module mod);
}
