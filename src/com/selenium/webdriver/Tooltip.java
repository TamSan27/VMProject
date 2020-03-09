package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		WebElement logo = driver.findElement(By.xpath("//h2[@class='logo']/a"));
		Actions action = new Actions(driver);
		action.moveToElement(logo).build().perform();
		System.out.println("HTML Tooltip:" + logo.getAttribute("title"));
		WebElement tooltipLink = driver.findElement(By.linkText("Tooltip"));
		tooltipLink.click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		Thread.sleep(2500);
		driver.switchTo().frame(frame);
		WebElement ageTextBox = driver.findElement(By.id("age"));
		action.moveToElement(ageTextBox).build().perform();
		Thread.sleep(1000);
		WebElement tooltip = driver.findElement(By.xpath("//div[@role='tooltip']"));
		System.out.println("jQuery Tooltip:" + tooltip.getText().trim());
		Thread.sleep(1500);
		driver.quit();
	}

}
