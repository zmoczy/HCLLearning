package com.Zachary;

public class inheritance3 {
	public static void main(String[] args) {
		B test = new B();
		test.whoami();
		test.ancestor();
	}

}

class A{
	void whoami() {
		System.out.println("I am A");
	}
	void ancestor() {
		System.out.println("A is the parent");
	}
}
class B extends A{
	void whoami() {
		System.out.println("I am B");
	}
}