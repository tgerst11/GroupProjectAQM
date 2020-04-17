package edu.ycp.cs320.lab02a_tgerst.model;

public class Data{
	
	private int data_id;
	
	private float percentHumidity;
	
	private float temperature;
	
	private float airPressure;
	
	private float voc;
	
	private float altitude;
	
	private String time;
	
	private int module_id;
	
	public Data(){}
	
	//SET
	public void setModuleID(int module_id) {
		this.module_id = module_id;
	}
	
	public void setDataID(int data_id) {
		this.data_id = data_id;
	}
	
	public void setPercentHumidity(float percentHumidity) {
		this.percentHumidity = percentHumidity;
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	
	public void setAirPressure(float airPressure) {
		this.airPressure = airPressure;
	}
	
	public void setVOC(float voc) {
		this.voc = voc;
	}
	
	public void setAltitude(float altitude) {
		this.altitude = altitude;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	//GET
	public float getPercentHumidity() {
		return percentHumidity;
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getAirPressure() {
		return airPressure;
	}
	
	public float getVOC() {
		return voc;
	}
	
	public float getAltitude() {
		return altitude;
	}
	
	public String getTime() {
		return time;
	}

	public int getDataID() {
		return data_id;
	}
	
	public int getModuleID() {
		return module_id;
	}
}

