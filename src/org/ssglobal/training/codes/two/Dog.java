package org.ssglobal.training.codes.two;

public class Dog implements Animal {
	void bark() {
		System.out.println("Dog is barking");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog is breathing");
		
	}

	@Override
	public void breathe() {
		System.out.println("Dog is breathing");
		
	}
}
