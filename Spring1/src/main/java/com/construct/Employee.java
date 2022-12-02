package com.construct;

public class Employee {
private String name;
  public Employee() {
	  System.out.println("Constructor is called");
  }
public Employee(String name) {
	super();
	this.name = name;
	System.out.println("Hello "+name);
}
  
}

