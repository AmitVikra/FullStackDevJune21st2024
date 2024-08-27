package com.gentech.returnmethod;
class Demo
{
	String getCityName(String str)
	{
		return str;
	}
}
public class SampleDemo2 {
	public static void main(String[] args) {
		Demo o=new Demo();
		String s=o.getCityName("Bangalore");
		System.out.println(s);
	}

}
