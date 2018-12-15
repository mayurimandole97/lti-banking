package com.lti.banking;

import com.lti.misc.exceptionhandling.LessFundsException;

public class Account {
private int accId;
private String accTyp;
private double accBal;
public Account(int accId, String accTyp, double accBal) {
	super();
	this.accId = accId;
	this.accTyp = accTyp;
	this.accBal = accBal;
}
//new
@Override
public String toString() {
	return "Account [accId=" + accId + ", accTyp=" + accTyp + ", accBal=" + accBal + "]";
}

public int getAccId() {
	return accId;
}
public void setAccId(int accId) {
	this.accId = accId;
}
public String getAccTyp() {
	return accTyp;
}
public void setAccTyp(String accTyp) {
	this.accTyp = accTyp;
}
public double getAccBal() {
	return accBal;
}
public void setAccBal(double accBal) {
	this.accBal = accBal;
}
public void applyCharges()
{

class Audit
{
	float charge= 0.0f;
	void calculateCharges(int daysoverdue)
	{
		if(daysoverdue>7 && daysoverdue<=10)
		{
			charge=1000.00f;
		accBal=accBal-charge;
	}
	else if (daysoverdue>10)
			 {
		charge=2000.00f;
	
	}
		System.out.println("before charges, bal"+accBal);
		accBal=accBal-charge;
		System.out.println("amount charges"+charge);
	}
}
	Audit a1= new Audit();
	a1.calculateCharges(100);
	System.out.println(accBal);
}

public void withdraw(double amt) throws LessFundsException
{
	if(amt > this.accBal)
		throw new LessFundsException("not enough bal");
		else
	this.accBal=this.accBal-amt;
	
	}
public static void main(String[]args)
{
	Account a2=new Account(3432,"current",212121);
	a2.applyCharges();
	}
}


