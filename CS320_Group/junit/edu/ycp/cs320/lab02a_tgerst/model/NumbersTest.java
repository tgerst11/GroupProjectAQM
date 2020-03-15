package edu.ycp.cs320.lab02a_tgerst.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_tgerst.model.Numbers;

public class NumbersTest {
	private Numbers model;
	
	@Before
	public void setUp() {
		model = new Numbers();
	}
	
	@Test
	public void testSetandGetNum1() {
		model.setNum1(5);
		assertTrue(5 == model.getNum1());
	}
	
	@Test
	public void testSetandGetNum2() {
		model.setNum2(25.6);
		assertTrue(25.6 == model.getNum2());
	}
	
	@Test
	public void testSetandGetNum3() {
		model.setNum3(69.9);
		assertTrue(69.9 == model.getNum3());
	}
	
	@Test
	public void testSetandGetResult() {
		model.setResult(1000.6);
		assertTrue(1000.6 == model.getResult());
	}
}