package edu.ycp.cs320.lab02a_tgerst.model;


public class Location{
	
	private double longitude, latitude;
	private char horizontalDirection, verticalDirection;
	
	
	
	
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public void setHorizontalDirection(char horizontalDirection) {
		this.horizontalDirection = horizontalDirection;
	}
	
	public void setVerticalDirection(char verticalDirection) {
		this.verticalDirection = verticalDirection;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public char getHorizontalDirection() {
		return horizontalDirection;
	}
	
	public char getVerticalDirection() {
		return verticalDirection;
	}
	
	
	
	
	
}