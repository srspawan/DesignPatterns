package com.hs.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorPatternTest {

	private static int calculatePrice(List<ItemElement> items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

	public static void main(String[] args) {
		Book book1 = new Book(20, "1234");
		Book book2 = new Book(100, "5678");
		Fruit fruit1 = new Fruit(10, 2, "Banana");
		Fruit fruit2 = new Fruit(5, 5, "Apple");
		List<ItemElement> items = new ArrayList<>();

		items.add(book1);
		items.add(fruit1);
		items.add(fruit2);
		items.add(book2);
		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}
}
