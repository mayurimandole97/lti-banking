package com.test.threads;

public class IncrementThread extends Thread {
	VolatileDemo vdemo=new VolatileDemo();
	
	public IncrementThread(VolatileDemo vdemo) {
		super();
		this.vdemo = vdemo;
	}

	public void run()
	{
		vdemo.increment();
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("interrupted exception");
		}
	}

}
