package com.gentech.returnmethod;
class CallByValue
{
	void calculate(int x,int y)
	{
		x+=100;
		y*=9;
		System.out.println("The value of x in method :"+x);
		System.out.println("The value of y in method :"+y);
	}
}
public class CallByValueDemo {
	public static void main(String[] args) {
		int x,y;
		x=10;y=5;
		System.out.println("the value of x :"+x);
		System.out.println("the value of y:"+y);
		CallByValue o=new CallByValue();
		o.calculate(x, y);
		System.out.println("After Execution of Method,the value of x :"+x);
		System.out.println("After Execution of Method,the value of y:"+y);
	}

}
