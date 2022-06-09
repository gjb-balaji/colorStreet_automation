package com.colorStreet.pages;

import org.openqa.selenium.By;

import com.colorStreet.commonUtils.BaseUtil;

public class ShoppingBagPage extends BaseUtil {
	
	public static String shoppingBagBtn = "//span[text()='Shopping Bag']";
	public static String colorStreetOfferLbl = "(//div[@class='itemdescription'])[last()]";
	public static String checkOutBtn = "//a[@data-action='checkout']";
	public static String returnToCartBtn = "//div[@class='navbar-form navbar-left']/a[text()='dummy']";
	public static String continueAsGuestBtn = "//a[text()='dummy']";
	public static String offerLbl = "//nav[@id='item-category-nav']/div/div/div/div";
	
	//missing item pop-up description
	public static String freeItemMissingLbl = "(//div[@class='modal-header'])[last()]/preceding::div[5]";
	public static String dontForgetLbl = "(//div[@class='modal-body'])[last()]/preceding::div[5]";
	public static String popUpOfferLbl = "(//div[@class='modal-body'])[last()]/preceding::div[5]/ul/li";
	public static String popUpReturnToCartLbl = "//a[text()='Proceed without Free Item']/preceding::a[text()='Return To Catalog'][1]";
	
	//missing item pop-up description
	public static String zipCodeTxt = "(//div[@class='modal-header'])[last()]/preceding::div[5]";
	//aa
	public static String firstName  = "//input[@placeholder='First Name ']";
	public static String lastName  = "//input[@placeholder='Last Name ']";
	public static String streetAddress="//input[@placeholder='Street Address']";
	public static String streetAddress2="//input[@placeholder='Apartment, suite, unit, building, floor, etc.']";
	public static String city="//input[@placeholder='City']";
	public static String pincode="//input[@placeholder='Postal Code']";
	public static String email="//input[@placeholder='Email']";
	public static String phoneNumber="//input[@placeholder='Phone Number ']";
	public static String shipToThisAddress="//a[text()='Ship to this address']";
	public static String addressValidation="//h3[text()='Address Validation']";
	public static String continueBtn="//a[text()='Continue']";
	
	
	public static void getPopUpText () {
		try {
			System.out.println(driver.findElement(By.xpath(freeItemMissingLbl)).getText() 
					+ " " + driver.findElement(By.xpath(dontForgetLbl)).getText()  
					+ " " + driver.findElement(By.xpath(popUpOfferLbl)).getText());
		} catch (Exception a) {
			a.printStackTrace();
		}
	}
	
}
