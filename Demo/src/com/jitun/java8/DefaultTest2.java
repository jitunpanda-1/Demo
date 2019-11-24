package com.jitun.java8;

@FunctionalInterface
public interface DefaultTest2 {

	void m1();
	
	// default method 
    default void show() 
    { 
      System.out.println("Default Method Executed"); 
    } 
}
