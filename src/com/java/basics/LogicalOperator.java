package com.java.basics;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8, b = 5;
		boolean andOp, orOp, notOp;
		andOp = (a == 8) && (b == 7);
		System.out.println("And:" + andOp);
		orOp = (a > 9) || (b <= 6);
		System.out.println("Or:" + orOp);
		notOp = !orOp;
		System.out.println("Not:" + notOp);
	}

}
