package com.gentech.inheritance;
class AA
{
	AA()
	{
		System.out.println("It is AA class constructor");
	}
}
class BB extends AA
{
	BB()
	{
		super();
		System.out.println("It is BB class constructor");
	}
}

class CC extends BB
{
	CC()
	{
		super();
		System.out.println("It is CC class Constructor");
	}
}
public class InheritanceDemo3 {
	public static void main(String[] args) {
		CC obj=new CC();

	}

}
