package com.gentech.staticdemo;
class Outer
{
	String firstName;
	Inner inner=new Inner();
	void showAge()
	{
		inner.age=22;
		System.out.println("Age :"+inner.age);
	}
	class Inner
	{
		int age;
		void showFN()
		{
			firstName="Santosh";
			System.out.println("First Name :"+firstName);
		}
		
	}
}
public class OuterAndInnerClassDemo {
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.showAge();

		outer.inner.showFN();
	}

}
