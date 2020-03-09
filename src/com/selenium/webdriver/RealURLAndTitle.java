package com.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealURLAndTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cricinfo.com/");
		System.out.println("Page URL" + driver.getCurrentUrl());
		System.out.println("Title:" + driver.getTitle());
	}

}
