package com.vmetry.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SkipTestCase {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
	}

	@Test
	public void validateLaunchBing() {
		driver.get("https://bing.com/");
	}

	@Test
	public void validateLaunchTamilRockers() {
		throw new SkipException("This site has been banned by Tamilnadu Government");
	}

	@Test
	public void validateLaunchTamilGun() {
		throw new SkipException("This site has been banned by Tamilnadu Government");
	}

	@Test
	public void validateLaunchGoogle() {
		driver.get("https://www.google.com/");
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(1500);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		driver.quit();
	}
}
