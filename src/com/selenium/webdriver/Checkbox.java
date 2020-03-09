package com.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] toolsKnow = { "Qtp", "Selenium webdriver" };
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tamil\\eclipse-workspace\\SeleniumProject\\SeleniumProject\\drivers\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement> checkBoxes = driver.findElements(By.name("tool"));
		for (int i = 0; i < toolsKnow.length; i++) {
			for (int j = 0; j < checkBoxes.size(); j++) {
				WebElement chkBx = checkBoxes.get(j);
				if (chkBx.getAttribute("value").equalsIgnoreCase(toolsKnow[i])) {
					if (chkBx.isDisplayed()) {
						if (chkBx.isEnabled()) {
							if (!chkBx.isSelected()) {
								chkBx.click();
								break;
							}
						}
					}
				}
			}

//			 for (WebElement chkBx : checkBoxes) {
//			 if (chkBx.getAttribute("value").equalsIgnoreCase(toolsKnow[i])) {
//			 if (chkBx.isDisplayed()) {
//			 if (chkBx.isEnabled()) {
//			 if (!chkBx.isSelected()) {
//			 chkBx.click();
//			 break;
//			 }
//			 }
//			 }
//			 }
//			 }
		}
	}

}
