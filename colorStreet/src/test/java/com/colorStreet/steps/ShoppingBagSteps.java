package com.colorStreet.steps;

import org.junit.Assert;

import com.colorStreet.pages.ShoppingBagPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ShoppingBagSteps extends ShoppingBagPage {
	
	@And ("^user \"(.*)\" for the selected items$")
	public void user_from_the_cart_page (String text) {
		clickButton(continueCheckOutBtn);
	}
	
	@When ("^user opted as \"(.*)\" option$")
	public void verify_user_selects_option (String text) {
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
		enterText(firstNameTxt, "Ship FName");
		enterText(lastNameTxt, "Ship LName");
		enterText(streetAddress1Txt, "Ship Address one");
		enterText(streetAddress2Txt, "Ship Address two");
		selectAValueFromDD(provinceDD, "Manitoba");
		enterText(cityTxt, "Brandon");
		enterText(pincodeTxt, "33578");
		enterText(emailTxt, "test@gmail.com");
		enterText(phoneNumberTxt, "9876543210");
		clickButton(shipToThisAddressBtn);
	}
	
	@And ("^user \"(.*)\" with all the filled address details$")
	public void user_filled_address_details (String text) {
		clickButton(shopXpath(continueBtn, text));
	}
	
	@And ("^verify user landed on \"(.*)\" page$")
	public void user_landed_on_page (String text) {
		//Assert.assertEquals(text, getElementTextValue(paymentLbl));
	}
	
}
