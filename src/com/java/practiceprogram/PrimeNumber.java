package com.java.practiceprogram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		boolean isPrime = true;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter any whole number:");
		n = inputReader.nextInt();
		for (int i = 2; i < n; i++) {
			if ((n % i) == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(n+" is a Prime Number");
		} else {
			System.out.println(n+" is NOT a Prime Number");
		}
	}

}
