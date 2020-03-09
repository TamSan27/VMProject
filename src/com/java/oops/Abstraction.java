package com.java.oops;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCircle circle = new AreaCircle();
		float areaCircle;
		areaCircle = circle.getArea(5.7f);
		circle.displayArea(areaCircle);
	}

}
