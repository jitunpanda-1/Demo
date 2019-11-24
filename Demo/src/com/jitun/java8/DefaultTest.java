package com.jitun.java8;

@FunctionalInterface
public interface DefaultTest {

	void m1();
	
	// default method 
    default void show() 
    { 
      System.out.println("Default Method Executed"); 
    } 
}
