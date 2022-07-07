package com.colorStreet.pages;

import org.openqa.selenium.By;

import com.colorStreet.commonUtils.BaseUtil;

public class ShoppingBagPage extends BaseUtil {
	
	//public static String shoppingBagBtn = "//span[text()='Shopping Bag']";
	public static String shoppingBagBtn = "//span[@class='relative inline-block w-5 h-[21px]']/span/img[@alt='cart']";
	public static String colorStreetOfferLbl = "(//div[@class='itemdescription'])[last()]";
	public static String checkOutBtn = "//a[@data-action='checkout']";
	public static String returnToCartBtn = "//div[@class='navbar-form navbar-left']/a[text()='dummy']";
	public static String continueAsGuestBtn = "//button[text()='dummy']";
	public static String continueCheckOutBtn = "//button[text()='CONTINUE TO CHECKOUT']";
	public static String offerLbl = "//nav[@id='item-category-nav']/div/div/div/div";
	
	//missing item pop-up description
	public static String freeItemMissingLbl = "(//div[@class='modal-header'])[last()]/preceding::div[5]";
	public static String dontForgetLbl = "(//div[@class='modal-body'])[last()]/preceding::div[5]";
	public static String popUpOfferLbl = "(//div[@class='modal-body'])[last()]/preceding::div[5]/ul/li";
	public static String popUpReturnToCartLbl = "//a[text()='Proceed without Free Item']/preceding::a[text()='Return To Catalog'][1]";
	
	//zip code search for a stylish
	public static String zipCodeTxt = "//button[@aria-controls='headlessui-tabs-panel-4' and text()='Need a stylist?']/ancestor::div[@role='tablist']/following-sibling::div/..//input";
	public static String searchBtn = "//button[@aria-controls='headlessui-tabs-panel-4' and text()='Need a stylist?']/ancestor::div[@role='tablist']/following-sibling::div/..//button[text()='Search']";
	
	//4th stylish
	public static String stylishBtn = "//span[text()='dummy']/following::button[text()='Select Stylist'][1]";
		
	//Add a new address
	public static String firstNameTxt  = "//input[@name='FirstName']";
	public static String lastNameTxt  = "//input[@name='LastName']";
	public static String streetAddress1Txt ="//input[@name='Address1']";
	public static String streetAddress2Txt ="//input[@name='Address2']";
	public static String cityTxt = "//input[@name='City']";
	public static String provinceDD = "//select[@name='State']";
	public static String pincodeTxt = "//input[@name='Zip']";
	public static String emailTxt = "//input[@name='Email']";
	public static String phoneNumberTxt = "//input[@name='Phone']";	
//	public static String shipToThisAddressBtn = "//button[text() = 'Ship To This Address']";
	public static String shipToThisAddressBtn="(//button[text() = 'Ship To This Address'])[2]";
	
	//continue on address
	public static String a = "//span[text() = 'Entered Address:']";
	public static String continueBtn = "//button[text() = 'Continue']";
//	public static String paymentLbl = "//main[@id='site-content']/h2";
	
		
//	public static void getPopUpText () {
//		try {
//			System.out.println(driver.findElement(By.xpath(freeItemMissingLbl)).getText() 
//					+ " " + driver.findElement(By.xpath(dontForgetLbl)).getText());  
//					//+ " " + driver.findElement(By.xpath(popUpOfferLbl)).getText());
//		} catch (Exception a) {
//			a.printStackTrace();
//		}
//	}
	
}
