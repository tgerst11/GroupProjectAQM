package edu.ycp.cs320.lab02a_tgerst.controller;


import edu.ycp.cs320.lab02a_tgerst.model.Numbers;

public class NumbersController {
	//create a Numbers model
	private Numbers model;
	
	public void setModel(Numbers model) {
		//create the model
		this.model = model;
	}
	
	public double add(Double first, Double second, Double third) {
		//add the numbers together
		return first + second + third;
	}
	
	public double multiply(Double first, Double second) {
		//multiply the numbers together
		return first * second;
	}
	
}
