package testData;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.GroupAQM.model.Data;

public class testData {
	
	private Data banana;
	private float percentHumidity;
	private float temperature;
	private float airPressure;
	private float voc;
	private float altitude;
	
	@Before
	public void setUp() {
		percentHumidity = (float) 66.0;
		temperature = (float) 25.7;
		airPressure = (float) 88.1;
		voc = (float) 103.4;
		altitude = (float) 12.3;
		
		
		banana = new Data();
		
		banana.setPercentHumidity(percentHumidity);
		banana.setTemperature(temperature);
		banana.setAirPressure(airPressure);
		banana.setVOC(voc);
		banana.setAltitude(altitude);
		
	}

	
	@Test
	public void testPercentHumidity() {
		assertEquals(banana.getPercentHumidity(), percentHumidity,0);
		System.out.println("\n");
		System.out.println("Humidity");
		System.out.println("_________");
		System.out.println("Getter: " + banana.getPercentHumidity());
		System.out.println("Actual: " + percentHumidity);
	}
	

	@Test
	public void testTemperature() {
		assertEquals(banana.getTemperature(), temperature,0);
		System.out.println("\n");
		System.out.println("Temperature");
		System.out.println("_________");
		System.out.println("Getter: " + banana.getTemperature());
		System.out.println("Actual: " + temperature);
	}
	
	
	@Test
	public void testAirPressure() {
		assertEquals(banana.getAirPressure(), airPressure,0);
		System.out.println("\n");
		System.out.println("AirPressure");
		System.out.println("_________");
		System.out.println("Getter: " + banana.getAirPressure());
		System.out.println("Actual: " + airPressure);
	}	
	

	@Test
	public void testVoc() {
		assertEquals(banana.getVOC(), voc,0);
		System.out.println("\n");
		System.out.println("VOCs");
		System.out.println("_________");
		System.out.println("Getter: " + banana.getVOC());
		System.out.println("Actual: " + voc);
	}
	

	@Test
	public void testAltitude() {
		assertEquals(banana.getAltitude(), altitude,0 );
		System.out.println("\n");
		System.out.println("Altitude");
		System.out.println("_________");
		System.out.println("Getter: " + banana.getAltitude());
		System.out.println("Actual: " + altitude);
	}
	
}