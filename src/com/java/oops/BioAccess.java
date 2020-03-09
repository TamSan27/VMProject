package com.java.oops;

public class BioAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bio b1 = new Bio();
		Bio b2 = new Bio();
		Bio b3 = new Bio();
		b1.setData("Munish", "Male", 29, 50000.00f);
		b1.name = "Munish Prabhu Paramanantham";
		b2.setData("KP", "Female", 51, 25000.01f);
		b3.setData("KPP", "Male", 27, 40000.00f);
		b1.displayData();
		b2.displayData();
		b3.displayData();
	}

}
