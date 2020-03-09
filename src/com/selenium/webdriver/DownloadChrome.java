package com.selenium.webdriver;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map preference = new HashMap();
		preference.put("download.default_directory",
				"/Users/user/Documents/Training/Vcentry Batch 11/SeleniumProject/file_store");
		preference.put("download.prompt_for_download", false);
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("prefs", preference);
		WebDriver driver = new ChromeDriver(opt);
		driver.get("http://www.principlesofeconometrics.com/excel.htm");
		driver.findElement(By.xpath("//a[text()='cola']")).click();
	}

}
