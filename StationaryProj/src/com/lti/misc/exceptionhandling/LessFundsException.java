package com.lti.misc.exceptionhandling;

public class LessFundsException extends Exception {
private String message;
public LessFundsException(String message) {
	super();
	this.message = message;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
}
