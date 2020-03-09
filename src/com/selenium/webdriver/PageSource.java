package com.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://paytm.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println(driver.getPageSource());
	}

}
