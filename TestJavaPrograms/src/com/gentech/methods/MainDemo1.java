package com.gentech.methods;
class Maths1
{
	void addition()
	{
		int x,y;
		x=10;y=60;
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
	
	void multiplication()
	{
		int x,y;
		x=5;y=25;
		int res=(x * y);
		System.out.println("Multiplication Result:"+res);
	}
	
	
}
public class MainDemo1 {
	public static void main(String[] args) {
		new Maths1().addition();
		new Maths1().multiplication();
		
		Maths1 o1=new Maths1();
		o1.addition();

	}

}
