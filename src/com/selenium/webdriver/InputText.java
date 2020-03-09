package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		WebElement srchBox = driver.findElement(By.cssSelector("#sb_form_q"));
		srchBox.sendKeys("Munish Prabhu Paramanantham");
		Thread.sleep(5000);
		srchBox.clear();
	}

}
