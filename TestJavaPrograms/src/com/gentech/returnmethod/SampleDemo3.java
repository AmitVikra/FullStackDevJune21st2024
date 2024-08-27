package com.gentech.returnmethod;
class Demo3
{
	int[] getFirstHalfElements(int arr[])
	{
		int zz[]=new int[arr.length/2];
		int k=0;
		for(int i=0;i<arr.length/2;i++)
		{
			zz[k]=arr[i];
			k=k+1;
		}
		return zz;
	}
}
public class SampleDemo3 {
	public static void main(String[] args) {
		Demo3 o=new Demo3();
		int b[]= {10,20,30,40,50,60};
		int kk[]=o.getFirstHalfElements(b);
		for(int val:kk)
		{
			System.out.println(val);
		}
	}

}
