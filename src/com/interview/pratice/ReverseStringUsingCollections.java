package com.interview.pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseStringUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string that needs to be reversed:");
		
		String str = sc.nextLine();
		
		if(str==null||str=="") {
			System.out.println("Reversed string is:"+str);
		}else {
		
		List<Character> list = new ArrayList<Character>();
		for(char c:str.toCharArray()) {
			list.add(c);
		}
		
		Collections.reverse(list);
		
		//to convert Arraylist into string we are using StringBuilder
		
		StringBuilder builder = new StringBuilder(list.size());
		for(char c:list) {
			builder.append(c);
		}
		builder.toString();
		
		System.out.println("Reversed string is:"+builder);
	}
	}

}
