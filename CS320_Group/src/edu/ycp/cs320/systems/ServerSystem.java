package edu.ycp.cs320.systems;

import java.util.ArrayList;

import edu.ycp.cs320.GroupAQM.model.Module;

public class ServerSystem {
	private Module module;
	
	public void setModel(Module module) {
		this.module = module;
	}
	
	public void readModulesData() {
		// TODO: Method to read module data and send to jsp
	}
	
	public String testModules() {
		return null;
		// TODO: Method to test state of modules.
	}
	
	public void storeModuleData() {
		// TODO: Method to store module data in database
	}
	
	public void validateData() {
		// TODO: Method to check to see if data is an outlier. If it is, then create an alert.
	}
	
	public void isAlert() {
		// TODO: Still don't know what this does :)
	}
	
	public ArrayList getModuleHistory() {
		return null;
		// TODO: Method that returns module readings history
	}
	
}
