package com.lti.model;

public class TestPen {
public static void main(String []a)
{
	Pen p2=new Pen(45,"lexi",10.2f,"black");
	System.out.println(p2);
	Pen p1=new Pen();
	System.out.println("no of pen obj"+p1.getCtr());
	
	}
}
