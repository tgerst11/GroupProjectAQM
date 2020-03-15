package edu.ycp.cs320.lab02a_tgerst.model;

public class Module {

	//attributes
	private int id;
	private String name,status;
	private Location position;
	
	//constructor
	public Module(int id, String name, String status, Location position) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.position = position;
	  }
	
	public void setId(int id){
		this.id = id;
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
	
	
	public int getId() {
		return id;
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