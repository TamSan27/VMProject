package com.java.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> lst = new TreeSet<String>();
		lst.add("Munish");
		lst.add("Kantha");
		lst.add("Munish");
		lst.add("Maris");
		lst.add("Khanna");
		lst.add("Perumal");
		lst.add("Kantha");
		lst.add("Arun");

		System.out.println("--------------");
		System.out.println("Elements are:");
		System.out.println("--------------");
		Iterator<String> itr = lst.iterator();
		String data;
		while (itr.hasNext()) {
			data = itr.next();
			System.out.println(data);
		}
		lst.remove("Kantha");

		System.out.println("--------------");
		System.out.println("After removal Elements are:");
		System.out.println("--------------");
		itr = lst.iterator();
		while (itr.hasNext()) {
			data = itr.next();
			System.out.println(data);
		}
	}

}
