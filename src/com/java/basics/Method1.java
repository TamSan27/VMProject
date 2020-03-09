package com.java.basics;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Candidate 1 Info:");
		printCandidateInfo();
		System.out.println("Enter Candidate 2 Info:");
		printCandidateInfo();
		System.out.println("Enter Candidate 3 Info:");
		printCandidateInfo();
	}

	public static void printCandidateInfo() {
		String name;
		int age;
		float sal;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter inputs:");
		name = inputReader.nextLine();
		age = inputReader.nextInt();
		sal = inputReader.nextFloat();
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Salary:" + sal);
	}
}
