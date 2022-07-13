package com.colorStreet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.colorStreet.commonUtils.BaseUtil;

public class HomePage extends BaseUtil {

	public static String solidColorListItem = "//span[text()='dummy']";
	public static String shopDD = "//div[@class='shrink flex items-center justify-center']/..//a[text()='dummy']";
	public static String quickShopBtn = "//button[text()='Quickshop']";
	public static String cartBagBtn = "//button[text()='ADD TO BAG']";
	public static String findAStylistBtn = "//img[@alt='Country']/following::button[@id='stylistButton'][1]";
	public static String cartBtn = "//img[@alt='Country']/following::img[@alt='cart'][1]";
	public static String countryPopUp = "//div[text()='Select your country and language']";
	public static String stylistTxt = "(//div[@class='text-center']/div[text()='Find A Stylist'])[1]";
	public static String bodyClick = "//div[@class='Overlay_background__sJaVB']";
	
	public static boolean getWindowTitle (String menuOption) {
		try {
			String title = driver.getTitle();
			switch (menuOption) {
			case "Shop" :
				title.contains("products");
				break;
			case "Join" :
				title.contains("enrollment");
				break;
			case "Discover" :
				title.contains("#!");
				break;
			case "Host" :
				title.contains("host");
				break;
			case "Cart" :
				title.contains("cart");
				break;
			case "Login" :
				title.contains("account");
				break;
			}
			System.out.println("Title is = " + title);
			return true;
		} catch (Exception a) {
			a.printStackTrace();
			return false;
		}
	}

	public static boolean elementPresent (String path) {
		try {
			driver.findElement(By.xpath(path)).isDisplayed();
			return true;
		} catch (Exception a) {
			a.printStackTrace();
			return false;
		}
	}
	
}
