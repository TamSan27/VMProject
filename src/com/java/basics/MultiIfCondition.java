package com.java.basics;

public class MultiIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		age = 65;
		
		if (age >= 0 && age <= 3) {
			System.out.println("Infant eligible for Half Pay");
		} else if (age >= 60) {
			System.out.println("Senior Citizen Concession Pay");
		} else {
			System.out.println("Pay full");
		}
	}

}
