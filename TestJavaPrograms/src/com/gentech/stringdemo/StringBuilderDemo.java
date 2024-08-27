package com.gentech.stringdemo;

public class StringBuilderDemo {
	public static void main(String[] args) {
		appendString();
		insertString();
		deleteString();
		reverseString();
	}
	
	static void appendString()
	{
		StringBuilder s=new StringBuilder("Java");
		s.append(" Programming");
		System.out.println(s);
		System.out.println("+++++++++++++++++");
	}
	
	static void insertString()
	{
		StringBuilder s=new StringBuilder("It is a palace");	
		s.insert(8, "new ");
		System.out.println(s);
		System.out.println("+++++++++++++++++");
	}

	static void deleteString()
	{
		StringBuilder s=new StringBuilder("It is a new palace");	
		s.delete(8, 12);
		System.out.println(s);
		System.out.println("+++++++++++++++++");
	}
	
	static void reverseString()
	{
		StringBuilder s=new StringBuilder("Welcome");	
		s.reverse();
		System.out.println(s);
		System.out.println("+++++++++++++++++");
	}

}
