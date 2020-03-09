package com.vmetry.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In Before Suite");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In Before Method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("In after Test");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("In after Class");
	}

	@Test
	public void test1() {
		System.out.println("Test Case 1");
		method2();
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("In Before Class");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("In after Suite");
	}

	public void method1() {
		System.out.println("In method 1");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("In Before Test");
	}

	@Test
	public void test2() {
		System.out.println("Test Case 2");
		method1();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("In after method");
	}

	public void method2() {
		System.out.println("In method 2");
	}
}
