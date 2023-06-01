package com.animal.main;

import com.animal.entity.*;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		
	// Demonstration of instance of or secure reference downcasting.
		if(animal1 instanceof Dog) {
			Dog dog = (Dog) animal1;
			dog.likeDogFood();
		}
		if(animal2 instanceof Cat) {
			Cat cat = (Cat) animal2;
			cat.likeCatFood();
		}
	}

}
