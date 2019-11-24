package com.jitun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Dummy {
	int j;
	
	private Dummy(int j) {
		super();
		this.j = j;
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, FileNotFoundException, IOException {
		int i=-1;
		System.out.println(Math.abs(i));
		
		Employee emp= new Employee(1, "Jitun");
		Employee emp1= new Employee(2, "jitun");
		Map<Employee, Integer> mp= new HashMap<Employee, Integer>();
		mp.put(emp, 1);
		mp.put(emp1, 2);
		System.out.println(mp);
		
		try {
			Class cls=Class.forName("Dummy");
			Dummy dmy=(Dummy) cls.newInstance();
			System.out.println(dmy.getClass().getName());
//			System.out.println(Class.forName("String").getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream im=new FileInputStream("file");
				){
			
		}
		
		
	}
}
