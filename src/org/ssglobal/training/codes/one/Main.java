package org.ssglobal.training.codes.one;

public class Main {
	public static void main (String[] args) {
		Cat cat = new Cat();
		cat.eat();
		cat.breathe();
		cat.meow();
		
		Dog dog = new Dog();
		dog.eat();
		dog.breathe();
		dog.bark();
		
		Bird bird = new Bird();
		bird.eat();
		bird.breathe();
		bird.chirp();
		
		Cow cow = new Cow();
		cow.eat();
		cow.breathe();
		cow.moo();
		
		Lion lion = new Lion();
		lion.eat();
		lion.breathe();
		lion.roar();
	}
}
