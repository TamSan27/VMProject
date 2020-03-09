package com.vmetry.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Vino {
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest(alwaysRun = true)
	// Passing Browser parameter from TestNG xml
	public void beforeTest(String browser) {

	// If the browser is Firefox, then do this

	if (browser.equalsIgnoreCase("firefox")) {

	driver = new FirefoxDriver();

	// If browser is IE, then do this

	} else if (browser.equalsIgnoreCase("chrome")) {

	// Here I am setting up the path for my IEDriver

	driver = new ChromeDriver();

	}

	// Doesn't the browser type, lauch the Website

	driver.get("https://google.com");

	}

	// Once Before method is completed, Test method will start

	@Test(groups = { "group1" })
	public void login() throws InterruptedException {

	driver.findElement(By.name("q")).sendKeys("Test@123");

	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	;

	}

	@Test
	public void loginnew() throws InterruptedException {

	driver.findElement(By.name("q")).sendKeys("Hello");

	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	;

	}

	@AfterTest
	public void afterTest() {

	driver.quit();

	}

}
