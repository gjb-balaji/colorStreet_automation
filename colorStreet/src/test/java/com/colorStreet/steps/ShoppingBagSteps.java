package com.colorStreet.steps;

import org.junit.Assert;
import java.util.concurrent.TimeUnit;
import com.colorStreet.pages.ShoppingBagPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ShoppingBagSteps extends ShoppingBagPage {
	
	@And ("^user \"(.*)\" for the selected items$")
	public void user_from_the_cart_page (String text) {
		clickButton(continueCheckOutBtn);
	}
	
	@When ("^user opted as \"(.*)\" option$")
	public void verify_user_selects_option (String text) throws Exception {
		Thread.sleep(1000);
		clickButton(shopXpath(continueAsGuestBtn, text));
	}
	
	@When ("^user searches with \"(.*)\" zipcode$")
	public void user_searches_with_zipcode (String text) {
		enterText(zipCodeTxt, text);
		clickButton(searchBtn);
	}

	@And ("^user selects a stylist \"(.*)\"$")
	public void user_selects_stylist (String text) {
		clickButton(shopXpath(stylishBtn, text));
		
	}
	
	@And ("^user Ship to the address by adding a new shipping address$")
	public void user_Ship_to_address () {
		enterText(firstNameTxt, props.getProperty("ship_firstName"));
		enterText(lastNameTxt, props.getProperty("ship_lastName"));
		enterText(streetAddress1Txt, props.getProperty("ship_address1"));
		enterText(streetAddress2Txt, props.getProperty("ship_address2"));
		selectAValueFromDD(provinceDD, props.getProperty("ship_province"));
		enterText(cityTxt, props.getProperty("ship_city"));
		enterText(pincodeTxt, props.getProperty("ship_pinCode"));
		enterText(emailTxt, props.getProperty("ship_email"));
		enterText(phoneNumberTxt, props.getProperty("ship_phoneNumber"));
		clickButton(shipToThisAddressBtn);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickButton(continueBtn);
	}
	
}
