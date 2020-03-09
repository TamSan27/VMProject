package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Default Width:" + driver.manage().window().getSize().width);
		System.out.println("Default Height:" + driver.manage().window().getSize().height);
		Dimension dim = new Dimension(1800, 1200);
		driver.manage().window().setSize(dim);
		driver.get("https://jqueryui.com");
		driver.findElement(By.linkText("Resizable")).click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		Thread.sleep(2500);
		driver.switchTo().frame(frame);
		WebElement resizeComponent = driver.findElement(By.id("resizable"));
		WebElement resizeHndl = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions action = new Actions(driver);
		int resizeWidth = resizeComponent.getSize().width;
		action.clickAndHold(resizeHndl).moveByOffset(resizeWidth + 100, 0).release(resizeHndl).build().perform();
	}

}
