package com.hs.structural.adaptor;

public class AdapterPatternTest {
	public static void main(String[] args) {
		Chargeable appleCharger=new AppleCharger();
		appleCharger.setMobileName("Iphone 6");
		ChargerUtils.doCharge(appleCharger);
		
		Charger samasungCharger=new SamsungCharger();
		samasungCharger.setMobileName("Galaxy Note 4");
		
		AppleAdapter appleAdapter=new AppleAdapter();
		appleAdapter.setSamsungCharger(samasungCharger);
		ChargerUtils.doCharge(appleAdapter);
	}
}	