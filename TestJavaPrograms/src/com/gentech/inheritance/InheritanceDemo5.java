package com.gentech.inheritance;
class Student
{
	String bookName;
	void show()
	{
		System.out.println("Book Name in Student class :"+bookName);
	}
}
class Library extends Student
{
	String bookName;
	Library(String name)
	{
		super.bookName=name;
	}
	void display()
	{
		System.out.println("book Name in Library class :"+bookName);
	}
}
public class InheritanceDemo5 {
	public static void main(String[] args) {
		Library o=new Library("Postgres SQL");
		o.bookName="Java Complete Reference";
		o.show();
		o.display();
	}
}
