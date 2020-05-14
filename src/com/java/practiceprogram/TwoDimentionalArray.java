package com.java.practiceprogram;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int[][] A = new int[2][2];
	A[0][0] =1;
	A[0][1] =2;
	A[1][0]=3;
	A[1][1]=4;
	//A[0][2]=3;
	
int temp = 0;
	
	for(int i=0,j=0;i<2&j<2
			;i++,j++)
	{
		
		if(A[i][j]==4) {
			temp = i;
		}
		System.out.println(A[i][j]);
	}
	
	System.out.println(temp);
}
}
