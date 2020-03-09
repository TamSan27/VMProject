package com.java.oops;

public class ThisSuperParent {
	String name, institute;
	int age;
	float salary;

	public ThisSuperParent(String ins) {
		institute = ins;
	}

	public ThisSuperParent(String name, int age, float salary) {
		this("Vmetry");
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void displayData() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Salary:" + salary);
		this.displayInstitute();
	}
	
	public void displayInstitute() {
		System.out.println("Institute:" + institute);
	}
}
