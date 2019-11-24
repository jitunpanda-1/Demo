package com.jitun.stringex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateChars {

	public static void main(String[] args) {
		DuplicateChars.duplicateCharFind("java");

	}
	
	public static void duplicateCharFind(String word) {
		char[] chars=word.toCharArray();
		
		Map<Character, Integer> charMap= new LinkedHashMap<>();
		for (Character ch: chars) {
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			}else{
				charMap.put(ch, 1);
			}
		}
		System.out.println(charMap);
		Set<Map.Entry<Character, Integer>>	charSet= charMap.entrySet();
		for (Entry<Character, Integer> entry : charSet) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
	}

}
