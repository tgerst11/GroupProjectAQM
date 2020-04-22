package testLocation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_tgerst.model.Admin;
import edu.ycp.cs320.lab02a_tgerst.model.Location;

public class testLocation{
	private String coordinates;
	private String city, state, country;
	Location banana;
	
	@Before
	public void setUp() {
		
		coordinates = "[-118.2417,34.0669]";
		city = "Harrisburg";
		state = "PA";
		country = "USA";
		//1|[-118.2417,34.0669]|Harrisburg|PA|USA

		banana = new Location();
		
		banana.setCoordinates(coordinates);
		banana.setCity(city);
		banana.setCountry(country);
	}
	
	@Test
	public void testCoordinates() {
		//System.out.println(password);
		assertEquals(banana.getCoordinates(), coordinates);
		
	}
	
	@Test
	public void testCity() {
		//System.out.println(username);
		assertEquals(banana.getCity(), city);
		
	}
	
	@Test
	public void testCountry() {
		//System.out.println(email);
		assertEquals(banana.getCountry(), country);
	
	}
	
}


