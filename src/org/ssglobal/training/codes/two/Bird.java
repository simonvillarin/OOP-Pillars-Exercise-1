package org.ssglobal.training.codes.two;

public class Bird implements Animal {
	void chirp() {
		System.out.println("Bird is chirping");
	}

	@Override
	public void eat() {
		System.out.println("Bird is breathing");
		
	}

	@Override
	public void breathe() {
		System.out.println("Bird is breathing");
		
	}
}
