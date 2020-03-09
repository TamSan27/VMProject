package com.vmetry.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuiteFileParameterization {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "url" })
	public void setUp(String browser, String aut) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(aut);
	}

	@Test(priority = 0)
	@Parameters({ "candidate" })
	public void validateUserPresence(String user) {
		boolean found = false;

		WebElement tbl = driver.findElement(By.id("customers"));
		List<WebElement> rows = tbl.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for (WebElement col : cols) {
				if (col.getText().trim().equalsIgnoreCase(user)) {
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
		}
		if (found) {
			System.out.println("Contact found");
		} else {
			System.out.println("Contact NOT found");
		}
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(1500);
		driver.quit();
	}
}
