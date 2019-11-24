package com.jitun.threadex;

public class ThreadTest extends Thread{

	private int count = 1;
	
	public int incrementCount(){
		return count++;
	}
	public void printCount(){
		System.out.println("Count :"+count);
	}
	
	public void run() {
        for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread :"+i);
//			Thread.yield();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }

	
}
