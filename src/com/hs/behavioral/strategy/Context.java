package com.hs.behavioral.strategy;

class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void sort(int[] input) {
		strategy.sort(input);
	}
}
