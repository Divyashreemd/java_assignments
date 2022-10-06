package com.valtech.training.corejava.day1;

public class Dog implements Animal {

	@Override
	public void makeSound() {
		System.out.println("brak");

	}
	public static void main(String[] args) {
		Animal a= new Dog();
		a.makeSound();
	}

}
