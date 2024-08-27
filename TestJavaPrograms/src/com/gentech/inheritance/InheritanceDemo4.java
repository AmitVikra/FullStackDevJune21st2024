package com.gentech.inheritance;
class Demo1
{
	void displayCityName(String capitalCity)
	{
		System.out.println("Capital City Name :"+capitalCity);
	}
}
class Demo2 extends Demo1
{
	Demo2(String name)
	{
		super.displayCityName(name);
	}
	void displayCityName(String metroCity)
	{
		System.out.println("Metro City Name :"+metroCity);
	}
}
public class InheritanceDemo4 {
	public static void main(String[] args) {
		Demo2 o=new Demo2("Bangalore");
		o.displayCityName("Chennai");	
	}

}
