package com.javaExcersies.JavaDay3;

public class inheritance2 {
public static void main(String[] args) {
	Dog dog = new Dog();
	dog.walk();
	dog.eat();
	dog.bark();
	}
}

class Animal{
	void walk() {
		System.out.println("I am walking");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("I am eating");
	}
	void bark() {
		System.out.println("I am Barking");
	}
}