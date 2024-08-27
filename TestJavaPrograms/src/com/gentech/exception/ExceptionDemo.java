package com.gentech.exception;
class StringValidation
{
	static int getCharacterCount(String str)throws Exception
	{
		if(str==null)
		{
			throw new Exception("Please provide Valid String as an input,Don't provide null value as input!!!!");
		}
		return str.length();
	}
}
public class ExceptionDemo {
	public static void main(String[] args) {
		try
		{
			int v1=StringValidation.getCharacterCount("Program");
			System.out.println("# of chars :"+v1);
			int v2=StringValidation.getCharacterCount(null);
			System.out.println("# of chars :"+v2);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
