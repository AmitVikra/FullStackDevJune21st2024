package com.gentech.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private String firstName;
	private String jobName;
	
	Employee(String firstName,String jobName)
	{
		this.firstName=firstName;
		this.jobName=jobName;		
	}
	
	public void showFirstName()
	{
		System.out.println("First Name of Employee :"+firstName);
	}
	
	public void showJobName()
	{
		System.out.println("Job Of the Employee :"+jobName);
	}
}
