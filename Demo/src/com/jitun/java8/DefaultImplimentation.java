package com.jitun.java8;

public class DefaultImplimentation implements DefaultTest, DefaultTest2 {

	public static void main(String[] args) {
		

	}

	@Override
	public void m1() {
		
	}

	@Override
	public void show() {
		DefaultTest.super.show();
	}

}
