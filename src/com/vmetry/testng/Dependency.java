package com.vmetry.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dependency {
	WebDriver driver;
	String searchKey;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		searchKey = "Munish Prabhu Paramanantham";
	}
	
	@Test(priority = 0)
	public void validateLogin() {
		driver.get("https://www.bing.com");
	}

	@Test(priority = 1, dependsOnMethods = { "validateLogin" })
	public void validateSearchKey() {
		driver.findElement(By.id("sb_form_q")).sendKeys(searchKey);
		driver.findElement(By.id("sb_form_q")).submit();
	}

	@Test(priority = 2, dependsOnMethods = { "validateSearchKey", "validateLogin" })
	public void validateSearchResult() {
		boolean found = false;
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		for (WebElement tag : tags) {
			if (tag.getText().trim().contains(searchKey)) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
