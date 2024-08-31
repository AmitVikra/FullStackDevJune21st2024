package com.gentech.interfacedemo;
class MyClass1 implements Runnable
{
	@Override
	public void run() 
	{
		showEvenNumbers();
	}
	
	synchronized void showEvenNumbers()
	{
		try
		{
			System.out.println("Even Numbers ...");
			for(int i=20;i<=40;i++)
			{
				Thread.sleep(500);
				if(i%2==0)
				{
					System.out.println(Thread.currentThread().getName()+" Even Number :"+i);
				}
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		MyClass1 job=new MyClass1();
		
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);
		t1.setName("Alpha");
		t2.setName("Omega");
		t1.start();
		t2.start();

	}

}
