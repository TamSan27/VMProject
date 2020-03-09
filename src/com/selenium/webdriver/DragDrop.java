package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		WebElement droppableLink = driver.findElement(By.linkText("Droppable"));
		droppableLink.click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		Thread.sleep(2500);
		driver.switchTo().frame(frame);
		WebElement dragDropSrc = driver.findElement(By.id("draggable"));
		WebElement dragDropDest = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
//		action.dragAndDrop(dragDropSrc, dragDropDest).build().perform();
		action.clickAndHold(dragDropSrc).moveToElement(dragDropDest).build().perform();
//		To exit from Frame
		driver.switchTo().defaultContent();
	}

}
