package com.ciq.linkedlist;

public class Employee implements Comparable<Employee> {
private int id;
private String name;
private double salray;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, double salray) {
	super();
	this.id = id;
	this.name = name;
	this.salray = salray;
}
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
public double getSalray() {
	return salray;
}
public void setSalray(double salray) {
	this.salray = salray;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salray=" + salray + "]";
}
@Override
public int compareTo(Employee o) {
	
	return this.name.compareTo(o.name);
}

}
