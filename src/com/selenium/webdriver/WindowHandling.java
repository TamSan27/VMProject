package com.selenium.webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://omayo.blogspot.com/");
		Dimension dim = new Dimension(1800, 1200);
		driver.manage().window().setSize(dim);
		driver.findElement(By.linkText("SeleniumTutorial")).click();
		System.out.println("Before switching to Child Window:" + driver.getCurrentUrl());
		Thread.sleep(5000);
		List<String> sessions = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(sessions.get(1));
		System.out.println("After switching to Child Window:" + driver.getCurrentUrl());
		driver.findElement(By.partialLinkText("Eclipse IDE")).click();
		System.out.println("After accessing page:" + driver.getCurrentUrl());
		driver.switchTo().window(sessions.get(0));
		System.out.println("After switching to Parent Window:" + driver.getCurrentUrl());
	}

}
