package com.gentech.staticdemo;
class Demo
{
	
	static
	{
		System.out.println("It is a First static block");
	}
	
	static
	{
		System.out.println("It is a Second static block");
	}
	
	static
	{
		System.out.println("It is a Third static block");
	}
}
public class SampleDemo {
	public static void main(String[] args) {
		Demo o=new Demo();
	}
}
