package com.gentech.programs;
class Human2
{
	String firstName;
	int age;
	Human2(String fn,int Age)
	{
		firstName=fn;
		age=Age;
		System.out.println("First Name :"+firstName);
		System.out.println("Age :"+age);
		System.out.println("++++++++++++");
	}
}
public class ParametrizedConstructorDemo {
	public static void main(String[] args) {
		Human2 o1=new Human2("Santosh",22);

		Human2 o2=new Human2("Gopal",33);
	}

}
