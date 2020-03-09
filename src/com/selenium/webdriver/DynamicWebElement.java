package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement gender = driver.findElement(By.xpath(getGender("Female")));
		if (gender.isDisplayed()) {
			if (gender.isEnabled()) {
				if (!gender.isSelected()) {
					gender.click();
				}
			}
		}
	}

	public static String getGender(String gender) {
		String genderLocator = "//label[text()='" + gender + "']/preceding-sibling::input[@name='sex']";
		System.out.println("Gender Loctor:" + genderLocator);
		return genderLocator;
	}
}
