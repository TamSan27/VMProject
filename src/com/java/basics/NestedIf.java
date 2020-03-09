package com.java.basics;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean degreeCplt = true;
		int percentage = 55;

		if (degreeCplt == true) {
			if (percentage >= 60) {
				System.out.println("You are eligible to Apply");
			}
			else {
				System.out.println("You are NOT eligible to Apply");
			}
		}else {
			System.out.println("You are NOT eligible to Apply");
		}
	}

}
