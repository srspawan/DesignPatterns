package com.hs.creational.abstractfactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		CarFactory hondaFactory= FactoryProducer.getCarFactory("Honda");
		
		Car brio=hondaFactory.createCar("brio");
		brio.drive();		
		Car city=hondaFactory.createCar("city");
		city.drive();
		
		CarFactory hyundaiFacotry=FactoryProducer.getCarFactory("Hyundai");
		
		Car i10=hyundaiFacotry.createCar("I10");
		i10.drive();
		Car i20 =hyundaiFacotry.createCar("I20");
		i20.drive();
	}
}
