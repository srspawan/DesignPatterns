package com.hs.creational.abstractfactory;

public class FactoryProducer {

	public static CarFactory getCarFactory(String carFactoryType){
		if("Hyundai".equalsIgnoreCase(carFactoryType)){
			return new HyundaiCarFactory();
		}
		if("Honda".equalsIgnoreCase(carFactoryType)){
			return new HondaCarFactory();
		}
		return null;
	}
}
