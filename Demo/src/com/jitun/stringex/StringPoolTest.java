package com.jitun.stringex;

public class StringPoolTest {

	public static void main(String[] args) {
		String s="abc";
		String s1= new String("abc");
		
		System.out.println("s hashcode :"+s.hashCode());
		System.out.println("s1 hashcode :"+s1.hashCode());
	}

}
