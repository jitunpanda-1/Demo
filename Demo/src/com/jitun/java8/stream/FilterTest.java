package com.jitun.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FilterTest {

	public static void main(String[] args) {
		List<Emp> empList= new ArrayList();
		
		empList.add(new Emp("Jitun", 29));
		empList.add(new Emp("Chikun", 25));
		empList.add(new Emp("Deepi", 25));
		empList.add(new Emp("Nani", 31));
		
		System.out.println(empList);
		
		List<Emp> fliterList= empList.stream().filter(i->i.getAge()>25).collect(Collectors.toList());
		
		List<Integer> incrementList= empList.stream().map(i-> i.getAge()+5).collect(Collectors.toList());
//				filter(i->i.getAge()>25).collect(Collectors.toList());
		System.out.println(fliterList);
		System.out.println(incrementList);
	}

}
