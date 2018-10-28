package com.hs.structural.bridge;

public class BridgePatternTest {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Car(new Produce());
		vehicle1.manufacture();
		System.out.println();
		Vehicle vehicle2 = new Bike(new Produce());
		vehicle2.manufacture();
	}
}
