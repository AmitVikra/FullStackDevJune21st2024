package com.gentech.constructor;
class BasicMaths
{
	BasicMaths(int num1,int num2,String scenario)
	{
		int res=0;
		switch(scenario)
		{
		case "add":
			res=(num1+num2);
			System.out.println("Addition Result:"+res);
			break;
		case "sub":
			res=(num1-num2);
			System.out.println("Substraction Result:"+res);
			break;
		case "mult":
			res=(num1*num2);
			System.out.println("Multiplication Result:"+res);
			break;
		case "div":
			res=(num1/num2);
			System.out.println("Division Result:"+res);
			break;
		default:
			System.out.println("Invalid Scenario!!!!");
			
		}
	}
	
}
public class MainDemo4 {
	public static void main(String[] args) {
		BasicMaths o1=new BasicMaths(10,60,"add");
		BasicMaths o2=new BasicMaths(100,60,"sub");
		BasicMaths o3=new BasicMaths(25,5,"mult");
		BasicMaths o4=new BasicMaths(60,5,"div");
		
	}

}
