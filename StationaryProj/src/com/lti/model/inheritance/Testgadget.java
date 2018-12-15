package com.lti.model.inheritance;

public class Testgadget {
public static void main(String[] args) {
	Mobile m1=new Mobile("Nokia","Android",CoverColor.PINK);
	m1.turnOn();
	m1.turnOff();
	System.out.println(m1);
	Gadget g1=new Television (new Gadget(),54);
	Gadget g2=new Mobile ("oneplus","android",CoverColor.BLUE);
	gadgetOn(g1);
	gadgetOff(g1);
	
	gadgetOn(g2);
	gadgetOff(g2);
}
	public static void gadgetOn(Gadget g)
	{
		g.turnOn();
	}
	public static void gadgetOff(Gadget g)
	{
		g.turnOff();
	}
}
