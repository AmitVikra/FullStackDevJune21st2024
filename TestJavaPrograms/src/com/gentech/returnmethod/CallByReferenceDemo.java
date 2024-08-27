package com.gentech.returnmethod;
class CallByReference
{
	int x,y;
	void calculate(CallByReference o)
	{
		o.x+=100;
		o.y*=9;
		System.out.println("In Method, x value :"+o.x);
		System.out.println("In Method, y value :"+o.y);
	}
	
}
public class CallByReferenceDemo { 
	public static void main(String[] args) {
		CallByReference o=new CallByReference();
		o.x=10;
		o.y=5;
		System.out.println("The value of x :"+o.x);
		System.out.println("The value of y :"+o.y);
		o.calculate(o);
		System.out.println("After Method Execution, x :"+o.x);
		System.out.println("After Method Execution, y :"+o.y);
	}

}
