package com.jitun.threadex;

public class InterThreadB extends Thread{

	int total=0;
	
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("from Child thread before calculation");
			for(int i=1; i<=100; i++){
				total= total+i;
			}
			this.notify();
			System.out.println("from child thread after notification");
		}
	}
}
