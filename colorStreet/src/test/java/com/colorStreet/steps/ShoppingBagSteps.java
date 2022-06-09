package com.colorStreet.steps;

import org.junit.Assert;

import com.colorStreet.pages.ShoppingBagPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ShoppingBagSteps extends ShoppingBagPage {
	
	@When ("^user navigates to \"(.*)\" screen$")
	public void user_navigates_to_screen (String cart) {
		clickButton(shoppingBagBtn);
		getElementTextValue(offerLbl);
	}
	
	@When ("^verify colorStree offer description as \"(.*)\"$")
	public void verify_coloStreet_offer_descp (String cart) {
		Assert.assertEquals((cart.trim()), (getElementTextValue(colorStreetOfferLbl).trim()));
	}
	
	@When ("^user \"(.*)\" to add one more item to the bag$")
	public void user_return_to_catalog_to_more_items (String text) {
		//clickButton(shopXpath(returnToCartBtn, text));
		selectAValue();
		clickButton(shoppingBagBtn);
	}
	
	@And ("^user \"(.*)\" from the cart page$")
	public void user_from_the_cart_page (String text) {
		clickButton(checkOutBtn);
	}
	
	@When ("^verify colorStree offer as \"(.*)\"$")
	public void verify_coloStreet_offer (String cart) {
		//Assert.assertEquals((cart.trim()), (getPopUpText());
		getPopUpText();
		clickButton(popUpReturnToCartLbl);
	}
	
	@When ("^user opted as \"(.*)\" option$")
	public void verify_user_selects_option (String text) {
		clickButton(shopXpath(continueAsGuestBtn, text));
	}

	
}
