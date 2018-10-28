package com.hs.structural.decorator;

public class PlanePizza implements Pizza {

	public String description() {
		return "Pan pizza";
	}

	public double cost() {
		return 10.0;
	}
}
