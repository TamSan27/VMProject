package com.interview.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicatesUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		
		String s = "iamtamil";
		char lst[] = new char[7];
		lst = s.toCharArray();
	//	System.out.println("List values are:"+lst);
		for(char c:lst) {
			System.out.println(c);
			if(mp.containsKey(c)) {
				mp.put(c,mp.get(c)+1);
				
			}else {
				mp.put(c, 1);
			}
			
		}
		System.out.println("The charater occurances are:");
		
		for(Map.Entry<Character,Integer> entry: mp.entrySet() ) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
}
}
