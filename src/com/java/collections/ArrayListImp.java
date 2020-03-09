package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("Munish");
		lst.add("Kantha");
		lst.add("Munish");
		lst.add("Maris");
		lst.add("Khanna");
		lst.add(null);
		lst.add("Perumal");
		lst.add("Kantha");
		lst.add("Arun");

		System.out.println("--------------");
		System.out.println("Elements are:");
		System.out.println("--------------");
		Iterator<String> itr = lst.iterator();
		String data;
//		while (itr.hasNext()) {
//			data = itr.next();
//			System.out.println(data);
//		}
		for (String lstVal : lst) {
		System.out.println(lstVal);	
		}
//		lst.remove(4);
//		lst.remove("Kantha");
//		
//		System.out.println("--------------");
//		System.out.println("After removal Elements are:");
//		System.out.println("--------------");
//		itr = lst.iterator();
//		while (itr.hasNext()) {
//			data = itr.next();
//			System.out.println(data);
//		}
	}

}
