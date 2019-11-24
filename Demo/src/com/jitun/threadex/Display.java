package com.jitun.threadex;

public class Display {

	/**
	 * for class level lock
	 * @param name
	 */
	/*public static synchronized void wish(String name) {

		for (int i = 0; i <= 10; i++) {
			System.out.print("Good Morning :" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}*/
	
	/**
	 * testing synchronized block for Object level lock
	 * @param name
	 */
		/*public void wish(String name) {
			synchronized(this){
			for (int i = 0; i <= 10; i++) {
				System.out.print("Good Morning :" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
			}
		}*/
		
		/**
		 * testing synchronized block for Object level lock
		 * @param name
		 */
			public void wish(String name) {
				synchronized(Display.class){
				for (int i = 0; i <= 10; i++) {
					System.out.print("Good Morning :" + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(name);
				}
				}
			}

	public synchronized void displayn() {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void displayc() {

		for (int i = 65; i <= 75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
