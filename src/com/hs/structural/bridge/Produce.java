package com.hs.structural.bridge;

class Produce implements Workshop {
	@Override
	public void work() {
		System.out.print("Produced");
	}
}
