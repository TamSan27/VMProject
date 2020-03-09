package com.java.basics;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][], sum = 0, rows, cols;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter Array Rows Size:");
		rows = inputReader.nextInt();
		System.out.println("Enter Array Columns Size:");
		cols = inputReader.nextInt();
		a = new int[rows][cols];
		System.out.println("Enter Array Elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = inputReader.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum = sum + a[i][j];
			}
		}
		System.out.println("Sum:" + sum);
	}

}
