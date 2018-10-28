package com.hs.structural.decorator;

public class Tomatoes extends PizzaToppings {

	public Tomatoes(Pizza pizza) {
		this.pizza = pizza;
	}

	public String description() {
		return "Tomatoes";
	}

	public double cost() {
		return pizza.cost() + 1.0;
	}

}
