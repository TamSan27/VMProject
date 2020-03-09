package com.java.basics;

import java.util.Scanner;

public class WithoutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		float sal;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter Candidate 1 Info:");
		name = inputReader.nextLine();
		age = inputReader.nextInt();
		sal = inputReader.nextFloat();
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Salary:" + sal);
		System.out.println("Enter Candidate 2 Info:");
		name = inputReader.nextLine();
		age = inputReader.nextInt();
		sal = inputReader.nextFloat();
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Salary:" + sal);
		System.out.println("Enter Candidate 3  Info:");
		name = inputReader.nextLine();
		age = inputReader.nextInt();
		sal = inputReader.nextFloat();
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Salary:" + sal);
	}

}
