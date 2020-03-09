package com.selenium.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
//		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
	}

}
