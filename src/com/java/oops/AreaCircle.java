package com.java.oops;

public class AreaCircle extends AbstractArea {

	public float getArea(float rad) {
		return getPi() * (rad * rad);
	}

	@Override
	public void displayArea(float area) {
		// TODO Auto-generated method stub
		System.out.println("Area:"+area);
	}

}
