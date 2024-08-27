package com.gentech.returnmethod;
class IsPrime
{
	boolean isPrime(int num)
	{
		boolean prime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				prime=false;
				break;
			}
		}
		if(prime==true) return true;
		else return false;
	}

	void show50To100PrimeNums()
	{
		for(int j=50;j<=100;j++)
		{
			if(isPrime(j)==true) System.out.print(j+" ");
		}
		System.out.println();
	}

	void showReverse()
	{
		//Display Prime Numbers from 50 to 1
		for(int k=50;k>=2;k--)
		{
			if(isPrime(k)==true) System.out.print(k+" ");
		}
		System.out.println();
	}

	void showCount()
	{
		//find count of prime numbers in betweeen 100 to 200
		int count=0;
		for(int k=100;k<=200;k++)
		{
			if(isPrime(k)==true)
			{
				count=count+1;
			}	
		}
		System.out.println("Count of Prime numnbers 100 to 200 :"+count);
	}


}
public class SampleDemo {
	public static void main(String[] args) {
		IsPrime o=new IsPrime();
		o.show50To100PrimeNums();
		o.showReverse();
		o.showCount();
	}

}
