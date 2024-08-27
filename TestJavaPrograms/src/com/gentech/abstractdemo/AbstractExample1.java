package com.gentech.abstractdemo;
abstract class College
{
	abstract void showCollegeName(String name);
	abstract void showCityName(String name);
	void showCourses(String courses[])
	{
		System.out.println("Courses ...");
		for(int i=0;i<courses.length;i++)
		{
			System.out.println(courses[i]);
		}
	}
}
class SLNEngg extends College
{
	void showCollegeName(String name)
	{
		System.out.println("Engineering Collge Name:"+name);
	}
	
	void showCityName(String name)
	{
		System.out.println("City Name :"+name);
	}
	
	void displayAddress(String address)
	{
		System.out.println("Address of the Engg collge :"+address);
	}
}
public class AbstractExample1 {
	public static void main(String[] args) {
		SLNEngg o=new SLNEngg();
		o.showCollegeName("SLN Engineering College");
		o.showCityName("Bangalore");
		o.showCourses(new String[] {"CSE","EEE","Civil"});
		o.displayAddress("5th Stage, 4th Cross,Attiguppe");

	}

}
