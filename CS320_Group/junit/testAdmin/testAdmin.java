package testAdmin;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_tgerst.model.Admin;

public class testAdmin{
	private Admin user;
	private String password, username,email;
	
	@Before
	public void setUp() {
		
		username = "johnsmith";
		password = "oranges44";
		email    = "jsmith@ycp.edu";
		
		user = new Admin(username, password, email);	
	}
	
	@Test
	public void testPassword() {
		System.out.println(password);
		assertEquals(user.getPassword(), password);
		
	}
	
	@Test
	public void testUsername() {
		System.out.println(username);
		assertEquals(user.getUsername() , username);
		
	}
	
	@Test
	public void testEmail() {
		System.out.println(email);
		assertEquals(user.getEmail(), email);
	
	}
	
}


