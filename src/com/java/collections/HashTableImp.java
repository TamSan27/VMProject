package com.java.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new Hashtable<Integer, String>();
		mp.put(9, "Mac");
		mp.put(11, "Munish");
		mp.put(1, "Munish");
		mp.put(5, "Kantha");
		mp.put(4, "Perumal");
		mp.put(2, "Kantha");
		mp.put(3, "Munish");
		mp.put(1, "Maris");
		mp.put(3, "Maris Khanna");

		System.out.println("--------------");
		System.out.println("Elements are:");
		System.out.println("--------------");
		for (Map.Entry<Integer, String> ent : mp.entrySet()) {
			System.out.print(ent.getKey() + "-->" + ent.getValue());
			System.out.println();
		}
	}

}
