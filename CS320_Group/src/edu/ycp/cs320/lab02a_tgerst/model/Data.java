package edu.ycp.cs320.lab02a_tgerst.model;

public class Data{
	
	private float percentHumidity;
	
	private float temperature;
	
	private float airPressure;
	
	private float voc;
	
	private float altitude;
	
	public Data(float percentHumidity, float temperature, float airPressure, float voc, float altitude)
	{
		this.percentHumidity = percentHumidity;
		this.temperature = temperature;
		this.airPressure = airPressure; 
		this.voc = voc;
		this.altitude = altitude;
	}
	
	//SET
	public void setPercentHumidity(float percentHumidity) {
		this.percentHumidity = percentHumidity;
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	
	public void setAirPressure(float airPressure) {
		this.airPressure = airPressure;
	}
	
	public void setVoc(float voc) {
		this.voc = voc;
	}
	
	public void setAltitude(float altitude) {
		this.altitude = altitude;
	}
	
	//GET
	public float getpercentHumidity() {
		return percentHumidity;
	}
	
	public float gettemperature() {
		return temperature;
	}
	
	public float getairPressure() {
		return airPressure;
	}
	
	public float getvoc() {
		return voc;
	}
	
	public float getaltitude() {
		return altitude;
	}

	
	
	
}

