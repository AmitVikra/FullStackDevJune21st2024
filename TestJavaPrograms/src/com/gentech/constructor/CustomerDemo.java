package com.gentech.constructor;
class Customer
{
	String firstName;
	String emailId;
	Customer(String firstName,String emailId)
	{
		this.firstName=firstName;
		this.emailId=emailId;
		System.out.println("First Name :"+firstName);
		System.out.println("Email Id :"+emailId);
	}
	void display()
	{
		System.out.println("First Name :"+firstName);
		System.out.println("Email Id :"+emailId);
	}
}
public class CustomerDemo {
	public static void main(String[] args) {
		Customer o1=new Customer("Santosh","santosh@gss.com");
		o1.display();
	}

}
