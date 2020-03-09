package com.java.basics;

public class MethodWParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findSum(1, 10);
		findSum(1, 7);
		findSum(2, 81);
		findSum(9, 53);
		int x, y;
		x = findSum2(3, 15);
		y = findSum2(100, 200);
		System.out.println("Sum of value from  3 to 15 is:" + x);
		System.out.println("Sum of value from  100 to 200 is:" + y);
	}

	public static void findSum(int startValue, int endValue) {
		int sum = 0;

		for (int i = startValue; i <= endValue; i++) {
			sum += i;
		}
		System.out.println("Sum of value from " + startValue + " to " + endValue + " is:" + sum);
	}

	public static int findSum2(int startValue, int endValue) {
		int sum = 0;

		for (int i = startValue; i <= endValue; i++) {
			sum += i;
		}
		return sum;
	}
}
