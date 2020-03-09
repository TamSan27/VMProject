package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(5);
		lst.add(8);
		lst.add(5);
		lst.add(10);
		lst.add(12);
		lst.add(null);
		lst.add(15);
		lst.add(12);
		lst.add(0);

		System.out.println("--------------");
		System.out.println("Elements are:");
		System.out.println("--------------");
		Iterator<Integer> itr = lst.iterator();
		String data;
		while (itr.hasNext()) {
			try {
				data = itr.next().toString();
				System.out.println(data);
			} catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println("null");
			}
		}
		lst.remove(4);
		lst.remove(null);
		lst.remove((Object)0);
		
		System.out.println("--------------");
		System.out.println("After removal Elements are:");
		System.out.println("--------------");
		itr = lst.iterator();
		while (itr.hasNext()) {
			data = itr.next().toString();
			System.out.println(data);
		}
	}

}
