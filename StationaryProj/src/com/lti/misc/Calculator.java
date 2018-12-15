package com.lti.misc;

public class Calculator {
//instance var
	private int num1;
	private int num2;
	//constructor
	
	public Calculator(int a,int b)
	{
		this.num1 = a;
		this.num2 = b;
	}
	public Calculator() {
		super();
	}
	//gettersor accessors
	public int getNum1()
	{
		return this.num1;
	}
	
	public int getNum2()
	{
		return this.num2;
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public int mul(int a,int b)
	{
		return a*b;
	}
	
	public int div(int a,int b)
	{
		return a/b;
	}
	public void setNum1(int a)
	{
		 this.num1=a;
	
	}
	}
