package com.java.oops;

public class ChildAreaCircle extends BaseFormulaConstant {
	float area, radius;

	public ChildAreaCircle(float rad) {
		// TODO Auto-generated constructor stub
		radius = rad;
	}

	public void area() {
		area = getPi() * radius * radius;
	}

	public void displayArea() {
		System.out.println("Area of Circle:" + area);
	}
}
