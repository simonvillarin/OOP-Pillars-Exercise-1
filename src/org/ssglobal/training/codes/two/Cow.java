package org.ssglobal.training.codes.two;

public class Cow implements Animal {
	void moo() {
        System.out.println("Cow says moooooo");
    }
	
	@Override
	public void eat() {
		System.out.println("Cow is breathing");
		
	}

	@Override
	public void breathe() {
		System.out.println("Cow is breathing");
		
	}
}
