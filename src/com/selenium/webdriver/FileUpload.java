package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.vmetry.com/Upload.aspx");
		Dimension dim = new Dimension(1800, 1200);
		driver.manage().window().setSize(dim);
		driver.findElement(By.className("fileUpload")).sendKeys("/Users/user/Documents/Training/Vcentry Batch 11/SeleniumProject/file_store/Batch11Crop.png");
	}

}
