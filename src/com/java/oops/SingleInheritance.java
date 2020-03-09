package com.java.oops;

import java.util.Scanner;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float radius;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter Radius:");
		radius = inputReader.nextFloat();
		ChildAreaCircle circle = new ChildAreaCircle(radius);
		circle.area();
		circle.displayArea();
	}

}
