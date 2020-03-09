package com.java.oops;

public class Bio {
	String name, gender;
	int age;
	float salary;

	public void setData(String candiName, String candiGender, int candiAge, float candiSalary) {
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
		System.out.println("-------------------------------");
	}
}
