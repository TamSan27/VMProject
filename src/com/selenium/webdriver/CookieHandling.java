package com.selenium.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		Set<Cookie> cookieInfo = driver.manage().getCookies();
		Iterator<Cookie> itr = cookieInfo.iterator();
		while (itr.hasNext()) {
			Cookie cookie = (Cookie) itr.next();
			System.out.println("Domain:" + cookie.getDomain());
			System.out.println("Name:" + cookie.getName());
			System.out.println("Path:" + cookie.getPath());
			System.out.println("Value:" + cookie.getValue());
			System.out.println("Expiry Data:" + cookie.getExpiry());
			System.out.println("-------------------------------------");
		}
	}

}
