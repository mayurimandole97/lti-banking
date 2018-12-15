package com.lti.misc;

public class EquiTriangle extends Triangle implements Printable {
public void draw()
{
	System.out.println("drawing equi triangle");
	}

public void color()
{
	System.out.println("equi color");
}

public void outline()
{
	System.out.println("outline");
}

public void shadow()
{
	System.out.println("shadow");
}

@Override
public void print() {
	// TODO Auto-generated method stub
	System.out.println("print");
}
public void publish() {
	// TODO Auto-generated method stub
	System.out.println("publish");
}
}
