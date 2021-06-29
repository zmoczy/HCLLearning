package com.javaExcersies.JavaDay2;

public class Person {
	private String name;
	private int age;
	private double shoesize;
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
	public double getShoesize() {
		return shoesize;
	}
	public void setShoesize(double shoesize) {
		this.shoesize = shoesize;
	}
	
	private void walking() {
		System.out.println( name+ " " + age +" "+ shoesize +  " is Walking");
	}
	public void startWalking() {
		walking();
	}
}
