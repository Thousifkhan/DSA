package com.java.Threads;

public class Printer implements Runnable{

	private int print;
	
	public Printer(int print) {
		
		this.print = print;
	}
	
	@Override
	public void run() {
		System.out.println("Hello :: "+Thread.currentThread().getName()+"  "+print);
		
	}
	
	

}
