package com.gentech.staticdemo;
class Demo2
{
		
	{
		System.out.println("It is a First instance block!!");
	}
	
	{
		System.out.println("It is a Second instance block!!");
	}
	
	{
		System.out.println("It is a Third instance block!!");
	}	
}
public class InstanceBlockDemo1 {
	public static void main(String[] args) {
		Demo2 o=new Demo2();

	}
}
