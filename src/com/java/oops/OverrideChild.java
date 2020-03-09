package com.java.oops;

public class OverrideChild extends OverrideBase {
	float rad, area, pi;

	public OverrideChild() {
		pi = 3.1415f;
	}

	public void setData(float r) {
		System.out.println("Setting up initial value for Child.");
		rad = r;
	}

	public void findArea() {
		System.out.println("Calculating Area of Circle.");
		area = pi * (rad * rad);
	}
	
	public void displayChild() {
		System.out.println("Area:"+area);
	}
}
