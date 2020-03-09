package com.java.basics;

import java.util.Scanner;

public class SwitchVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter any character:");
		x = inputReader.nextLine().toCharArray()[0];
		switch (x) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not a Vowel");
			break;
		}
	}

}
