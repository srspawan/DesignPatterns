package com.hs.behavioral.iterator;

public class IteratorPatternTest {
	public static void main(String[] args) {
		NameIterator iterator = new NameIterator();

		Iterator iter = iterator.iterate();
		while (iter.hasNext()) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}