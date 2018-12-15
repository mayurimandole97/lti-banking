package com.test.threads;

public class Data {
private String message;
public Data(String message)
{
	this.message=message;
}
public String getMessage() {
	return message;
}
public void setMessage() {
System.out.println("message being set...");
}
} 

