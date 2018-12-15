package com.lti.misc;
import java.util.Scanner;

public class TestEmployee {
public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		Employee e1=new Employee();
		e1.greeting();
		Employee e2=new Manager();
		e2.greeting();
		Employee e3=null;
		if(e2 instanceof Manager)
		{
			Manager m1=(Manager) e2;
			m1.greeting();
		}
		System.out.println("	enter type of employee:");
			String typeofemp=scan.next();
			if (typeofemp.equals ("Employee"))
			{
				e3=new Employee();
			}
			else if (typeofemp.equals ("Manager"))
			{
				e3=new Manager();
			}
			CallGreeting(e3);
	}
			public static void CallGreeting(Employee e)
			{
				//if (e instanceof Employee)
					e.greeting();
			/*	else if(e instanceof Manager)
				{
					e.greeting();
					System.out.println("Hey Boss!!!!");
					}*/
			}	
		}

