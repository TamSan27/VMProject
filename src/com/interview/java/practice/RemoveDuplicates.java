package com.interview.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
      List<Integer> lst = new ArrayList<Integer>();
      lst.add(12);
      lst.add(14);
      lst.add(12);
      lst.add(15);
      Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
      System.out.println(lst);
      
       for(Integer i:lst) {
        if(mp.containsKey(i)) {
        	mp.put(i, mp.get(i)+1);
        }else {
        	mp.put(i, 1);
        }
  
       }	
       
//       for(Map.Entry<Integer, Integer> entry:mp.entrySet()) {
//    	 int remove =entry.getKey();
//    	 System.out.println(remove);
//    	   if(mp.get(remove)>1) {
//    		   mp.remove(remove);
//    	   }
//       }
       
       for(Integer i:lst) {
           if(mp.containsKey(i)) {
           if(mp.get(i)>1) {
        	   mp.remove(i);
           }
     
          }
       System.out.println("After removing duplicate values:");
       for(Map.Entry<Integer, Integer> entry:mp.entrySet()) {
    	 System.out.println(entry.getKey()+"-->"+entry.getValue());  
       }
       
       }
		
	

}

