package edu.ycp.cs320.lab02a_tgerst.model;


public class Location{
	
	private double longitude, latitude;
	private String horizontalDirection, verticalDirection;
	private int module_id, location_id;
	
	public Location() {

	  }
	

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public void setHorizontalDirection(String horizontalDirection) {
		this.horizontalDirection = horizontalDirection;
	}
	
	public void setVerticalDirection(String verticalDirection) {
		this.verticalDirection = verticalDirection;
	}
	
	public void setModuleID(int module_id) {
		this.module_id = module_id;
	}
	
	public void setLocationID(int location_id) {
		this.location_id = location_id;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public String getHorizontalDirection() {
		return horizontalDirection;
	}
	
	public String getVerticalDirection() {
		return verticalDirection;
	}
	
	public int getModuleID() {
		return module_id;
	}
	
	public int getLocationID() {
		return location_id;
	}
}