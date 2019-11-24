package com.jitun.threadex;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadTest threadTest= new ThreadTest();
		
		/*Thread t1= new Thread(){
			@Override
			public void run() {
				while(threadTest.incrementCount()<=5){
					threadTest.incrementCount	();
				}
			}
		};
		t1.start();
		Thread t2= new Thread(){
			@Override
			public void run() {
				while(threadTest.incrementCount()<=5)
				threadTest.printCount();
			}
		};
		t2.start();
		t1.setName("parent thread");
		t1.setPriority(10);*/
		
		/*Thread.currentThread().setPriority(8);
		System.out.println(threadTest.getPriority());
		System.out.println(Thread.currentThread());
		System.out.println(threadTest.getName());*/
		
//		threadTest.setPriority(2);
		threadTest.start();
		try {
			threadTest.join(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread :"+i);
		}
		
	}

}
