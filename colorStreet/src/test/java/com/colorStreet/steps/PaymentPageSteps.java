package com.colorStreet.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.colorStreet.pages.PaymentPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PaymentPageSteps extends PaymentPage {
	
	@Then ("^verify user continue with all the filled payment details$")
	public void user_continue_with_all_filled () throws Exception {
		//Thread.sleep(3000);
		enterText(nameCardTxt, "myname_card");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'w-full border-box')]")));
		enterText(cardNumberTxt, "4111111111111111");
		driver.switchTo().defaultContent();
		selectAValueFromDD(month, "April");
		selectAValueFromDD(Year, "2024");
		enterText(Cvv, "123");
		//clickButton(maillingChkBox);
		clickButton(SaveContiune);	
		Thread.sleep(500);
	}
	
	@Then ("^verify user can \"(.*)\"$")
	public void verify_the_text (String text) {
		Assert.assertEquals(text, getElementTextValue(placeOrderBtn));	
	}
}
