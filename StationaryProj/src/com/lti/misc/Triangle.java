package com.lti.misc;

import java.util.Scanner;

public class Triangle extends TwoDShape {
Scanner scanner=new Scanner(System.in);
	
	Triangle()
	{
		this.numofsides=3;
		System.out.println("Enter the base");
		this.breadth=scanner.nextInt();
		System.out.println("Enter the height");
		this.length=scanner.nextInt();
	}
	@Override
	public float calcArea() {
		// TODO Auto-generated method stub
		return((float)(0.5*this.length*this.breadth)); 
	}

	@Override
	public float calcVol() {
		// TODO Auto-generated method stub
		System.out.println("no volume for 2d shapes");
		return 0.0f;
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("color");
	}
	@Override
	public void outline() {
		// TODO Auto-generated method stub
		System.out.println("outline");
	}
	@Override
	public void shadow() {
		// TODO Auto-generated method stub
		System.out.println("shadow");
	}
}
