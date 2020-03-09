package com.java.exceptionhandling;

@SuppressWarnings("serial")
public class InvalidInputException extends Exception {
	String input;

	public InvalidInputException(String input) {
		// TODO Auto-generated constructor stub
		this.input = input;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return input + " is invalid";
	}
}
