package com.lti.misc;

import java.util.Scanner;

public class TestShapes
{
public static void main (String[] args)
{
Scanner scn=new Scanner(System.in);
Shape shape=null;
System.out.println("Enter the shape to be drawn:");
System.out.println("1.Equilateral Triangle" );
System.out.println("2.Isoceles Triangle" );
System.out.println("3.Square" );
int choice=scn.nextInt();

switch(choice)
{
case 1:
	shape=new EquiTriangle();
	break;
case 2:
	shape=new IsoscelesTri();
	break;
case 3:
	shape=new Square();
	break;
	default:
	System.out.println("no such shape");
	}
drawShape(shape);
}

public static void drawShape(Shape s)
{
	s.draw();
}
}







