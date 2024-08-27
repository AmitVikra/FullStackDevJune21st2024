package com.gentech.returnmethod;
class Maths1
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result :"+res);
	}
	void addition(int x,int y,int z)
	{
		int res=(x+y+z);
		System.out.println("Addition Result :"+res);
	}
	
	void addition(int a[])
	{
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			res+=a[i];
		}
		System.out.println("Addition Result :"+res);
	}
	
}

public class MethodOverLoadingDemo {

	public static void main(String[] args) {
		Maths1 o=new Maths1();
		o.addition(10, 70);
		o.addition(20, 40, 40);
		int b[]= {10,20,30,40,50};
		o.addition(b);
		
	}

}
