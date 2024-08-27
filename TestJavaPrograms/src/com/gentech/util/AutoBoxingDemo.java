package com.gentech.util;

public class AutoBoxingDemo {
	public static void main(String[] args) {
		
		int a=35;
		System.out.println("int a:"+a);

		//Convert into object
		Integer b=Integer.valueOf(a);
		System.out.println("Integer b:"+b);
		
		//AutoBoxing
		Integer c=a;
		System.out.println("Integer c:"+c);
	}

}
