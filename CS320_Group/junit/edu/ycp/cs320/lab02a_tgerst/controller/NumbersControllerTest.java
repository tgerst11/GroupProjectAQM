package edu.ycp.cs320.lab02a_tgerst.controller;

import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_tgerst.controller.NumbersController;
import edu.ycp.cs320.lab02a_tgerst.model.Numbers;

public class NumbersControllerTest {
	private Numbers model;
	private NumbersController controller;
	
	@Before
	public void setUp() {
		model = new Numbers();
		
		controller = new NumbersController();

		controller.setModel(model);
	}
	
	@Test
	public void testAddEquals() {
		model.setNum1(5.2);
		model.setNum2(10.6);
		model.setNum3(15.7);
		double sum = model.getNum1() + model.getNum2() + model.getNum3();
		System.out.println(sum);
		model.setResult(controller.add(model.getNum1(), model.getNum2(), model.getNum3()));
		System.out.println(model.getResult());
		assertTrue(sum == model.getResult());
	}
	
	@Test
	public void testMultiplyEquals() {
		model.setNum1(5.2);
		model.setNum2(10.6);
		double product = model.getNum1() * model.getNum2();
		System.out.println(product);
		model.setResult(controller.multiply(model.getNum1(), model.getNum2()));
		System.out.println(model.getResult());
		assertTrue(product == model.getResult());
	}
	
}