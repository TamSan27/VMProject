package com.java.practiceprogram;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 7, 8, 10, 11, 8, 2, 8, 10, 6 };
		System.out.println("Duplicate Elements are:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

}
