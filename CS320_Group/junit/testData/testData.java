package testData;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_tgerst.model.Data;

public class testData {
	
	private Data banana;
	private float percentHumidity;
	private float temperature;
	private float airPressure;
	private float voc;
	private float altitude;
	
	@Before
	public void setUp() {
		percentHumidity = 66.0F;
		temperature = 25.7f;
		airPressure = 88.1F;
		voc = 103.4f;
		altitude = 12.3F;
		
		banana = new Data();
	}

	@Test
	public void testPercentHumidity() {
		assertEquals(banana.getPercentHumidity(), percentHumidity, 0);
	}
	
	@Test
	public void testTemperature() {
		assertEquals(banana.getTemperature(), temperature, 0);
	}
	
	@Test
	public void testAirPressure() {
		assertEquals(banana.getAirPressure(), airPressure, 0);
	}	
	
	@Test
	public void testVoc() {
		assertEquals(banana.getVOC(), voc, 0);
	}
	
	@Test
	public void testAltitude() {
		assertEquals(banana.getAltitude(), altitude, 0);	
	}
	
}