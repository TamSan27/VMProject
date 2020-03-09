package com.java.oops;

public class StaticMembers {
	static String nativity;
	String name;
	int age;
	float salary;

	static {
		nativity = "Indian";
	}

	public static void setNativity(String resident) {
		nativity = resident;
	}

	public static void printNativity() {
		System.out.println("Country:" + nativity);
	}

	public void setData(String candiName, int candiAge, float candiSal) {
		name = candiName;
		age = candiAge;
		salary = candiSal;
	}

	public void printData() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Salary:" + salary);
		printNativity();
	}
}
