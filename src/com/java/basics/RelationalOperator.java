package com.java.basics;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		boolean gt, lt, gte;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Input:");
		a = inputReader.nextInt();
		b = inputReader.nextInt();

		gt = a > b;
		lt = a < b;
		gte = a >= b;
		System.out.println("Greater Than:" + gt);
		System.out.println("Less Than:" + lt);
		System.out.println("Greater Than or Equal To:" + gte);
		System.out.println("Less Than or Equal To:" + (a <= b));
		System.out.println("Equal To:" + (a == b));
		System.out.println("Not Equal To:" + (a != b));
	}

}
