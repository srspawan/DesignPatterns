package com.hs.structural.decorator;

public class DecoratorPatternTest {
	public static void main(String[] args) {
		Pizza panPizza = new PlanePizza();
		panPizza = new Tomatoes(panPizza);
		panPizza = new Onion(panPizza);
		panPizza = new Cheese(panPizza);

		System.out.println("you have orderd pan pizza");
		System.out.println("its cost is " + panPizza.cost());
	}
}
