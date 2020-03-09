package com.java.oops;

public class InterfaceImp implements InterfaceRectangle {

	@Override
	public float areaCircle(float radius) {
		// TODO Auto-generated method stub
		float area;

		area = pi * (radius * radius);
		return area;
	}

	@Override
	public void display(String type, float result) {
		// TODO Auto-generated method stub
		System.out.println("Area or Volume of " + type + " is:" + result);
	}

	@Override
	public float volumeCone(float radius, float height) {
		// TODO Auto-generated method stub
		float volume;

		volume = pi * (radius * radius) * height;
		return volume;
	}

	@Override
	public float areaRectangle(float len, float wid) {
		// TODO Auto-generated method stub
		float area;

		area = len * wid;
		return area;
	}

}
