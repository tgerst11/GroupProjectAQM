package edu.ycp.cs320.lab02a_tgerst.model;

public class Module {

	//attributes
	private int module_id;
	//need to implement a status
	private String status;
	private Object coordinates, timestamp, windSpeed, windDir, humidity,pressure, AQI, temp, city, state, country, mainPol;
	
	//constructor
	public Module() {

	}
	
	//Module id. Is this needed?
	public void setModuleId(int module_id){
		this.module_id = module_id;
	}
	public int getModuleId() {
		return module_id;
	}
	
	//City
	public void setCity(Object city) {
		this.city = city;
	}
	
	public Object getCity() {
		return city;
	}
	
	//state
	public void setState(Object state) {
		this.state=state;
	}
	public Object getState() {
		return state;
	}
	
	//Country
	public void setCountry(Object country) {
		this.country= country;
	}
	public Object getCountry() {
		return country;
	}
	
	//Main Pollutant
	public void setMainPol(Object mainPol) {
		this.mainPol= mainPol;
	}
	public Object getMainPol() {
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
		this.temp = temp;
	}
	public Object getTemp() {
		return temp;
	}
	
	//AQI
	public void setAQI(Object aqi) {
		this.AQI = aqi;
	}
	public Object getAQI() {
		return AQI;
	}
	
	//Atmospheric Pressure
	public void setPressure(Object pressure) {
		this.pressure = pressure;
	}
	public Object getPressure() {
		return pressure;
	}
	
	//humidity
	public void setHumidity(Object humidity) {
		this.humidity = humidity;
	}
	public Object getHumidity() {
		return humidity;
	}
	
	//wind direction
	public void setWindDir(Object windDir) {
		this.windDir = windDir;
	}
	public Object getWindDir() {
		return windDir;
	}
	
	//timestamp
	public void setTime(Object timeStamp) {
		this.timestamp = timeStamp;
	}
	
	public Object getTime() {
		return timestamp;
	}
	
	//coordinates
	public void setCoordinates(Object coordinates) {
		this.coordinates = coordinates;
	}
	
	public Object getCoordinates() {
		return coordinates;
	}
	
	//windSpeed
	public void setWindSpeed(Object windSpeed) {
		this.windSpeed = windSpeed;
	}
	public Object getWindSpeed() {
		return windSpeed;
	}
	
	
	//supplemental from UML diagram. Still needed?

	public void readSensorData() {
		// TODO: Implement
	}
	
	public void testData() {
		// TODO: Implement
	}
	
}