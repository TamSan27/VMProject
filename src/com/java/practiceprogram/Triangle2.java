package com.java.practiceprogram;

import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter n:");
		n = inputReader.nextInt();
		for (int i = 1, m = n; i <= n; i++, m--) {
			for (int s = 0; s < m; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
