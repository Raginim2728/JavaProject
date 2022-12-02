package com.springcon;

public class Student {
	private int id;
	private String name;
	private float fees;
	public Student(int id, String name, float fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	public void display() {
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("fees="+fees);
	}
	

}
