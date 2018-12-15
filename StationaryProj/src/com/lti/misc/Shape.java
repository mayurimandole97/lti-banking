package com.lti.misc;

public abstract class Shape implements Changeable {
	
protected float length;
protected float breadth;
protected int numofsides;
	public abstract float calcArea();
	public abstract float calcVol();
	public void draw()
	{
		System.out.println("drawing some shape");
		}
}
