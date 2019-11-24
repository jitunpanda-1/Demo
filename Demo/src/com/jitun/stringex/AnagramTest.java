package com.jitun.stringex;

import java.util.Arrays;

public class AnagramTest {

	public static void main(String[] args) {
		System.out.println(checkAnagram("listen", "silent"));
		
		
	}
	
	public static boolean checkAnagram(String word, String angramWord) {
//		String str=
		/*StringBuilder sr=new StringBuilder(word);
		String str1=sr.reverse().toString();
		System.out.println("String after reverse"+str1);*/
		
		char[] fromWord=word.toCharArray();
		char[] frmAngramWord= angramWord.toCharArray();
		System.out.println(fromWord);
		System.out.println(frmAngramWord);
		
		Arrays.sort(fromWord);
		Arrays.sort(frmAngramWord);
		
		System.out.println(fromWord);
		System.out.println(frmAngramWord);
		
		return Arrays.equals(fromWord, frmAngramWord);
	}

}
