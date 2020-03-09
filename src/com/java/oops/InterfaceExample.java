package com.java.oops;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float result;
		InterfaceImp imp = new InterfaceImp();
		result = imp.areaCircle(4.8f);
		imp.display("Circle", result);

		result = imp.volumeCone(5.7f, 10.7f);
		imp.display("Cone", result);

		result = imp.areaRectangle(6.7f, 18.1f);
		imp.display("Rectangle", result);
	}
}
