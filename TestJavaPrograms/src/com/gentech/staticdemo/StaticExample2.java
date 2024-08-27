package com.gentech.staticdemo;
class Employee
{
	static String ename;
	static int salary;
	
	static
	{
		ename="Santosh";
		showEmpName();
		showeEmpSalary();
	}
	
	static void showEmpName()
	{
		System.out.println("Employee Name :"+ename);
	}
	static void showeEmpSalary()
	{
		System.out.println("Employee Saalry :"+salary);
	}
}
public class StaticExample2 {
	public static void main(String[] args) {
		Employee.salary=45000;
		System.out.println("Salary in main method :"+Employee.salary);

	}

}
