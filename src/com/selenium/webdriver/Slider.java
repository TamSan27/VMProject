package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.findElement(By.linkText("Slider")).click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		Thread.sleep(2500);
		driver.switchTo().frame(frame);
		WebElement slider = driver.findElement(By.id("slider"));
		WebElement sliderHndl = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		int sliderWidth = slider.getSize().width;
		System.out.println("Slider Width:" + sliderWidth);
		Actions action = new Actions(driver);
		action.clickAndHold(sliderHndl).moveByOffset(sliderWidth / 2, 0).release(sliderHndl).build().perform();
	}

}
