package com.vmetry.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertions {
	WebDriver driver;
	String url1 = "http://www.cricinfo.com/",
			title1 = "cricinfo - Cricket Live Scores, Stats, Schedules, Fixtures & News";
	String url2 = "https://www.cricbuzz.com/",
			title2 = "Cricket Score, Schedule, Latest News, Stats & Videos | cricbuzz.com";

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(url1);
	}

	@Test(priority = 0)
	public void validateCricinfo() {
		Assert.assertEquals(driver.getCurrentUrl(), url1);
		Assert.assertEquals(driver.getTitle(), title1);
	}

	@Test(priority = 1)
	public void validateCricBuzz() {
		driver.get(url2);
		Assert.assertEquals(driver.getCurrentUrl(), url2);
		Assert.assertEquals(driver.getTitle(), title2);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(1500);
		driver.quit();
	}
}
