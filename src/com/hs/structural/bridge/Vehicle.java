package com.hs.structural.bridge;

public abstract class Vehicle {
	protected Workshop workShop;

	protected Vehicle(Workshop workShop) {
		this.workShop = workShop;
	}

	abstract public void manufacture();
}
