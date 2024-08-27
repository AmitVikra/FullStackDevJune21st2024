package com.gentech.inheritance;
class Employee
{
	Employee(String ename,String jobname)
	{
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Job :"+jobname);
	}
}
class Department extends Employee
{
	String deptName;
	Department(String name,String job,String dname)
	{
		super(name, job);
		deptName=dname;
		System.out.println("Deaprtment :"+deptName);
	}
}
public class InheritanceDemo2 {
	public static void main(String args[])
	{
		Department o=new Department("Santosh","Manager","Research");
		Department o1=new Department("Richard","Senior Manager","Development");
	}

}
