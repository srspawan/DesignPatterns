package com.hs.behavioral.observer;

public class Customer implements Observer {

	private String customerName;
	
	public void update(String productName) {
		System.out.println("Hello! "+customerName+", "+productName+" is now available on amazon");
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
