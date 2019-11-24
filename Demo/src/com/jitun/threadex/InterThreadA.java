package com.jitun.threadex;

public class InterThreadA {

	public static void main(String[] args) {
		
		InterThreadB b= new InterThreadB();
		b.start();
		synchronized (b) {
			System.out.println("main thread starts execution");
			try {
				b.wait();
				System.out.println("from main thread after child thread execution");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(b.total);
		}
	}
}
