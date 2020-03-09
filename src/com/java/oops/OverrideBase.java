package com.java.oops;

public class OverrideBase {
	float len, width, area;

	public void setData(float l, float w) {
		System.out.println("Setting up initial value for Base.");
		len = l;
		width = w;
	}

	public void findArea() {
		System.out.println("Calculating Area of Rectangle.");
		area = len * width;
	}

	public void displayBase() {
		System.out.println("Area:" + area);
	}
}
