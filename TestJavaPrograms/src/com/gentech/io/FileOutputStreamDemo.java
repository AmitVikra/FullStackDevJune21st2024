package com.gentech.io;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		writeContent();

	}
	
	private static void writeContent()
	{
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("D:\\Demo\\Test1.txt",true);
			
			String str="There are Mangoes in the basket, and those ";
			str+="mangoes are riped.";
			
			byte b[]=str.getBytes();
			
			fout.write(b);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
