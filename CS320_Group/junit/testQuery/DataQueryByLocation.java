package testQuery;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.ycp.cs320.GroupAQM.model.Module;
import edu.ycp.cs320.GroupAQM.persist.DatabaseProvider;
import edu.ycp.cs320.GroupAQM.persist.DerbyDatabase;
import edu.ycp.cs320.GroupAQM.persist.IDatabase;

public class DataQueryByLocation {

	private IDatabase db = null;
	
	List<Module> moduleList = null;
	
	ArrayList<Module> module;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// creating DB instance here
		DatabaseProvider.setInstance(new DerbyDatabase());
		db = DatabaseProvider.getInstance();		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDataQueryByModuleID() {
		System.out.println("\n*** Testing dataQueryByModuleID ***");
		
		int module_id = 2;

		// get the list of (Author, Book) pairs from DB
		moduleList = db.findDataByModuleID(module_id);
		
		// NOTE: this is a simple test to check if no results were found in the DB
		if (moduleList.isEmpty()) {
			System.out.println("No information was found by query");
			fail("No information was found");
		}
		// NOTE: assembling the results into Author and Book lists so that they could be
		//       inspected for correct content - well-formed objects with correct content
		else {			
			module = new ArrayList<Module>();
			for (Module moduleCheck : moduleList) {
				System.out.println(moduleCheck.getAQI() +","+ moduleCheck.getHumidity() +","+ moduleCheck.getMainPol() +","+ moduleCheck.getPressure() +","+ moduleCheck.getTemp() +","+ moduleCheck.getWindDir() +","+ moduleCheck.getWindSpeed());
			}			
		}
	}
}