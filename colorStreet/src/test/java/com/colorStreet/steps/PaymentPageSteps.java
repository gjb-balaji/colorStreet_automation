package com.colorStreet.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.colorStreet.pages.PaymentPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PaymentPageSteps extends PaymentPage {
	
	@Then ("^verify user continue with all the filled payment details$")
	public void user_continue_with_all_filled () throws Exception {
		enterText(nameCardTxt, props.getProperty("card_name"));
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath(frame)));
		enterText(cardNumberTxt, props.getProperty("card_number"));
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		selectAValueFromDD(month, props.getProperty("card_month"));
		selectAValueFromDD(Year, props.getProperty("card_year"));
		enterText(Cvv, props.getProperty("card_CVV"));
		//clickButton(maillingChkBox);
		clickButton(SaveContiune);	
		Thread.sleep(500);
	}
	
	@Then ("^verify user can \"(.*)\"$")
	public void verify_the_text (String text) {
		Assert.assertEquals(text, getElementTextValue(placeOrderBtn));	
	}
}
