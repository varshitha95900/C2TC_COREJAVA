package com.co.demo;

public class Employee {
	int id;
	String name;
	float salary;
	public void display() {
		System.out.println(id +" " + name +" "+ salary);
	}
	public Employee() {
		System.out.println("no value intialized for this object");
	}
	public Employee(int i, String n, float s) {
		id=i;
	    name=n;
	    salary=s;
	}

	}


