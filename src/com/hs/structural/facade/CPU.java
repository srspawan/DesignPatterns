package com.hs.structural.facade;

class CPU {
	public void freeze() {
		System.out.println("freezes");
	}

	public void jump(long position) {
		System.out.println("jump");
	}

	public void execute() {
		System.out.println("execute");
	}
}