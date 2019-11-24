package com.jitun.stringex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class NonRepeateCharFromString {

	public static void main(String[] args) {
		System.out.println(nonRepeateCharFind("mmon"));

	}
	
	public static char nonRepeateCharFind(String word) {
		char[] charString= word.toCharArray();
		
//		String newString= new String(charString);
		System.out.println(" char array to String : "+new String(charString));
		
		Map<Character, Integer> chMap=new LinkedHashMap<>();
		for (char ch : charString) {
			if(chMap.containsKey(ch)){
				chMap.put(ch, chMap.get(ch)+1);
			}else{
				chMap.put(ch, 1);
			}
		}
		System.out.println(chMap);
		Set<Map.Entry<Character, Integer>>	charSet= chMap.entrySet();
		char ch=0;
		for (Entry<Character, Integer> entry : charSet) {
			if (entry.getValue()==1) {
				System.out.println(entry.getKey()+" : "+entry.getValue());
				ch=entry.getKey();
				break;
			}
		}
		return ch;
	}

}
