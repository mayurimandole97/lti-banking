package com.lti.banking;

import com.lti.misc.exceptionhandling.LessFundsException;

public class TesterAccount {
public static void main(String[] args) {
	Account acc1=new Account(12000,"savings", 56000);
	try 
	{
		acc1.withdraw(212122);
	}
	catch(LessFundsException e)
	{
		System.out.println(e.getMessage());
	}
	System.out.println(acc1.getAccBal());
}
}
