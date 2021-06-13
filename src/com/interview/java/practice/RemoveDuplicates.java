package com.interview.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {
		    
		    	
		    	  int a[] = { 1, 1, 2, 2, 1,3 };
			        int n = a.length;
		        if (n == 0 || n == 1) {
		           System.out.println(n);
		        }
		  
		        // creating another array for only storing
		        // the unique elements
		        int[] temp = new int[n];
		        int j = 0;
		  
		        for (int i = 0; i < n - 1; i++) {
		            if (a[i] != a[i + 1]) {
		                temp[j++] = a[i];
		            }
		        }
		  
		        temp[j++] = a[n - 1];
		  
		        // Changing the original array
		        for (int i = 0; i < j; i++) {
		            a[i] = temp[i];
		        }
		  
		        // Printing The array elements
		        for (int i = 0; i < j; i++) {
		            System.out.print(a[i] + " ");
		    }
		

		
	

}
}

