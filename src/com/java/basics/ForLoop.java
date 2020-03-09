package com.java.basics;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, sum = 0;
		for (i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("Sum:" + sum);
		
		for (i = 1; i <= 20; i++) {
			sum += i;
		}
		System.out.println("Sum:" + sum);

		for (i = 1; i <= 35; i++) {
			sum += i;
		}
		System.out.println("Sum:" + sum);
		
		for (i = 1; i <= 80; i++) {
			sum += i;
		}
		System.out.println("Sum:" + sum);
		
		for (i = 1; i <= 99; i++) {
			sum += i;
		}
		System.out.println("Sum:" + sum);
		
//		for (j = 1, sum = 0; j <= 10; sum += j, j +=5);
//		System.out.println("Sum:" + sum);
	}

}
