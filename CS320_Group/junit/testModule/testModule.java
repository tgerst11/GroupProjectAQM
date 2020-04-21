package testModule;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_tgerst.apiConnection.apiParseData;
import edu.ycp.cs320.lab02a_tgerst.model.Location;
import edu.ycp.cs320.lab02a_tgerst.model.Module;

public class testModule {
	private Module banana;
	private int id, loc;
	private String name,status;
	//private Location position;
	private Object coordinates, timestamp, windSpeed, windDir, humidity,pressure, AQI, temp, city, state, country, mainPol;
	
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
		coordinates = -118.2417;
		timestamp = 1400;
		windSpeed = 1.79;
		windDir = 212;
		humidity = 72;
		pressure = 1017;
		AQI = 32;
		temp = 12;
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
		banana.setTime(timestamp);
		banana.setWindDir(windDir);
		banana.setWindSpeed(windSpeed);
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
		assertEquals(banana.getTime(), timestamp);
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
	@Test
	public void testLocationId() {
		assertEquals(banana.getLocationId(), loc);

	}
	
	@Test
	public void testName() {
		assertEquals(banana.getName(), name);
		
	}
	
	@Test
	public void testPosition() {
		assertEquals(banana.getLocation(), position);
		
	}
	
	 */
}