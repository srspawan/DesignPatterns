package com.hs.behavioral.iterator;

public class NameIterator implements Iterator {

	int index;
	public String names[] = { "Robert", "John", "Julie", "Lora" };

	public Iterator iterate() {
		return new NameIterator();
	}

	@Override
	public boolean hasNext() {
		if (index < names.length) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		if (this.hasNext()) {
			return names[index++];
		}
		return null;
	}
}