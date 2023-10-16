package org.ssglobal.training.codes.two;

public class Cat implements Animal {
	void meow() {
		System.out.println("Cat is meowing");
	}

	@Override
	public void eat() {
		System.out.println("Cat is breathing");
		
	}

	@Override
	public void breathe() {
		System.out.println("Cat is breathing");
		
	}
}
