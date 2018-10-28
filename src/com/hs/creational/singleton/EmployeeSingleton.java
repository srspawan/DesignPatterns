package com.hs.creational.singleton;

public enum EmployeeSingleton {

	INSTANCE; // added name of the (single) instance

	private int id;
	private String name;

	EmployeeSingleton() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		EmployeeSingleton.INSTANCE.setName("My singleton enum");
		System.out.println(EmployeeSingleton.INSTANCE.getName());
		EmployeeSingleton.INSTANCE.setName("My singleton enum1");
		System.out.println(EmployeeSingleton.INSTANCE.getName());
	}
}