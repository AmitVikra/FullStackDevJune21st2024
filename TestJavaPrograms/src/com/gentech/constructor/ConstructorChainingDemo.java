package com.gentech.constructor;
class Employee
{
	Employee(String ename)
	{
		System.out.println("Employee Name :"+ename);
	}
	
	Employee(int sal)
	{
		this("Santosh");
		System.out.println("Employee Salary :"+sal);
	}
}
public class ConstructorChainingDemo {
	public static void main(String[] args) {
		Employee o1=new Employee(25000);

	}

}
