package com.java.oops;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(5, 10);
		sum(5.7f, 8.3f);
		sum(8, 10, 2);
	}

	public static void sum(int a, int b) {
		int sum;
		sum = a + b;
		System.out.println("Sum:" + sum);
	}
	
	public static void sum(int a, int b, int c) {
		int sum;
		sum = a + b + c;
		System.out.println("Sum:" + sum);
	}

	public static void sum(float a, float b) {
		float sum;
		sum = a + b;
		System.out.println("Sum:" + sum);
	}

}
