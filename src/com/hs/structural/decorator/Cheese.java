package com.hs.structural.decorator;

public class Cheese extends PizzaToppings {

	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}

	public String description() {
		return "Cheese";
	}

	public double cost() {
		return pizza.cost() + 2.5;
	}

}
