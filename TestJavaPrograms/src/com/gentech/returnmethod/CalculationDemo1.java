package com.gentech.returnmethod;
class Calculation1
{
	int add1(int x,int y)
	{
		int res=(x + y);
		return res;
	}
	
	int sub1(int a,int b)
	{
		return (a - b);
	}
	
	void multiplication(int x, int y)
	{
		int res=(x * y);
		System.out.println("Multiplication Result :"+res);
	}
	
}

public class CalculationDemo1 {
	public static void main(String[] args) {
		//approach 1
		Calculation1 o=new Calculation1();
		int v1=o.add1(2, 8);
		int v2=o.sub1(15, 10);
		o.multiplication(v1, v2);
		//approach 2
		o.multiplication(o.add1(15, 5), o.sub1(25, 15));
	}

}
