package com.interview.java.practice;

public class PrintABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "ABCDEFGHIJKLMNOP";

		char[] abcd = value.toCharArray();
		for(int i=0;i<abcd.length;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print(abcd[j]);
			if(j<i) {
				System.out.print("-");
			}
		}
			System.out.println();
		
		
	}

}
}

