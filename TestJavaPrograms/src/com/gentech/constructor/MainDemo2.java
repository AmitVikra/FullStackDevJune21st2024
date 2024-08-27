package com.gentech.constructor;
class IsPrime
{
	IsPrime(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag+=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+" is a Prime Number");
		}
		else
		{
			System.out.println(num+" is not a Prime Number");
		}
	}
}
public class MainDemo2 {
	public static void main(String[] args) {
		IsPrime o1=new IsPrime(21);
		IsPrime o2=new IsPrime(101);
		IsPrime o3=new IsPrime(81);
		IsPrime o4=new IsPrime(13);
		IsPrime o5=new IsPrime(33);
	}

}
