package com.lti.misc;

public class Calc {
	static Calc instance = null;
	private int num1;
	private int num2;
	public static Calc getInstance()
	{
		if(instance == null)
		{
			instance = new Calc();
		}
	return instance;
	}
		
		private Calc()
		{
			this.num1 = 5;
			this.num2 = 10;
		}
}
