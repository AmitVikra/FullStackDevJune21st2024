package com.gentech.stringdemo;

public class StringOperationsDemo {

	public static void main(String[] args) {
		getCharCount();
		validateString();
		getCharBasedOnPosition();
		uppercaseStr();
		lowercaseStr();
		repalceDemo();
		compareString1();
		compareString2();
		existanceOfString();
		extractString();
		convertToCharArray();
		splitString();
		convertToString();
		convertToByteArray();
	}
	
	static void getCharCount()
	{
		String s="Welcome";
		int v1=s.length();
		System.out.println("# of Chars :"+v1);
		System.out.println("++++++++++++++++++++");
	}
	
	static void validateString()
	{
		String s=new String();
		boolean v1=s.isEmpty();
		System.out.println("Is Empty :"+v1);
		System.out.println("++++++++++++++++++++");
	}

	static void getCharBasedOnPosition()
	{
		String s=new String("WELCOME");
		char ch=s.charAt(1);
		System.out.println("character at position 1 :"+ch);
		System.out.println("++++++++++++++++++++");
	}
	
	static void uppercaseStr()
	{
		String s=new String("program");
		String s1=s.toUpperCase();
		System.out.println("Uppercase :"+s1);
		System.out.println("++++++++++++++++++++");
	}
	
	static void lowercaseStr()
	{
		String s=new String("LANGUAGE");
		String s1=s.toLowerCase();
		System.out.println("Lowercase :"+s1);
		System.out.println("++++++++++++++++++++");
	}
	
	static void repalceDemo()
	{
		String s=new String("It is a new palace");
		String s1=s.replace("is", "was");
		System.out.println("Replacement Result:"+s1);
		System.out.println("++++++++++++++++++++");
	}
	
	static void compareString1()
	{
		String s1="Welcome";
		String s2=new String("WELCOME");
		boolean v1=s1.equals(s2);
		System.out.println("s1 and s2 are equal :"+v1);
		boolean v2=s1.equalsIgnoreCase(s2);
		System.out.println("s1 and s2 are equal :"+v2);
		System.out.println("++++++++++++++++++++");
	}
	
	static void compareString2()
	{
		String s1="Welcome";
		String s2=new String("WELCOME");
		int v1=s1.compareTo(s2);
		System.out.println("s1 and s2 are equal :"+v1);
		int v2=s1.compareToIgnoreCase(s2);
		System.out.println("s1 and s2 are equal :"+v2);
		System.out.println("++++++++++++++++++++");
	}
	
	static void existanceOfString()
	{
		String s2=new String("It is an old palace");
		boolean v1=s2.startsWith("It");
		System.out.println("Starts with 'It' :"+v1);
		boolean v2=s2.endsWith("palace");
		System.out.println("Ends with 'palace' :"+v2);
		boolean v3=s2.contains("old");
		System.out.println("Contains 'old' :"+v3);
		System.out.println("++++++++++++++++++++");
	}
	
	static void extractString()
	{
		String s="Programming";
		String s1=s.substring(3);
		System.out.println(s1);
		String s2=s.substring(3, 7);
		System.out.println(s2);
		System.out.println("++++++++++++++++++++");
	}
	
	static void convertToCharArray()
	{
		String s="Software App";
		char ch[]=s.toCharArray();
		for(char kk:ch)
		{
			System.out.println(kk);
		}
		System.out.println("++++++++++++++++++++");
	}
	
	static void splitString()
	{
		String s="Apple,Mango,Ornage,Banana";
		String str[]=s.split(",");
		for(String s1:str)
		{
			System.out.println(s1);
		}
		System.out.println("++++++++++++++++++++");
	}
	
	static void convertToString()
	{
		double d=10.75;
		String s1=String.valueOf(d);
		System.out.println(s1);
		int a=45;
		String s2=String.valueOf(a);
		System.out.println(s2);
		System.out.println("++++++++++++++++++++");
	}
	
	static void convertToByteArray()
	{
		String str="Welcome to GenTech Academy";
		byte b[]=str.getBytes();
		for(int v1 : b)
		{
			System.out.print(v1+"  ");
		}
		System.out.println("++++++++++++++++++++");
	}
}
