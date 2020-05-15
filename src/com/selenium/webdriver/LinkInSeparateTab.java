package com.selenium.webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Opening a link in a separate tab
public class LinkInSeparateTab {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Tamil - Studies doc\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/open-a-new-tab-in-selenium-webdriver-java");
		
		
		//driver.findElement(By.linkText("Automation")).click();
		//System.out.println("Automation clicked");
		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_CONTROL); WebElement
		 * element = driver.findElement(By.linkText("")); element.click();
		 */
	
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); //Takes a sequence of Keys.XXXX or strings; appends each of the values to a string,it will return as String
		driver.findElement(By.linkText("Automation")).sendKeys(selectLinkOpeninNewTab);
		//by sending keys to the link, we can open in a separate tab
		
		
			
		
		
		
		

	}

}
