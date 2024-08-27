package com.gentech.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
	//	writeObjectToFile();
		readObjectFromFile();
	}
	
	private static void writeObjectToFile()
	{
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		Employee obj=null;
		try
		{
			fout=new FileOutputStream("E:\\Example\\Employee.ser");
			out=new ObjectOutputStream(fout);
			
			obj=new Employee("Santosh","Senior Research Scientiest");
			
			out.writeObject(obj);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				out.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

	
	private static void readObjectFromFile()
	{
		FileInputStream fin=null;
		ObjectInputStream in=null;
		Employee obj=null;
		try
		{
			fin=new FileInputStream("E:\\Example\\Employee.ser");
			in=new ObjectInputStream(fin);
			
			obj=(Employee) in.readObject();
			
			obj.showFirstName();
			obj.showJobName();
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				in.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
