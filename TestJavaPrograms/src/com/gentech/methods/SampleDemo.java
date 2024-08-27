package com.gentech.methods;
class Factorial
{
	void findFact(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
}
public class SampleDemo {

	public static void main(String[] args) {
		Factorial o=new Factorial();
		o.findFact(4);
		o.findFact(5);
		o.findFact(6);
		o.findFact(7);
	}

}
