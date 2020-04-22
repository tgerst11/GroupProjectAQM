package testModule;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_tgerst.apiConnection.apiParseData;
import edu.ycp.cs320.lab02a_tgerst.model.Location;
import edu.ycp.cs320.lab02a_tgerst.model.Module;

public class testModule {
		
		private String status, name;
		private String coordinates, windSpeed, windDir, humidity,pressure, AQI, temp, city, state, country, mainPol;
		//private java.sql.Timestamp time;
		private String time;
		private Module banana; 
	
	@Before
	public void setUp() {
		
		/*
		id = 7;
		loc = 2;
		name = "emusk";
		status = "Corona time";
		position = new Location();
		*/
		
		status = "Corona time";
		coordinates = "-118.2417";
		time = "1400";
		windSpeed = "1.79";
		windDir = "212";
		humidity = "72";
		pressure = "1017";
		AQI = "32";
		temp = "12";
		city = "Los Angeles";
		state = "California";
		country = "USA";
		mainPol = "p2";
		
		banana = new Module();
		
		//banana.setLocationId(loc);
		//banana.setName(name);
		//banana.setPosition(position);
		
		banana.setStatus(status);
		banana.setAQI(AQI);
		banana.setCity(city);
		banana.setCoordinates(coordinates);
		banana.setHumidity(humidity);
		banana.setMainPol(mainPol);
		banana.setPressure(pressure);
		banana.setState(state);
		banana.setStatus(status);
		banana.setTemperature(temp);
		banana.setTime(time);
		banana.setWindDir(windDir);
		banana.setWindSpeed(windSpeed);
		banana.setCountry(country);
	}
	
	@Test
	public void testAQI() {
		assertEquals(banana.getAQI(), AQI);	
	}
	
	@Test
	public void testCity() {
		assertEquals(banana.getCity(), city);
	}
	
	@Test
	public void testCoordinates() {
		assertEquals(banana.getCoordinates(), coordinates);
	}
	
	@Test
	public void testHumidity() {
		assertEquals(banana.getHumidity(), humidity);
	}
	
	@Test
	public void testMainPol() {
		assertEquals(banana.getMainPol(), mainPol);
	}
	
	@Test
	public void testPressure() {
		assertEquals(banana.getPressure(), pressure);
	}
	
	@Test
	public void testState() {
		assertEquals(banana.getState(), state);
	}
	
	@Test
	public void testCountry() {
		assertEquals(banana.getCountry(), country);
	}
	
	@Test
	public void testStatus() {
		assertEquals(banana.getStatus(), status);
	}
	
	@Test
	public void testTemp() {
		assertEquals(banana.getTemp(), temp);
	}
	
	@Test
	public void testTime() {
		assertEquals(banana.getTime(), time);
	}
	
	@Test
	public void testWindDirection() {
		assertEquals(banana.getWindDir(), windDir);
	}
	
	@Test
	public void testWindSpeed() {
		assertEquals(banana.getWindSpeed(), windSpeed);
	}
	
	/*
	
	//attributes
	private int data_id, location_id;
	//need to implement a status
	private String status, name;
	private String coordinates, windSpeed, windDir, humidity,pressure, AQI, temp, city, state, country, mainPol;
	//private java.sql.Timestamp time;
	private String time;
	
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
	public void setTime(String timeStamp) {
		this.time = timeStamp;
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
	
	
	 */
}