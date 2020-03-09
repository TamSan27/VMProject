package com.java.exceptionhandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input[] = { "123", "4569", "7@9", "xyz", null, "78" };
		int sum = 0;
		for (int i = 0; i <= input.length; i++) {
			try {
				sum = input[i].length() + Integer.parseInt(input[i]);
				System.out.println("Sum of " + input[i] + " is:" + sum);
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println(input[i] + " is invalid input");
			}
			catch (NullPointerException e) {
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

}
