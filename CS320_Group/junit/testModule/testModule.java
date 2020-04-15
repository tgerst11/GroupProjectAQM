package testModule;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_tgerst.model.Location;
import edu.ycp.cs320.lab02a_tgerst.model.Module;

public class testModule {
	private Module banana;
	private int id;
	private String name,status;
	private Location position;
	private double longitude, latitude;
	private String horizontalDirection, verticalDirection;
	
	@Before
	public void setUp() {
		
		id = 7;
		name = "emusk";
		status = "Corona time";
		
		longitude = 66.666;
		latitude = 444.4444;
		horizontalDirection = "E";
		verticalDirection = "N";

		position = new Location();
		banana = new Module();
	}

	@Test
	public void testModuleId() {
		assertEquals(banana.getModuleId(), id);

	}
	
	@Test
	public void testName() {
		assertEquals(banana.getName(), name);
		
	}
	
	@Test
	public void testStatus() {
		assertEquals(banana.getStatus(), status);
		
	}	
	
	@Test
	public void testPosition() {
		assertEquals(banana.getLocation(), position);
		
	}
	
	@Test
	public void testLatitude() {
		assertTrue(banana.getLocation().getLatitude() == latitude);

		
	}
	
	@Test
	public void testLongitude() {
		assertTrue(banana.getLocation().getLongitude() == longitude);

		
	}
	
	@Test
	public void testHorizontalDirection() {
		assertEquals(banana.getLocation().getHorizontalDirection(), horizontalDirection);

		
	}
	
	
	@Test
	public void tetVerticalDirection() {
		assertEquals(banana.getLocation().getVerticalDirection(), verticalDirection);

		
	}
	
}