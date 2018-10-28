package com.hs.creational.abstractfactory;

public class HyundaiCarFactory implements CarFactory{

	public Car createCar(String carType) {
		if("I10".equalsIgnoreCase(carType)){
			return new I10();
		}
		if("I20".equalsIgnoreCase(carType)){
			return new I20();
		}
		return null;
	}

}
