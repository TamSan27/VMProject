package com.vmetry.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test
	public void validateInputData() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		WebElement srchBox = driver.findElement(By.cssSelector("#sb_form_q"));
		srchBox.sendKeys("Munish Prabhu Paramanantham");
	}
}
