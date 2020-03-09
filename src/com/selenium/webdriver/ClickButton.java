package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.bing.com/");
		 WebElement srchBox = driver.findElement(By.id("sb_form_q"));
		 srchBox.sendKeys("Munish Prabhu Paramanantham");
		 WebElement srcBtn = driver.findElement(By.name("go"));
		 srcBtn.click();
	}

}
