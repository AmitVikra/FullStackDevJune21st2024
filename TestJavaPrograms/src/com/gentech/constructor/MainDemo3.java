package com.gentech.constructor;
class ArrayDemo
{
	ArrayDemo(int arr[])
	{
		for(int i=arr.length-1;i>=arr.length/2;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
public class MainDemo3 {
	public static void main(String[] args) {
		int b[]= {10,20,30,40,50,60};

		ArrayDemo o1=new ArrayDemo(b);
	}

}
