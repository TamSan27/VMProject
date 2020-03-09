package com.java.oops;

public class ThisSuperChild extends ThisSuperParent {
	String nativeLocation;

	public ThisSuperChild(String nativeLocation, String name, int age, float sal) {
		super(name, age, sal);
		this.nativeLocation = nativeLocation;
	}

	public void displayData() {
		super.displayData();
		System.out.println("Native:" + nativeLocation);
	}
}
