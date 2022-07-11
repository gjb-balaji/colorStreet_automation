package com.colorStreet.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseOver {
	public static WebDriver driver;
	public static Properties props = new Properties();
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty(("user.dir")+"//drivers//chromedriver.exe"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
	}

}
