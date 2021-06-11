package com.interview.java.practice;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,6,3,4,7};
	//	int b[] = new int[5];
		int temp;
		
		for(int i=0;i<a.length;i++) {
			temp = a[i];
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

	}
	}}



