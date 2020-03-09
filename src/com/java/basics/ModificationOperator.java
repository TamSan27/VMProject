package com.java.basics;

import java.util.Scanner;

public class ModificationOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, a, b, c, d,e;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter th value of i & j:");
		i = inputReader.nextInt();
		j = inputReader.nextInt();
		a = i++;
		b = --i;
		c = ++j;
		d = j--;
		e = i++ - --j;
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		System.out.println("C:"+c);
		System.out.println("D:"+d);
		System.out.println("E:"+e);
		System.out.println("I:"+i);
		System.out.println("J:"+j);
	}

}
