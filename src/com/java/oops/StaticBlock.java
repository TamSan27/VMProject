package com.java.oops;

public class StaticBlock {
	static String institute;
	float revenue;

	static {
		System.out.println("In Static Block");
		institute = "VMetry Tech";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In Main Method");
		System.out.println("Institute:" + institute);
		
	}

}
