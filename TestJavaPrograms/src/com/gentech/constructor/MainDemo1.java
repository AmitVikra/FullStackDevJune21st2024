package com.gentech.constructor;
class Product
{
	Product(String name)
	{
		System.out.println("Product Name :"+name);
	}
	
	Product(double price)
	{
		System.out.println("Product Price :"+price);
	}
}
public class MainDemo1 {
	public static void main(String[] args) {
		Product o1=new Product("Lenovo");
		Product o2=new Product(25000.75);
		
	}

}
