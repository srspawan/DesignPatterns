package com.hs.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
	
	private String productName;
	private List<Observer> listOfObservers=new ArrayList<Observer>();
	private boolean isAvailable=false;
	
	public void registerObserver(Observer observer) {
		listOfObservers.add(observer);
	}

	public void removeObserver(Observer observer) {
		listOfObservers.remove(observer);
	}

	public void notifyObservers() {
		System.out.println("notifying all the registered customer, when the product is avaliable");
		for(Observer observer:listOfObservers){
			observer.update(productName);
		}
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Observer> getListOfObservers() {
		return listOfObservers;
	}

	public void setListOfObservers(List<Observer> listOfObservers) {
		this.listOfObservers = listOfObservers;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
		if(isAvailable==true){
			notifyObservers();
		}
	}

	
}
