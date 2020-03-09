package com.vmetry.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Grouping {
	WebDriver driver;

	@BeforeClass(groups = { "All" })
	public void setUp() {
		driver = new ChromeDriver();
	}

	@Test(groups = { "Sanity", "Regression" })
	public void validateLaunchGoogle() {
		driver.get("https://www.google.com/");
	}

	@Test(groups = { "Smoke", "Sanity", "Regression" })
	public void validateLaunchBing() {
		driver.get("https://www.bing.com");
	}

	@Test(groups = { "Regression" })
	public void validateLaunchAsk() {
		driver.get("https://www.ask.com/");
	}

	@Test(groups = { "Smoke", "Regression" })
	public void validateLaunchFacebook() {
		driver.get("https://www.facebook.com/");
	}

	@Test(groups = { "Sanity", "Regression" })
	public void validateLaunchMSN() {
		driver.get("https://www.msn.com/en-in/");
	}

	@Test(groups = { "Regression" })
	public void validateLaunchMyntra() {
		driver.get("https://www.myntra.com/");
	}

	@AfterMethod(groups = { "All" })
	public void afterMethod() throws InterruptedException {
		Thread.sleep(1000);
	}

	@AfterClass(groups = { "All" })
	public void tearDown() throws InterruptedException {
		Thread.sleep(1500);
		driver.quit();
	}
}
