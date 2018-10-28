package com.hs.structural.adaptor;

public class AppleCharger implements Chargeable {

	private String mobileName;
	
	public void setMobileName(String mobileName) {
		this.mobileName=mobileName;
	}

	public void charge() {
		System.out.println("Charging "+mobileName+".....");
	}
}
