package com.lti.practise;
@AuthorOfTheCode(name="Hemant",id=123,email="hemant@gmail.com")
public class Emp implements Comparable<Emp> {
private int id;
private String name;
private float Salary;

@AuthorOfTheCode(name="Parag",id=456,email="parag@gmail.com")
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
@AuthorOfTheCode(name="Sagarika",id=789,email="sagarika@gmail.com")
public float getSalary() {
	return Salary;
}
public void setSalary(float salary) {
	Salary = salary;
}
@Deprecated
public Emp(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	Salary = salary;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
}
@Override
public int compareTo(Emp e2) {
if (this.Salary == e2.Salary)
	return 0;
else if(this.Salary > e2.Salary)
	return 1;
else return -1;
}
}
