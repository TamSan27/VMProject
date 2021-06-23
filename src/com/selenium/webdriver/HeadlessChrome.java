
  package com.selenium.webdriver;
  
  import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.chrome.ChromeDriver; import
  org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
  
  public class HeadlessChrome {
	  public static void main(String[] args) throws  InterruptedException {
	  // TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions opt =  new ChromeOptions(); 
		  opt.setHeadless(true);
		  
           WebDriver driver = new ChromeDriver(opt);
           driver.get("https://www.bing.com");
        System.out.println("Page Title:" + driver.getTitle());
        System.out.println("Page URL:" + driver.getCurrentUrl()); } 
	  } 
  //gives some issues, so commneted
  
 