package com.java.practiceprogram;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Munish Prabhu";
		Map<Character, Integer> counter = new LinkedHashMap<Character, Integer>();
		char inputArr[] = input.toCharArray();
		for (char c : inputArr) {
			if (counter.containsKey(c)) {
				counter.put(c, counter.get(c) + 1);
			} else {
				counter.put(c, 1);
			}
		}
		System.out.println(counter);
	}

}
