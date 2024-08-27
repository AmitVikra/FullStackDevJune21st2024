package com.gentech.returnmethod;
class Calculation2
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
	
	void multiplication()
	{
		int a=this.add1(10,8);
		int b=this.sub1(12,7);
		int res=(a * b);
		System.out.println("Multiplication Result :"+res);
	}
	
}

public class CalculationDemo2 {
	public static void main(String[] args) {
		Calculation2 o=new Calculation2();
		o.multiplication();

	}

}
