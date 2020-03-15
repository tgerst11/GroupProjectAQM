package testModule;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_tgerst.model.Module;

public class testModule {
	private Module banana;
	private int id;
	private String name,status;
	
	
	
	@Before
	public void setUp() {
		banana = new Module();

		id = 7;
		name = "emusk";
		status = "Corona time";

		banana.setId(id);
		banana.setName(name);
		banana.setStatus(status);
	}

	@Test
	public void testSetId() {
		assertEquals(banana.getId(), id);
		assertEquals(banana.getName(), name);
		assertEquals(banana.getStatus(), status);
	}
}