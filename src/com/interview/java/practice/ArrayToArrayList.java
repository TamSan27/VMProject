package com.interview.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// Three ways to do the conversion
     List<String> lst = new ArrayList<String>();
     String array[]= {"asdasd","tamil","arasan"};
     lst = Arrays.asList(array);
     
     System.out.println(lst);
     
     List<String> list1 = new ArrayList<String>();
     Collections.addAll(list1, array);
     System.out.println(list1);
     
     List<String> list2 = new ArrayList<String>();
     for(String text:array) {
    	 list2.add(text);
     }
     System.out.println(list2);
	}

}
