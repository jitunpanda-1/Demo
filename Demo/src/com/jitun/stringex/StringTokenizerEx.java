package com.jitun.stringex;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String delims = "ab";
		String splitString = "cdefghabklab";
		
		StringTokenizer st = new StringTokenizer(splitString, delims);
		while (st.hasMoreElements()) {
			System.out.println("StringTokenizer Output: " + st.nextElement());
		}

	}

}
