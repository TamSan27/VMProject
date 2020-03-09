package com.java.basics;

public class StringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Munish";
		String name2 = new String("Munish");
		String name3 = "Munish";
//		System.out.println(name1 == name2);
//		System.out.println(name1 == name3);
		
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
	}

}
