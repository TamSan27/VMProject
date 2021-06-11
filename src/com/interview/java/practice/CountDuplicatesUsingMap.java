package com.interview.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicatesUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Character> mp = new HashMap<Integer,Character>();
		
		String s = "iamtamil";
		char lst[] = new char[s.length()];
		lst = s.toCharArray();
		for(char c:lst) {
			if(!mp.containsValue(c)) {
				mp.put(0, c);
			}else {
				mp.put(mp.get(c)+1, c);
			}
			
		}
		
		for(EntrySet )
	}

}
