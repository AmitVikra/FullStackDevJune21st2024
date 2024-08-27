package com.gentech.returnmethod;
class Demo2
{
	int getFactorial(int num)
	{
		if(num==1)
		{
			return 1;
		}
		return num * getFactorial(num-1);
	}
}
public class RecusrsionDemo1 {
	public static void main(String[] args) {
		Demo2 o=new Demo2();
		int val=o.getFactorial(5);
		System.out.println(val);
	}
}
