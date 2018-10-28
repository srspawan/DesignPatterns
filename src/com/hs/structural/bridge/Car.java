package com.hs.structural.bridge;

class Car extends Vehicle {
	public Car(Workshop workShop) {
		super(workShop);
	}

	@Override
	public void manufacture() {
		System.out.print("Car ");
		workShop.work();
	}
}
