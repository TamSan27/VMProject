package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listeners {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		CustomListener lstn = new CustomListener();
		EventFiringWebDriver driver = new EventFiringWebDriver(wd);
		driver.register(lstn);
		driver.get("https://www.bing.com/");
		WebElement srchBox = driver.findElement(By.id("sb_form_q"));
		srchBox.sendKeys("Munish Prabhu Paramanantham");
		Thread.sleep(1500);
		srchBox.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1500);
		driver.navigate().back();
		Thread.sleep(1500);
		driver.navigate().refresh();
		driver.unregister(lstn);
		Thread.sleep(1500);
		driver.navigate().forward();
	}

	public static String getAlertBtn(String btnName) {
		return "//button[text()='" + btnName + "']";
	}
}
