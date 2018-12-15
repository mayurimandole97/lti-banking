package com.test.threads;

public class Receiver extends Thread {
	private Data data;
	Receiver(Data d)
	{
		this.data=d;
	}
	public void run()
	{
	
String nm=Thread.currentThread().getName();
synchronized (data)
{
	try {
System.out.println("Waiting for the messages....");
data.wait(1000);}
catch(InterruptedException ex) {
	System.out.println("interrupted");
}
}
System.out.println(Thread.currentThread().getName());
		synchronized(data)
		{
		try {
			data.wait();
			System.out.println("Still waiting");
		} catch (InterruptedException e) {
			System.out.println("wait interrupted");
		}
		}
		System.out.println(data.getMessage());
	}
}
	

