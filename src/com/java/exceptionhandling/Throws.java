package com.java.exceptionhandling;

import java.io.IOException;

public class Throws {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String input[] = { "123", "4569", "7@9", "xyz", null, "78" };
		for (int i = 0; i <= input.length; i++) {
			try {
				findSum(input[i]);
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println(input[i] + " is invalid input");
			} catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println("null is invalid input");
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("Dont cross the boundary");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getClass().getName() + " occured");
			}
		}
	}

	public static void findSum(String data) throws IOException {
		int sum = 0;
		sum = data.length() + Integer.parseInt(data);
		System.out.println("Sum of " + data + " is:" + sum);
	}

}
