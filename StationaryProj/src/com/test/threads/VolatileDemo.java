package com.test.threads;

public class VolatileDemo {
int x;
public VolatileDemo() {
	this.x = x;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public void increment()
{
	this.x=x+=10;
	
}
	public void decrement()
	{
	this.x=x-=5;
}
}
