package com.lti.misc.exceptionhandling;

public class UncheckedExceptionHdlg {
public static void main(String[] args) {
	try {
	int z=50/0;
	}
	catch(ArithmeticException ae)
	{
		System.out.println("cannot divide by zero");
	}
	catch(Exception e)
	{
		System.out.println("some exception");
	}
	System.out.println("regular code");
	System.out.println("some more code");
	}
}
