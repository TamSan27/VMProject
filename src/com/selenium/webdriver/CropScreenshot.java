package com.selenium.webdriver;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CropScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tamil\\git\\VMProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().fullscreen();
		File srcImg = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcImg,
				new File("/Users/user/Documents/Training/Vcentry Batch 11/SeleniumProject/file_store/Batch11.pngâ�©"));
		BufferedImage sourceImg, cropImg;
		sourceImg = ImageIO.read(srcImg);
		WebElement tbl = driver.findElement(By.id("customers"));
		Point pt = tbl.getLocation();
		int xAxis, yAxis, length, width;
		xAxis = pt.x;
		yAxis = pt.getY();
		length = tbl.getSize().height;
		width = tbl.getSize().getWidth();
		Thread.sleep(1000);
		cropImg = sourceImg.getSubimage(xAxis, yAxis, width, length);
		ImageIO.write(cropImg, "png", srcImg);
		FileUtils.copyFile(srcImg,
				new File("/Users/user/Documents/Training/Vcentry Batch 11/SeleniumProject/file_store/Batch11Crop.png"));
		Thread.sleep(1000);
		driver.quit();
	}

}
