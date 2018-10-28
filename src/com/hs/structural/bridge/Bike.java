package com.hs.structural.bridge;

class Bike extends Vehicle {
	public Bike(Workshop workShop) {
		super(workShop);
	}

	@Override
	public void manufacture() {
		System.out.print("Bike ");
		workShop.work();
	}
}