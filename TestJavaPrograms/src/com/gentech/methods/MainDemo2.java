package com.gentech.methods;
class Maths2
{
	void addition(int x,int y)
	{
		int res=(x + y);
		System.out.println("Addition Result:"+res);
	}
	
	void multiplication(int a,int b)
	{
		int res=(a * b);
		System.out.println("Multiplication Result:"+res);
	}
}
public class MainDemo2 {
	public static void main(String[] args) {
		Maths2 o=new Maths2();
		o.addition(10, 20);
		o.multiplication(12, 10);

	}

}
