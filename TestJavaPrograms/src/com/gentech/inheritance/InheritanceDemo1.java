package com.gentech.inheritance;
class Maths1
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result:"+(x + y));
	}
}
class Maths2 extends Maths1
{
	void substraction(int a,int b)
	{
		System.out.println("Substraction Result:"+(a - b));
	}
}

class Maths3 extends Maths1
{
	void division(int x,int y)
	{
		System.out.println("Division Result:"+(x/y));
	}
}

class Maths4 extends Maths3
{
	void multiplication(int x,int y)
	{
		System.out.println("Multiplication Result:"+(x * y));
	}
}
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Maths2 o1=new Maths2();
		o1.addition(100, 400);
		o1.substraction(50, 10);
		System.out.println("++++++++++++");
		Maths4 o=new Maths4();
		o.addition(30, 50);
		o.division(25, 5);
		o.multiplication(12, 10);
	}

}
