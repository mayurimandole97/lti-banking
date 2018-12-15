package com.lti.misc;

import java.util.Scanner;

public class Fact {
	public static void main (String[] args)
	{
	int i=1,num,fact=1;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the number");
	num=scn.nextInt();
	while(i<=num) {
		
	fact=fact*i;
	i++;
	}
	System.out.println("Factorial is"+fact);
	
	
	}

}
