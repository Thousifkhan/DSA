package com.scaler.oops;

public class Student {

	private int age;
	private String name;

	public Student(int age, String name) {

		this.age = age;
		this.name = name;
	}

	void display() {

		System.out.println("My name is " + this.name + " I am " + this.age + " years old");
	}

	void sayHello(String name) {

		System.out.println(this.name + " says hello to " + name);
	}
	
	public static void main(String[] args) {
		
		Student st = new Student(28,"Thousif");
		st.display();
		st.sayHello("Khan");
	}

}
