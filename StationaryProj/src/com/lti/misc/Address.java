package com.lti.misc;

import java.io.Serializable;

public class Address implements Serializable {
	private String bldgname;
	private String  streetname;
	public Address(String bldgname, String streetname, String city, String pincode) {
		super();
		this.bldgname = bldgname;
		this.streetname = streetname;
		this.city = city;
		this.pincode = pincode;
	}
	public String getBldgname() {
		return bldgname;
	}
	public void setBldgname(String bldgname) {
		this.bldgname = bldgname;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	private String  city;
	private String pincode;
	@Override
	public String toString() {
		return "Address [bldgname=" + bldgname + ", streetname=" + streetname + ", city=" + city + ", pincode="
				+ pincode + "]";
	}
	}
