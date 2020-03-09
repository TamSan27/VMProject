package com.java.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List bio = new ArrayList();
		bio.add("Munish");
		bio.add(29);
		bio.add(new Date("10/01/1989"));
		bio.add("Thoothukudi");
		bio.add(40000.00f);
		System.out.println(bio);
		
		bio.get(2);
	}

}
