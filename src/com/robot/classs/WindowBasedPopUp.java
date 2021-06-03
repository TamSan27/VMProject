package com.robot.classs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBasedPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tamil\\git\\VMProject\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tamizhazhagan27@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
	}

}
