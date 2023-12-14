package com.java.inheritance;

public class Main {

	public static void main(String[] args) {
		
		A a = new B();
		a.doSomething();
		((B) a).print();
	}
}
