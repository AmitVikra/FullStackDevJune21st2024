package com.gentech.stringdemo;
class Employee
{
	String firstName;
	String jobName;
	
	Employee(String firstName,String jobName)
	{
		this.firstName=firstName;
		this.jobName=jobName;
	}
	@Override
	public String toString()
	{
		return "Name of Employee "+firstName+" and Job "+jobName;
	}
}
public class StringDemo2 {
	public static void main(String[] args) {
		Employee obj=new Employee("Santosh","Doctor");
		System.out.println(obj);

	}

}
