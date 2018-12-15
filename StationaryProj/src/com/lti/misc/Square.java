package com.lti.misc;

import java.util.Scanner;

public class Square extends TwoDShape {
Scanner scanner=new Scanner(System.in);
	
	public Square()
	{
		this.numofsides=4;
		System.out.println("Enter the side");
		this.breadth=scanner.nextInt();
		}
	@Override
	public float calcArea() {
		// TODO Auto-generated method stub
		return (float) (this.breadth*this.breadth);
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
		System.out.println(" color");
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
