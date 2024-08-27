package com.gentech.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		writeContent();

	}
	
	private static void writeContent()
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fw=new FileWriter("D:\\Demo\\Test3.txt",true);
			bw=new BufferedWriter(fw);
			
			bw.write("The children are playing in the play ground.");
			bw.newLine();
			bw.write("The Mango is the king of all fruits.");
			bw.newLine();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
