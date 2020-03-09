package com.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxOptions opt = new FirefoxOptions();
		opt.setHeadless(true);
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://www.bing.com");
		System.out.println("Page Title:" + driver.getTitle());
		System.out.println("Page URL:" + driver.getCurrentUrl());
	}

}
