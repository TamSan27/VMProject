package com.java.temp;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> data = new ArrayList<String>();
		data.add("NEST_FLD_L1-1 20181125040758714");
		data.add("NEST_FLD_L1-2 20181125040758714");
		System.out.println("Before Sort:" + data);
		Collections.reverse(data);
		System.out.println("After Sort:" + data);
	}

}
