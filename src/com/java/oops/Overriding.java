package com.java.oops;

import java.util.Scanner;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputReader = new Scanner(System.in);
		OverrideChild child = new OverrideChild();
		float len, wid, rad;
		System.out.println("Enter Length & Width");
		len = inputReader.nextFloat();
		wid = inputReader.nextFloat();
		child.setData(len, wid);
		System.out.println("Enter Radius");
		rad = inputReader.nextFloat();
		child.setData(rad);
		child.findArea();
		child.displayBase();
		child.displayChild();
	}

}
