package com.gentech.staticdemo;
class Student
{
	static String subject;
	static void addition(int x,int y)
	{
		int res=(x + y);
		System.out.println("Addition Result:"+res);
	}
}
public class StaticExample1 {
	public static void main(String[] args) {
		Student.subject="Mathematics";
		System.out.println("Subject :"+Student.subject);
		
		Student.addition(20, 60);

	}

}
