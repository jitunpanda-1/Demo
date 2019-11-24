package com.jitun.regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RegExTest extends A{

	public static void main(String[] args) {
		List<Integer> list= new ArrayList();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(10);
		list.add(2);
		list.add(6);
//		System.out.println("original list :"+list);
//		System.out.println("alternate List :"+getAlternateList(list, list.size()));
//		printPattern(4);
		System.out.println(getStringCount("mynhiamaeis hi ealso","hi"));
//		name();

	}
	public static List<Integer> getAlternateList(List<Integer> inputList, int num){
        Collections.sort(inputList);
        List<Integer> alternateList= new ArrayList(num/2);
        for(int i=0;i<inputList.size()-1; i++){
            if(alternateList.size()==0){
                alternateList.add(inputList.get(i));
            }else{
                if(!alternateList.contains(inputList.get(i-1))){
                	if(inputList.get(i) > inputList.get(i)+1){
                		alternateList.add(inputList.get(i));
                	}else{
                		alternateList.add(inputList.get(i+1));
                	}
                	
                }
            }
        }
        
        return alternateList;
    }
	
	public static void  printPattern(int n) {
		int num=1;
		int temp=0;
		for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+"*");
                num= num+1;
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
        	temp=num-i;
        	num=temp;
            for(int j=1;j<=i;j++){
                System.out.print(num+"*");
                num= num+1;
            }
            num=temp;
            System.out.println();
        }
	}
	public static int getStringCount(String str1, String str2){
		String [] arr= str1.split(str2);
		System.out.println(arr.length);
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i]);
		}
       return arr.length-1; 
    }
	
	public static void name() {
		name1();
	}

	public static void name1() {
		name();
	}
}
