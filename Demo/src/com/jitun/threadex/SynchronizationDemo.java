package com.jitun.threadex;

public class SynchronizationDemo {

	public static void main(String[] args) {
		//for Object level lock
		/*Display d= new Display();
		MyThread t1= new MyThread(d, "Hi");
		MyThread t2= new MyThread(d, "Hello");
		t1.start();
		t2.start();*/
		
		/**
		 * to test class level lock
		 */
		Display d1= new Display();
		Display d2= new Display();
		MyThread t3= new MyThread(d1, "Hi");
		MyThread t4= new MyThread(d2, "Hello");
		t3.start();
		t4.start();

	}

}
