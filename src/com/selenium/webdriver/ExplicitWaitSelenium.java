package com.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Autocomplete")));
		WebElement autoCpltLink = driver.findElement(By.linkText("Autocomplete"));
		autoCpltLink.click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		driver.findElement(By.id("tags")).sendKeys("E");
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
				By.xpath("//ul[contains(@class,'ui-autocomplete')]/li[@class='ui-menu-item']/div")));
		List<WebElement> options = driver
				.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]/li[@class='ui-menu-item']/div"));
		for (WebElement opt : options) {
			if (opt.getText().trim().equalsIgnoreCase("Erlang")) {
				opt.click();
				break;
			}
		}
		driver.quit();
	}

}
