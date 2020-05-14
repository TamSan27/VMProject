package com.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean found = false;
		System.setProperty("webdriver.chrome.driver","E:\\Tamil - Studies doc\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		/*
		 * WebElement tbl = driver.findElement(By.id("customers")); List<WebElement>
		 * rows = tbl.findElements(By.tagName("tr")); for (WebElement row : rows) {
		 * List<WebElement> cols = row.findElements(By.tagName("td")); for (WebElement
		 * col : cols) { if (col.getText().trim().equalsIgnoreCase("Maria")) {
		 * 
		 * 
		 * found = true; break; } } if (found) { break; } } if (found) {
		 * System.out.println("Contact found"); } else {
		 * System.out.println("Contact NOT found"); }
		 */ //commenting this t verify something new

    
	
	
}
}

		
		
	

