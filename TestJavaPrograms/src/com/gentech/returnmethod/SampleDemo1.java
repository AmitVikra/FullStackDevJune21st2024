package com.gentech.returnmethod;
class Maths
{
	int[][] matrixAddition(int x[][],int y[][])
	{
		int res[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				 res[i][j]=x[i][j]+y[i][j];
			}
		}
		return res;
	}
}
public class SampleDemo1 {

	public static void main(String[] args) {
		Maths o=new Maths();
		int a[][]= {{10,20,30},{40,50,60}};
		int b[][]= {{2,4,6},{1,3,5}};
		int c[][]=o.matrixAddition(a, b);
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
		
		//sum of All Result Elements
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				sum=sum+c[i][j];
			}
		}
		System.out.println("Sum of Result Elements :"+sum);
		//Display 1st Row of Elements from Result
		for(int i=0;i<c[0].length;i++)
		{
			System.out.print(c[0][i]+"  ");
		}
	}

}
