package com.java.basics;

import java.util.Scanner;

public class SwitchVowel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter any character:");
		x = inputReader.nextLine().toCharArray()[0];
		switch (x) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not a Vowel");
			break;
		}
	}

}
