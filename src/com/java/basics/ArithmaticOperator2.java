package com.java.basics;

import java.util.Scanner;

public class ArithmaticOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, diff, x, y, div, mod;
		float i, j, mul;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter value of a & b");
		a = inputReader.nextInt();
		b = inputReader.nextInt();
		diff = a - b;
		System.out.println("Enter value of x & y");
		x = inputReader.nextInt();
		y = inputReader.nextInt();
		div = x / y;
		mod = x % y;
		System.out.println("Enter value of i & j");
		i = inputReader.nextFloat();
		j = inputReader.nextFloat();
		mul = i * j;
		System.out.println("Subtraction:" + diff);
		System.out.println("Division:" + div);
		System.out.println("Multiplication:" + mul);
		System.out.println("Modulus:" + mod);
	}

}
