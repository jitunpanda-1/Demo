package com.jitun.threadex;

public class SynchronizationTest {

	public static void main(String[] args) {
		Display d=new Display();
		MyThread myThread= new MyThread(d, "Dhoni");
		MyThread myThread2= new MyThread(d, "Yuvraj");
		myThread.start();
		myThread2.start();
	}

}
