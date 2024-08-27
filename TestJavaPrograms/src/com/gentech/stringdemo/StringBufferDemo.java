package com.gentech.stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		appendDemo();
		insertString();
		deleteString();
		reverseString();
	}
	
	static void appendDemo()
	{
		StringBuffer s=new StringBuffer("Java");		
		s.append(" Programming");
		System.out.println(s);
		System.out.println("+++++++++++++++++");
	}
	
	static void insertString()
	{
		StringBuffer s=new StringBuffer("It is a palace");	
		s.insert(8, "new ");
		System.out.println(s);
		System.out.println("+++++++++++++++++");
	}

	static void deleteString()
	{
		StringBuffer s=new StringBuffer("It is a new palace");	
		s.delete(8, 12);
		System.out.println(s);
		System.out.println("+++++++++++++++++");
	}
	
	static void reverseString()
	{
		StringBuffer s=new StringBuffer("Welcome");	
		s.reverse();
		System.out.println(s);
		System.out.println("+++++++++++++++++");
	}
}
