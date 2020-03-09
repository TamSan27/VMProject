package com.java.oops;

public abstract class AbstractArea {
	float pi;

	public AbstractArea() {
		// TODO Auto-generated constructor stub
		pi = 3.1415f;
	}

	abstract public void displayArea(float area);

	// public void setPi() {
	// pi = 3.1415f;
	// }

	public float getPi() {
		return pi;
	}

}
