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
		driver.get("https://demoqa.com/alerts");
		Dimension dim = new Dimension(1800, 1200);
		driver.manage().window().setSize(dim);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(1000);
		Alert simpleAlert, confirmAlert, prmtAlrt;
		simpleAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		simpleAlert.accept();
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(5000);
		confirmAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		confirmAlert.dismiss();
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(4000);
		prmtAlrt = driver.switchTo().alert();
		prmtAlrt.sendKeys("values");
		prmtAlrt.accept();
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Alert timeAlrt;
		timeAlrt = driver.switchTo().alert();
		timeAlrt.accept();
	}

//	public static String getAlertBtn(String btnName) {
//		return "//button[text()='" + btnName + "']";
//	}
		

}
