package org.ssglobal.training.codes.two;

public class Lion implements Animal {
	void roar() {
        System.out.println("Lion is roaring");
    }
	
	@Override
	public void eat() {
		System.out.println("Lion is breathing");
		
	}

	@Override
	public void breathe() {
		System.out.println("Lion is breathing");
		
	}
}
