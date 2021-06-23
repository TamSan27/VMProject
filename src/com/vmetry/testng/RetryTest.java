package com.vmetry.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetryTest {
	//retryAnalyzer used to rerun the falied test cases
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validateInputData() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		WebElement srchBox = driver.findElement(By.cssSelector("#sb_form_q"));
		srchBox.sendKeys("Munish Prabhu Paramanantham");
	}
}
