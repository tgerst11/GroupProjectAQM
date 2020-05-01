package edu.ycp.cs320.GroupAQM.model;

import java.sql.Timestamp;

public class Module {

	//attributes
	private int data_id, location_id;
	//need to implement a status
	private String status, name;
	private String coordinates, windSpeed, windDir, humidity,pressure, AQI, temp, city, state, country, mainPol;
	//private java.sql.Timestamp time;
	private String timestamp, time, date;
	
	//constructor
	public Module() {

	}
	
	//Module id. Is this needed?
	public void setDataId(Integer data_id){
		this.data_id = data_id;
	}
	
	public int getDataId() {
		return data_id;
	}
	
	public void setLocationId(int location_id){
		this.location_id = location_id;
	}
	public int getLocationId() {
		return location_id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//City
	public void setCity(Object city) {
		this.city = (String) city;
	}
	
	public String getCity() {
		return city;
	}
	
	//state
	public void setState(Object state) {
		this.state=(String) state;
	}
	public String getState() {
		return state;
	}
	
	//Country
	public void setCountry(Object country) {
		this.country= (String) country;
	}
	public String getCountry() {
		return country;
	}
	
	//Main Pollutant
	public void setMainPol(Object mainPol) {
		this.mainPol= (String) mainPol;
	}
	public String getMainPol() {
		return mainPol;
	}

	//status... is this a boolean or a String?
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	
	//temperature
	public void setTemperature(Object temp) {
		this.temp = (String) temp;
	}
	public String getTemp() {
		return temp;
	}
	
	//AQI
	public void setAQI(Object aqi) {
		this.AQI = (String) aqi;
	}
	public String getAQI() {
		return AQI;
	}
	
	//Atmospheric Pressure
	public void setPressure(Object pressure) {
		this.pressure = (String) pressure;
	}
	public String getPressure() {
		return pressure;
	}
	
	//humidity
	public void setHumidity(Object humidity) {
		this.humidity = (String) humidity;
	}
	public String getHumidity() {
		return humidity;
	}
	
	//wind direction
	public void setWindDir(Object windDir) {
		this.windDir = (String) windDir;
	}
	public String getWindDir() {
		return windDir;
	}
	
	//timestamp
	public void setTimeStamp(String timeStamp) {
		this.timestamp = timeStamp;
	}
	
	public String getTimeStamp() {
		return timestamp;
	}
	
	public void setTimeAndDate(String timeStamp){
		int i = 0;
		int charAt = 0;
		char c;
		String date;
		
		while(charAt == 0) {
			c = timeStamp.charAt(i);
			
			if(c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '9' && c != '0' && c != '-')
			{
				charAt = i;
			}
			
			i++;
		}
		
		this.date = timeStamp.substring(0, charAt);
		this.time = timeStamp.substring(charAt + 1, timeStamp.length() - 1);
	}
	
	public String getDate() {
		return date;
	}
	
	public String getTime() {
		return time;
	}
	
	//coordinates
	public void setCoordinates(Object coordinates) {
		this.coordinates = (String) coordinates;
	}
	
	public String getCoordinates() {
		return coordinates;
	}
	
	//windSpeed
	public void setWindSpeed(Object windSpeed) {
		this.windSpeed = (String) windSpeed;
	}
	public String getWindSpeed() {
		return windSpeed;
	}
	
}