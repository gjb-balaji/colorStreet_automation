package com.colorStreet.steps;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import com.colorStreet.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class HomeSteps extends HomePage{
	
	@And ("^user select \"(.*)\" from \"(.*)\" drop down$")
	public void user_select_from_dropdown (String list, String drop) throws Exception {
		mouseHover(shopXpath(shopDD, drop));
		clickButton(shopXpath(solidColorListItem, list));
	}
	
	@And ("^user select items from the item result page$")
	public void user_select_items_from_item_result_page () {
		listElementClick(quickShopBtn);
		clickButton(cartBagBtn);
	}

	@When ("^user navigates to \"(.*)\" screen$")
	public void user_navigates_to_screen (String cart) {
		clickButton(cartBagBtn);
	}
	
	@And ("user clicks \"(.*)\" menu option")
	public void user_clicks_menu_option (String menuOption) throws Exception {
		clickButton(shopXpath(shopDD, menuOption));
		Thread.sleep(1000);
	}
	
	@And ("verify \"(.*)\" button works")
	public void verify_button_works (String menuOption) {
		Assert.assertTrue(getWindowTitle(menuOption));
	}
	
}
