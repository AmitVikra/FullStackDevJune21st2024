package com.gentech.programs;
class Human
{
	String firstName;
	int age;
	
}

class Product
{
	String productName;
	String orderName;
}

class Birds
{
	String featherColor;
	int noofWings;
}

class DomesticAnimal
{
	String breedName;
	String quantityofmilkprovides;
}
public class MainDemo1 {
	public static void main(String[] args) {
		Human santu=new Human();
		santu.firstName="Santosh";
		santu.age=22;
		System.out.println("First Name:"+santu.firstName);
		System.out.println("Age :"+santu.age);
		System.out.println("++++++++++++");
		Product samsung=new Product();
		samsung.productName="Sansumg Galaxy";
		samsung.orderName="Mobile Smart Phone";
		System.out.println("Product Name :"+samsung.productName);
		System.out.println("Order Name :"+samsung.orderName);
		System.out.println("++++++++++++");
		Birds sparrow=new Birds();
		sparrow.featherColor="Gray Color";
		sparrow.noofWings=2;
		System.out.println("Feather Color :"+sparrow.featherColor);
		System.out.println("No of Wings :"+sparrow.noofWings);
		System.out.println("++++++++++++");
		DomesticAnimal cow=new DomesticAnimal();
		cow.breedName="Jersey";
		cow.quantityofmilkprovides="10 Liters";
		System.out.println("Breed Name :"+cow.breedName);
		System.out.println("Quantity of Milk Provides :"+cow.quantityofmilkprovides);
	}

}
