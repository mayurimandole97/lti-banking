package com.lti.model;

public class Pen {
private static int ctr=0;
private int id;
private String brand;
private float price;
private String colour_of_ink;

private class Inkchanger
{String new_color;
  public Inkchanger(String new_color)
  {
	  super();
	  this.new_color=new_color;
	 // System.out.println("clr changed to new clr");
  }
	void changeInk()
	{
		colour_of_ink=new_color;
		System.out.println("clr changed to new clr");
	}
	String getNewcolor()
	{
		return new_color;
	}
}

Pen()
{
	System.out.println("pen obj");
//	ctr++;
}
public Pen(int a,String b,float c,String d)
{this.id=a;
this.brand=b;
this.price=c;
this.colour_of_ink=d;
ctr++;
}
Pen(Pen p)
{
	this.id=p.id;
	this.brand=p.brand;
	this.price=p.price;
	this.colour_of_ink=p.colour_of_ink;
	ctr++;
	}
public void setId(int idd)
{
	this.id=idd;
}
public void setBrand(String b)
{
	this.brand=b;
}
public void setPrice(float p)
{
	this.price=p;

}
public void setColourOfInk(String d)
{
this.colour_of_ink=d;

	}
public String toString()
{
	return "Id :" +this.id + "\n" + "Brand :" + this.brand + "\n" + "Price:" +this.price + "\n" + "clr of ink" + this.colour_of_ink ;
}
public static int getCtr()
{
	return ctr;
}

public boolean equals(Object o)
{
	Pen p=(Pen)o;
	if ((this.id)==p.id)
		&&  (this.brand.equals(p.brand)) 
				&& (this.price==p.price)
				&&(this.colour_of_ink.equals(p.colour_of_ink)))
				return true;
	else
		return false;
}
public static void main(String[] args) {
	Pen p1=new Pen(1212,"Parker",43,"blue");
//	Pen.Inkchanger ink_changer = p1.new Inkchanger("black");
//	ink_changer.changeInk();
	//System.out.println(p1);
	Pen.CountTracker counttracker = new CountTracker();
	 counttracker.dispCounter();
}
static class CountTracker
{
	static void dispCounter()
	{
		System.out.println(ctr);
	}
	public static void main (String[] args)
	{
	System.out.println("no of obj created are");
	dispCounter();
	}
}
}

