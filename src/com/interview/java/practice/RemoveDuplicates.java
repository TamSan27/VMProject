package com.interview.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		    
		    	List<Integer> lst = new ArrayList<Integer>();
		    	
		    	  lst.add(10);
		    	  lst.add(20);
		    	  lst.add(40);
		    	  lst.add(10);
		    	  
		    	  System.out.println(lst);
		    	  for(int i=0;i<lst.size();i++) {
		    		  System.out.println(lst.get(i));
		    	  }
		    	  
		    	  Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		    	  for(int i:lst) {
		    		  if(mp.containsKey(i)) {
		    			  mp.put(i,mp.get(i)+1);
		    		  }
		    		  else {
		    			  mp.put(i, 1);
		    		  }
		    	  }
		    	  System.out.println("Duplicate values are:");
		    	  for(Map.Entry<Integer, Integer> entry:mp.entrySet()) {
		    		  System.out.println(entry.getKey()+"--->"+entry.getValue());
		    	  }
			    
		    	  //added logic to remove the duplicates using Map
		    	  for(Map.Entry<Integer, Integer> entry:mp.entrySet()) {
		    		  if(entry.getValue()>1) {
		    			  mp.remove(entry.getKey());
		    		  }
		    	  }
		    	  
		    	  for(Map.Entry<Integer, Integer> entry:mp.entrySet()) {
		    		  System.out.println(entry.getKey()+"--->"+entry.getValue());
		    	  }
		    	  //added logic to remove the duplicates using Set    	  
      Set<Integer> set = new HashSet<Integer>();
      set.addAll(lst);
		/*
		 * for(int i=0;i<lst.size();i++) { set.add(lst.get(i)); }
		 */
      
      System.out.println(set);
		    	  
}
}

