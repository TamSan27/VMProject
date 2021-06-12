package com.interview.java.practice;

import java.util.Scanner;

public class PrintSquareBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which needs to print as Square:");
		int number = sc.nextInt();
		
		for(int i=0;i<number;i++) {
			for(int j=0;j<number;j++) {
				if(j==0 || j==number-1 || i==0 ||i==number-1) {
				System.out.print(number+" ");
			}else {
				System.out.print("  ");
			}
			
		}
			System.out.println();
		
	}

}
}
