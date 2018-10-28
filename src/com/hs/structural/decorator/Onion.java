package com.hs.structural.decorator;

public class Onion extends PizzaToppings {

	public Onion(Pizza pizza) {
		this.pizza = pizza;
	}

	public String description() {
		return "Onion";
	}

	public double cost() {
		return pizza.cost() + 1.5;
	}

}
