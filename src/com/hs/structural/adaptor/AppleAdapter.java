package com.hs.structural.adaptor;

public class AppleAdapter implements Chargeable{
	Charger samsungCharger;

	
	public void setMobileName(String mobileName) {
		// keept it empty
	}
	
	public void charge() {
		samsungCharger.supplyCharge();
	}

	public Charger getSamsungCharger() {
		return samsungCharger;
	}

	public void setSamsungCharger(Charger samsungCharger) {
		this.samsungCharger = samsungCharger;
	}
	
}
