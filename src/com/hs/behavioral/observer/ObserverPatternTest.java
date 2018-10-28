package com.hs.behavioral.observer;

public class ObserverPatternTest {
	public static void main(String[] args) {
		Customer customer1=new Customer();
		customer1.setCustomerName("Hareram");
		
		Customer customer2=new Customer();
		customer2.setCustomerName("Raghu");
		
		Product iphone6=new Product();
		iphone6.setProductName("Apple Iphone 6");
		iphone6.setAvailable(false);
		
		iphone6.registerObserver(customer1);
		iphone6.registerObserver(customer2);
		
		// after some time when product is avalaible
		iphone6.setAvailable(true);
	}
}
