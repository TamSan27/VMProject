package com.interview.selenium.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowthaman\\git\\VMProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
		// TODO Auto-generated method stub
		int count = 0;
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']//th"));
		for(WebElement e:headers) {
			count++;
			if(e.getText().equalsIgnoreCase("Country")) {
				break;
			}
		}
		
		System.out.println("Print the Country index:"+count);
		String company = "Island Trading";
		WebElement countryEle = driver.findElement(By.xpath("//td[text()='"+company+"']/parent::tr/td["+(count)+"]"));
		String countryName = countryEle.getText();
		System.out.println("Country is:"+countryName);
		
		List<WebElement> totalRows = new ArrayList<WebElement>();
		totalRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		Map<Integer,List<List<String>>> tableValues = new HashMap<Integer,List<List<String>>>();
		
		List<WebElement> rowElements;
		for(int i=1;i<=totalRows.size();i++) {
			
			 rowElements = driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]//*")); 
			 
			List<String> rowValues = new ArrayList<String>();
			for(WebElement e:rowElements) {
	            rowValues.add(e.getText());
			}
			List<List<String>> value = new ArrayList<List<String>>();
			value.add(rowValues);
					
			tableValues.put(i, value);
				
				}
		
		System.out.println("Printing table values:"+tableValues);
		
		for(Map.Entry<Integer, List<List<String>>> en:tableValues.entrySet()) {
			System.out.println("Row "+en.getKey()+" :"+en.getValue());
		}
		
		driver.quit();
	}

		finally {
			driver.quit();
		}
}
}
