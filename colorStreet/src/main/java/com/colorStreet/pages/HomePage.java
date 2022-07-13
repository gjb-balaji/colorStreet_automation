package com.colorStreet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.colorStreet.commonUtils.BaseUtil;

public class HomePage extends BaseUtil {

	public static String solidColorListItem = "//span[text()='dummy']";
	public static String shopDD = "//a[text()='dummy']";
	public static String quickShopBtn = "//button[text()='Quickshop']";
	public static String cartBagBtn = "//button[text()='ADD TO BAG']";
	
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
			}
			System.out.println("Title is = " + title);
			return true;
		} catch (Exception a) {
			a.printStackTrace();
			return false;
		}
	}
	
}
