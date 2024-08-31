package com.gentech.interfacedemo;
interface Product
{
	default void displayProductPrice(double price)
	{
		System.out.println("Price of the Product:"+price);
	}
}

interface Invoice
{
	default void displayProductPrice(double price)
	{
		System.out.println("Price of the Product on Invoice:"+price);
	}
}
class Lenovo implements Product,Invoice
{

	@Override
	public void displayProductPrice(double price) {
		System.out.println("The Product Price and Invocie Price :"+price);
	}
	
	
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Lenovo obj=new Lenovo();
		obj.displayProductPrice(45800.55);
		
	}

}
