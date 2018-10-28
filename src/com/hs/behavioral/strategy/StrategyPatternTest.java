package com.hs.behavioral.strategy;

public class StrategyPatternTest {

	public static void main(String args[]) {

		// we can provide any strategy to do the sorting
		int[] var = { 1, 2, 3, 4, 5 };
		Strategy strategy = new BubbleSort();
		Context ctx = new Context(strategy);
		ctx.sort(var);

		// we can change the strategy without changing Context class
		strategy = new QuickSort();
		ctx = new Context(strategy);
		ctx.sort(var);
	}
}
