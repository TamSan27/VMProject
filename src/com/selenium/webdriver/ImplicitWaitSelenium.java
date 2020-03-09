package com.selenium.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement autoCpltLink = driver.findElement(By.linkText("Autocomplete"));
		autoCpltLink.click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("tags")).sendKeys("Z");
		List<WebElement> options = driver
				.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]/li[@class='ui-menu-item']/div"));
		for (WebElement opt : options) {
			if (opt.getText().trim().equalsIgnoreCase("Zebra")) {
				opt.click();
				break;
			}
		}
		driver.quit();
	}

}
