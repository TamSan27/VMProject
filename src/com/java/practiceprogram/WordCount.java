package com.java.practiceprogram;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the input statement:");
		
		sentence = inputReader.nextLine();
		char cArray[] = sentence.toCharArray();
		int wdCount = 0;
		for (int i = 0; i < cArray.length; i++) {
			if ((cArray[i] == ' ' && cArray[i + 1] != ' ') || (cArray[i] == '\t' && cArray[i + 1] != '\t')
					|| (cArray[i] == '\n' && cArray[i + 1] != '\n')) {
				wdCount++;
			}
		}
		wdCount++;
		System.out.println("No. of Words:" + wdCount);
	}

}
