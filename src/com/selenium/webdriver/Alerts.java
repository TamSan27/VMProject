package com.selenium.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tamil\\eclipse-workspace\\SeleniumProject\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Dimension dim = new Dimension(1800, 1200);
		driver.manage().window().setSize(dim);
		driver.findElement(By.xpath(getAlertBtn("Simple Alert"))).click();
		Thread.sleep(1000);
		Alert simpleAlert, confirmAlert, prmtAlrt;
		simpleAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		simpleAlert.accept();
		driver.findElement(By.xpath(getAlertBtn("Confirm Pop up"))).click();
		Thread.sleep(1000);
		confirmAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		confirmAlert.dismiss();
		driver.findElement(By.xpath(getAlertBtn("Prompt Pop up"))).click();
		Thread.sleep(1000);
		prmtAlrt = driver.switchTo().alert();
		prmtAlrt.sendKeys("Munish");
		prmtAlrt.accept();
	}

	public static String getAlertBtn(String btnName) {
		return "//button[text()='" + btnName + "']";
	}
		

}
