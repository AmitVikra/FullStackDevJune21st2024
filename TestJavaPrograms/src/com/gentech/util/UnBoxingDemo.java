package com.gentech.util;
public class UnBoxingDemo {
	public static void main(String[] args) {
		
		Integer a=Integer.valueOf(45);
		System.out.println("Integer a:"+a);
		
		//Convert into primitive
		int b=a.intValue();
		System.out.println("int b:"+b);
		
		//Unboxing 
		int c=a;
		System.out.println("int c:"+c);
		
	}

}
