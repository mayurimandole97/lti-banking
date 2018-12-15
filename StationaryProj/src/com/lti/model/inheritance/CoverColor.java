package com.lti.model.inheritance;

public enum CoverColor {
BLACK(1000,"Mumbai"),GOLDEN(100,"delhi"),PINK(1020,"Pune"),BLUE(1000,"Goa");
	
	int numsmanufactured;
	String city;
	CoverColor(int n,String city)
	{this.numsmanufactured = n;
	this.city = city;
	}
	public int getNumsmanufactured() {
		return numsmanufactured;
	}
	public void setNumsmanufactured(int numsmanufactured) {
		this.numsmanufactured = numsmanufactured;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
