package com.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tamil\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		WebElement autoCpltLink = driver.findElement(By.linkText("Autocomplete"));
		autoCpltLink.click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		Thread.sleep(2500);
		driver.switchTo().frame(frame);
		driver.findElement(By.id("tags")).sendKeys("E");
		Thread.sleep(1000);
		List<WebElement> options = driver
				.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]/li[@class='ui-menu-item']/div"));
		for (WebElement opt : options) {
			if (opt.getText().trim().equalsIgnoreCase("Erlang")) {
				opt.click();
				break;
			}
		}
		Thread.sleep(1500);
		driver.quit();
	}

}
