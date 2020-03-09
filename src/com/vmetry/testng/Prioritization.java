package com.vmetry.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Prioritization {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void validateLaunchGoogle() {
		driver.get("https://www.google.com/");
	}

	@Test(priority = 1)
	public void validateLaunchBing() {
		driver.get("https://www.bing.com");
	}

	@Test(priority = 2)
	public void validateLaunchFacebook() {
		driver.get("https://www.facebook.com/");
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
