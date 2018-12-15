package com.lti.misc;

public class BookTest {
public static void main(String [] args)
	{
		Book a[] =new Book [3];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new Book();
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
