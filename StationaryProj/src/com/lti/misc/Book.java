package com.lti.misc;
import java.util.Scanner;

public class Book {

	private static int ctr=0;
	private int id;
	private String title;
	private String author;
	private int date;
	Scanner scan=new Scanner(System.in);
	
	Book()
	{
		System.out.println("Enter id");
		this.id=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter title");
		this.title=scan.nextLine();
		System.out.println("Enter author");
		this.author=scan.nextLine();
		System.out.println("Enter date of releasing");
		this.date=scan.nextInt();
		}
	public String toString()
	{
		return"id"+this.id+"title"+this.title+author+"author"+this.author;
}
}
