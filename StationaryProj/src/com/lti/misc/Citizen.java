package com.lti.misc;

import java.io.Serializable;
import java.time.LocalDate;

public class Citizen extends Person implements Serializable {
private String adharId;
private String name;
private Address address;
private LocalDate dob;

public String getAdharId() {
	return adharId;
}

public void setAdharId(String adharId) {
	this.adharId = adharId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public LocalDate getDob() {
	return dob;
}

public void setDob(LocalDate dob) {
	this.dob = dob;
}

public Citizen(String adharId, String name, Address address, LocalDate dob) {
	super();
	this.adharId = adharId;
	this.name = name;
	this.address = address;
	this.dob = dob;
}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		}
@Override
	public void sleep() {
		// TODO Auto-generated method stub
		}
@Override
	public String toString() {
		return "Citizen [adharId=" + adharId + ", name=" + name + ", address=" + address + ", dob=" + dob + "]";
	}
}
