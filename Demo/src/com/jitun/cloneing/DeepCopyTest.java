package com.jitun.cloneing;

public class DeepCopyTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department hr = new Department(1, "Human Resource");
		Employee original = new Employee(1, "Admin", hr);
		System.out.println("before clone dept :"+hr);
		System.out.println("before clone  emp :"+original);
		
		Employee cloned=(Employee) original.clone();
		cloned.getDepartment().setName("finance");
		
		System.out.println("after clone dept cloned:"+cloned.getDepartment().getName());
		System.out.println("after clone  dept original :"+original.getDepartment().getName());
	}
}
