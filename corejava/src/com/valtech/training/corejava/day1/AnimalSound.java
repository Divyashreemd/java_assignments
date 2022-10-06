package com.valtech.training.corejava.day1;

public class AnimalSound {

	
	
	public void distrub(Animal a) {
		a.makeSound();
	}
	
	public static void main(String[] args) {
		AnimalSound as = new AnimalSound();
		as.distrub(new Dog());
		as.distrub(new Cat());
	}
}



