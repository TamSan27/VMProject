package com.java.basics;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Input:");
		a = inputReader.nextInt();
		b = inputReader.nextInt();
		c = a - b;
		System.out.println("Difference:" + c);
	}

}
