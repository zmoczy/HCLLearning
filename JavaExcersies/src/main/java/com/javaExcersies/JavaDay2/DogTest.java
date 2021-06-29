package com.javaExcersies.JavaDay2;

public class DogTest {
	public static void main(String[] args) {
		Dog dg1 = new Dog("Fido", 3, 65.8);
		Dog dg2 = new Dog("Beau", 8, 100.2);
		
		System.out.println(dg1.showExcitement(4));
		System.out.println(dg2.showExcitement());
	}

}
