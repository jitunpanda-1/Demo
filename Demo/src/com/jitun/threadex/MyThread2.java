package com.jitun.threadex;

public class MyThread2  extends Thread{

	Display d;

	public MyThread2(Display d) {
		super();
		this.d = d;
	}
	
	public void run() {
		d.displayc();
	}
}
