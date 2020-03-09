package com.java.basics;

import java.util.Scanner;

public class SingleDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a[] = new int[10];
		int a[], sum = 0, size;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		size = inputReader.nextInt();
		a = new int[size];
		System.out.println("Enter Array Elements:");
		for (int i = 0; i < size; i++) {
			a[i] = inputReader.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum:" + sum);
	}

}
