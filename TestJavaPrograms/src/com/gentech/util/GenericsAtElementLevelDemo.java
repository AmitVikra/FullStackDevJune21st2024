package com.gentech.util;
class Demo
{
	public static <E> void readElements(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
	}
}
public class GenericsAtElementLevelDemo {
	public static void main(String[] args) {
		String s[]= {"Mango","Ornage","Apple"};
		Demo.readElements(s);
		
		Boolean b[]= {true, false};
		Demo.readElements(b);
		
		Integer c[]= {10,20,30,40};
		Demo.readElements(c);
	}

}
