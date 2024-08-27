package com.gentech.programs;
public class Person {
	String firstName;
	int age;
	public static void main(String[] args) {
		Person obj1=new Person();
		System.out.println(obj1);
		obj1.firstName="Santosh";
		obj1.age=22;
		System.out.println("First Name:"+obj1.firstName);
		System.out.println("Age :"+obj1.age);
		System.out.println("++++++++++++");
		
	}
}
