package com.gentech.io;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		writeContent();

	}
	
	private static void writeContent()
	{
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("D:\\Demo\\Test2.txt",true);
			
			String str="There are Mangoes in the basket, and those ";
			str+="mangoes are riped.";
			
			char ch[]=str.toCharArray();
			
			fw.write(ch);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
