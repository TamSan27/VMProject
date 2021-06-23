package com.interview.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,2,5,4,7};
	//	int b[] = new int[5];
		int temp;
		
		List<Integer> lst = new ArrayList<Integer>();
		//	lst = Arrays.asList(a); this won't work
			for(int value:a) {
				
				lst.add(value);
			}
			Collections.sort(lst);
		//	Collections.sort(lst,Collections.reverseOrder());
			System.out.println("Array sorted using Collections:"+lst);
		
		for(int i=0;i<a.length;i++) {
		//	temp = a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
				}
			}
			
		}
		System.out.println("Array is sorted:");
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);

		
		//using Collections
	
	}
	}}



