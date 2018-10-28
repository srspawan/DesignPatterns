package com.hs.creational.abstractfactory;

public class HondaCarFactory implements CarFactory{

	public Car createCar(String carType) {
		if("Brio".equalsIgnoreCase(carType)){
			return new Brio();
		}
		if("City".equalsIgnoreCase(carType)){
			return new City();
		}
		return null;
	}

}
