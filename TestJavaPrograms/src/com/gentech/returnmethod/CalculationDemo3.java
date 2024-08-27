package com.gentech.returnmethod;
class Table
{
	String[] getTable(int num)
	{
		String arr[]=new String[10];
		int k=0;
		for(int i=1;i<=10;i++)
		{
			String str=num+" * "+i+" = "+(num * i);
			arr[k]=str;
			k=k+1;
		}
		return arr;
	}
}

public class CalculationDemo3 {
	public static void main(String[] args) {
		Table o=new Table();
		String b[]=o.getTable(7);
		for(String kk:b)
		{
			System.out.println(kk);
		}
			

		
	}

}
