package com.java.basics;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strBfr = new StringBuffer("Munish");
		System.out.println(strBfr);
		System.out.println(strBfr.reverse());
		
		StringBuilder strBldr = new StringBuilder("MPP");
		System.out.println(strBldr);
		System.out.println(strBldr.reverse());	
	}

}
