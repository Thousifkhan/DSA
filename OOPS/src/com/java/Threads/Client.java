package com.java.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {
		
		ExecutorService executors = Executors.newFixedThreadPool(10);
		
		/*
		 * newFixedThreadPool --> It will create threads as we mentioned in the function
		 * newSingleThreadPool --> It will run with the single thread
		 * newCaheThreadPool --> no need to define the threads it will create / reuse the threads
		 * 
		 * */
		
		for(int i = 0 ; i < 100;i++) {
			
			Printer p = new Printer(i);
		//	Thread t = new Thread(p);
		//	t.start();
		//	t.run();
			
			/*
			 * If we call the method(t.run()) directly define in the Printer(Thread) class it will not create
			 * the Thread just run the function,
			 * 
			 * If we call the t.start() it will create the threads.
			 * */
			executors.execute(p);
			
		}
		
	}
}
