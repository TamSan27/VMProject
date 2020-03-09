package com.java.oops;

public class BioConstructor {
	String name, gender, institute;
	int age;
	float salary;

	public BioConstructor() {
		// TODO Auto-generated constructor stub
		institute = "Vmetry Tech";
	}

	public BioConstructor(String candiName, String candiGender, int candiAge, float candiSalary) {
		this();
		name = candiName;
		gender = candiGender;
		age = candiAge;
		salary = candiSalary;
	}

	public void displayData() {
		System.out.println("Name:" + name);
		System.out.println("Gender:" + gender);
		System.out.println("Age:" + age);
		System.out.println("Salary:" + salary);
		System.out.println("Institute:" + institute);
		System.out.println("-------------------------------");
	}
}
