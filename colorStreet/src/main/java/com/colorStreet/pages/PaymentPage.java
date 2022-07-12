package com.colorStreet.pages;

import com.colorStreet.commonUtils.BaseUtil;

public class PaymentPage extends BaseUtil {
	
	public static String nameCardTxt = "//input[@name = 'nameoncard']";
	public static String cardNumberTxt = "//input[@id='pan']";
	public static String month = "//select[@name= 'expmonth']";
	public static String Year = "//select[@name= 'expyear']";
	public static String Cvv = "//input[@placeholder= 'CVV']";	
	public static String click="//span[text()='My billing address is the same as my shipping address']";
	public static String SaveContiune = "//button[text()= 'SAVE & CONTINUE']";
//	public static String placeOrderBtn = "//label[text()='Sign up for Color Street emails - receive product news tips, and more!']/preceding::button[1]";
	public static String maillingChkBox = "//*[local-name='svg' and contains(@class, 'transition text-blackest')]/*[local-name='path']";
	public static String placeOrderBtn = "//input[@id='terms']/parent::div/following-sibling::div/button";
	public static String frame = "//iframe[contains(@class,'w-full border-box')]";
}
