package com.jitun.threadex;

public class SynchronizationTest2 {

	public static void main(String[] args) {
		Display d= new Display();
		MyThread1 t1= new MyThread1(d);
		MyThread2 t2= new MyThread2(d);
		t1.start();
		t2.start();

	}

}
