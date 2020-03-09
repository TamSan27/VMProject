package com.java.oops;

public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Native:" + StaticMembers.nativity);
		StaticMembers.printNativity();
		System.out.println("------------------------");
		StaticMembers.nativity = "Tamilan";
		StaticMembers.printNativity();
		System.out.println("------------------------");
		StaticMembers sm1 = new StaticMembers();
		sm1.setData("Justin ", 29, 50000.00f);
		sm1.nativity = "Canadian";
		sm1.printData();
		System.out.println("------------------------");
		StaticMembers sm2 = new StaticMembers();
		sm2.setData("Trump", 28, 40000.00f);
		sm2.nativity = "American";
		sm2.printData();
		System.out.println("------------------------");
		StaticMembers sm3 = new StaticMembers();
		sm3.setData("Putin", 27, 30000.00f);
		sm3.printData();
	}

}
