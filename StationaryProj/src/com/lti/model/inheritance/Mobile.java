package com.lti.model.inheritance;

import java.util.Scanner;

public class Mobile extends Gadget {
private String brand;
private String os;
private CoverColor color;
Scanner scn=new Scanner(System.in);
public Mobile(String brand,String os, CoverColor color)
{
	System.out.println("enter brand");
	this.brand=scn.next();
	System.out.println("enter os");
	this.os=scn.next();
	this.color= color;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getOs() {
	return os;
}
public void setOs(String os) {
	this.os = os;
}
public CoverColor getColor() {
	return color;
}
public void setColor(CoverColor color) {
	this.color = color;
}
public void turnOn()
{
displayLogo();
playMusic();
init();
	}

private static void displayLogo()
{System.out.println("displaying logo");
	}

private static void playMusic()
{System.out.println("playing music");
	}

private static void init()
{System.out.println("initialised");
	}
public void turnOff()
{
closeAllApps();
}
private static void closeAllApps()
{System.out.println("closed all apps");
	}
@Override
public String toString() {
	return "Mobile [brand=" + brand + ", os=" + os + ", color=" + color + "]";
}
}
