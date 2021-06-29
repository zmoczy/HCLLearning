package com.javaExcersies.JavaDay3;

public class Inheritance1 {
	 
	public static void main(String args[]) {
		Bike m = new Bike();
		
	}

}
class Cycle{
	String define_me() {
		return "a vehichle with pedals";
	}
}

class Bike extends Cycle {
	String define_me() {
		return "A cycle with an engine";
	}
	
	Bike(){
		System.out.println("Hello I am a bike I am" + define_me());
		String temp = "A vehcile with pedals";
		System.out.println("My ancestor is a cycle who is" + temp);
	
	}

}
 
