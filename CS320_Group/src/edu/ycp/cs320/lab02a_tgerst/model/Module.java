package edu.ycp.cs320.lab02a_tgerst.model;

public class Module {

	//attributes
	private int module_id, location_id;
	private String name,status;
	private Location position;
	
	//constructor
	public Module() {

	}
	
	public void setModuleId(int module_id){
		this.module_id = module_id;
	}
	
	public void setLocationId(int location_id){
		this.location_id = location_id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setPosition(Location position) {
		this.position = position;
	}
	
	
	public int getModuleId() {
		return module_id;
	}
	
	public int getLocationId() {
		return location_id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStatus() {
		return status;
	}
	
	public Location getLocation() {
		return position;
	}
	
	public void readSensorData() {
		// TODO: Implement
	}
	
	public void testData() {
		// TODO: Implement
	}
	
}