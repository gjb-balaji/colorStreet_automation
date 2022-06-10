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
	
	//zip code search for a stylish
	public static String zipCodeTxt = "(//input[@id='txtZipCode'])[last()]";
	public static String searchBtn = "(//a[@id='btnSearchZipcode'])[last()]";
	
	//4th stylish
	public static String stylishBtn = "//span[text()='dummy']/following::a[text()='Select Stylist'][1]";
		
	//Add a new address
	public static String firstNameTxt  = "//input[@id='Address_FirstName']";
	public static String lastNameTxt  = "//input[@id='Address_LastName']";
	public static String streetAddress1Txt ="//input[@id='Address_Address1']";
	public static String streetAddress2Txt ="//input[@name='Address.Address2']";
	public static String cityTxt = "//input[@id='Address_City']";
	public static String pincodeTxt = "//input[@id='Address_Zip']";
	public static String emailTxt = "//input[@id='Address_Email']";
	public static String phoneNumberTxt = "//input[@id='Address_Phone']";
	public static String provinceDD = "//Select[@name='Address.State']";
	public static String shipToThisAddressBtn = "//a[@id='new-address']";
	
	
	//continue on address
	public static String a = "//h3[text()='Address Validation']";
	public static String continueBtn = "//a[text()='dummy']";
	public static String paymentLbl = "//main[@id='site-content']/h2";
	
	
	public static void getPopUpText () {
		try {
			System.out.println(driver.findElement(By.xpath(freeItemMissingLbl)).getText() 
					+ " " + driver.findElement(By.xpath(dontForgetLbl)).getText());  
					//+ " " + driver.findElement(By.xpath(popUpOfferLbl)).getText());
		} catch (Exception a) {
			a.printStackTrace();
		}
	}
	
}
