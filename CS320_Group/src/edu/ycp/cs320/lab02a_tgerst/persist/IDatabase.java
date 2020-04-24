package edu.ycp.cs320.lab02a_tgerst.persist;

import java.util.List;

import edu.ycp.cs320.lab02a_tgerst.model.Admin;
import edu.ycp.cs320.lab02a_tgerst.model.Module;


public interface IDatabase {

	List<Admin> validateCred(String username, String password);		
	
	List<Module> findAllModules();

	List<Module> findDataByModuleID(int module_id);
	
	List<Module> findDataByModuleLocation(String module_name);
}
