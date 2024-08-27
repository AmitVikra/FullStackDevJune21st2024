package com.gentech.util;
class Sample<T>
{
	T obj=null;
	void add(T obj)
	{
		this.obj=obj;	
	}
	
	T get()
	{
		return obj;
	}
}
public class GenericDemo1 {
	public static void main(String[] args) {
		//With Generics
		Sample<Integer> o1=new Sample<Integer>();
		o1.add(35);
		int v1=o1.get();
		System.out.println(v1);
		//With out Generics
		Sample o2=new Sample();
		o2.add("Apple");
		String s1=(String) o2.get();
		System.out.println(s1);
		o2.add(15.99);
		double d1=(double) o2.get();
		System.out.println(d1);
	}

}
