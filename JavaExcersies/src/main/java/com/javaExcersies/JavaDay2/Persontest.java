package com.javaExcersies.JavaDay2;

public class Persontest {
	public static void main(String[] args) {
		Person test = new Person();
		//test.name will not work must use setter
		test.setName("zach");
		test.setAge(22);
		test.setShoesize(11.5);
		//test.walking() will not work must use start walking
		test.startWalking();
		
	}

}
