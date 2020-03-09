package com.java.exceptionhandling;

public class ThrowException {

	public static void main(String[] args) throws InvalidInputException {
		// TODO Auto-generated method stub
		String input[] = { "123", "4569", "7@9", "xyz", null, "78" };
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			try {
				sum = input[i].length() + Integer.parseInt(input[i]);
				System.out.println("Sum of " + input[i] + " is:" + sum);
			} catch (Exception e) {
				// TODO: handle exception
				// System.out.println(e.getClass().getName() + " occured");
				System.out.println(e.toString());
				throw new InvalidInputException(input[i]);
			}
		}
	}

}
