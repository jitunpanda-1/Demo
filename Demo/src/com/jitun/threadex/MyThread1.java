package com.jitun.threadex;

public class MyThread1  extends Thread{
	Display d;

	public MyThread1(Display d) {
		super();
		this.d = d;
	}
	
	public void run() {
		d.displayn();
	}

}
