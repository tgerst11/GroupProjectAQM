package testModule;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_tgerst.model.Location;
import edu.ycp.cs320.lab02a_tgerst.model.Module;

public class testModule {
	private Module banana;
	private int id, loc;
	private String name,status;
	private Location position;
	
	@Before
	public void setUp() {
		
		id = 7;
		loc = 2;
		name = "emusk";
		status = "Corona time";
		position = new Location();
		banana = new Module();
		
		banana.setLocationId(loc);
		banana.setModuleId( id);
		banana.setName(name);
		banana.setPosition(position);
		banana.setStatus(status);
	}

	@Test
	public void testModuleId() {
		assertEquals(banana.getModuleId(), id);

	}
	
	@Test
	public void testLocationId() {
		assertEquals(banana.getLocationId(), loc);

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
}