package com.jitun.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class NewJavaFeaturesTest {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f=i->i*i;
		System.out.println("the square of :"+f.apply(5));
		
		Predicate<Integer> p=i -> i%2==0;
		System.out.println(" the number is even or not :"+p.test(4));
		
		//for void type
//		MyInterface myInterface=(i,j)-> System.out.println("hello from world of java :"+(i+j));
//		myInterface.add(5,6);
//		myInterface.add(10,6);
		
		//for return type
		MyInterface myInterface=(a)->a*a;
		System.out.println(myInterface.square(5));
		
		
	}

}
