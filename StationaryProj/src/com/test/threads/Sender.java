package com.test.threads;

public class Sender extends Thread{
private Data data;
Sender(Data data)
{
	this.data=data;
}
public void run()
{
	String nm=Thread.currentThread().getName();
	synchronized (data)
	{
		System.out.println(nm + "thread started");
data.setMessage();
System.out.println("set and send");
try
{
	Thread.sleep(1000);
}
catch(InterruptedException ie)
{
	ie.printStackTrace();}
	data.notifyAll();
	System.out.println("notification sent to all");
}
}
}
