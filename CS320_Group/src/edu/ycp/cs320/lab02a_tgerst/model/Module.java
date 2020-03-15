package edu.ycp.cs320.lab02a_tgerst.model;

public class Module {
	//attributes
	private int id;
	private String name,status;
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStatus(String status) {
		this.status = status;
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
	
	public void readSensorData() {
		// TODO: Implement
	}
	
	public void testData() {
		// TODO: Implement
	}
	
}