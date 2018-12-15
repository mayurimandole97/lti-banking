package com.lti.misc;

import java.util.Scanner;
public class Prime {
public static void main(String[] args)
{
	int n,i=0,num=0;
			String primenumber="";
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter n:");
	n=scn.nextInt();
	for(i=1;i<=n;i++)
{
		int counter = 0;
	for(num=i;num>=1; num--)
	{
	if (i%num==0)
	{
		counter=counter+1;
	}
	
	}
	if(counter==2)
	{
		primenumber=primenumber+i +" ";
		
	}
}
	System.out.println("Prime numbers are:'"+primenumber);
	 scn.close();
}
  }

