package com.lti.misc;
import java.time.LocalDate;

public class Manager extends Employee
{
	private String department_name;
public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
public Manager()
{
	super();
	this.department_name="Admin";
}
public Manager(int id, String name, float salary, LocalDate doj,String dname)
{
	super(id,name,salary,doj);
this.department_name = dname;
}
public Manager(int id, String name, float salary, LocalDate doj) {
	super(id, name, salary, doj);
}

public Manager(Employee e,String dname)
{
	this.id =e. id;
	this.name = e.name;
	this.salary = e.salary;
	this.doj = e.doj;
	this.department_name = dname;
}
	@Override
	public String toString() {
		return super.toString()+ "Manager [department_name=" + department_name + ", id=" + id + ", name=" + name + ", salary=" + salary
				+ ", doj=" + doj + "]";
	}

	public void greeting()
	{
		System.out.println("Hey all");
	}
	}
	


