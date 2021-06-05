package com.vmetry.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestCase {
	//retryAnalyzer used to rerun the falied test cases
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validateInputData() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.co/");
		WebElement srchBox = driver.findElement(By.cssSelector("#sb_form_q"));
		srchBox.sendKeys("Munish Prabhu Paramanantham");
	}
}
