package com.test.threads;

public class TesterVol {
public static void main(String[] args) {
	VolatileDemo vdemo1=new VolatileDemo();
	IncrementThread t1=new IncrementThread(vdemo1);
	t1.start();
	System.out.println(vdemo1.getX());
	IncrementThread t2=new IncrementThread(vdemo1);
	t2.start();
	System.out.println(vdemo1.getX());
	IncrementThread t3=new IncrementThread(vdemo1);
	t3.start();
	System.out.println(vdemo1.getX());
	IncrementThread t4=new IncrementThread(vdemo1);
	t4.start();
	System.out.println(vdemo1.getX());
	
	DecrementThread t5=new DecrementThread(vdemo1);
t5.start();
DecrementThread t6=new DecrementThread(vdemo1);
t6.start();
DecrementThread t7=new DecrementThread(vdemo1);
t7.start();
DecrementThread t8=new DecrementThread(vdemo1);
t8.start();
System.out.println(vdemo1.getX());
System.out.println(vdemo1.getX());
System.out.println(vdemo1.getX());
System.out.println(vdemo1.getX());
System.out.println();
}
}
