package com.hs.structural.adaptor;

public class SamsungCharger implements Charger{

	private String mobileName;
	
	public void setMobileName(String mobileName) {
		this.mobileName=mobileName;
	}

	public void supplyCharge() {
		System.out.println("Charging "+mobileName+"....");
	}

}
