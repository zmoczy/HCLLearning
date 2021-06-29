package com.javaExcersies.JavaDay2;

public class Dog {
	String name;
	int age;
	double weight;
	
	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	public String showExcitement() {
		return name + " is wagging their tail";
	}
	public String showExcitement(int level) {
		return name + " The dog is wagging its tail at " + level + " MPH!!";
	}
}
