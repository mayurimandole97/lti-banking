package com.lti.misc;
import java.time.LocalDate;

public class Employee {
protected int id;
protected String name;
protected float salary;
protected LocalDate doj;

public void greeting()
{
	System.out.println("Hii all");
}
//getter
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public LocalDate getDoj() {
	return doj;
}
public void setDoj(LocalDate doj) {
	this.doj = doj;
}

//constructor
public Employee(int id, String name, float salary, LocalDate doj) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.doj = doj;
}
public Employee() {
	super();
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
}

