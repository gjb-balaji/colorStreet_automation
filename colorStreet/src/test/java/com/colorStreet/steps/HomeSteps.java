package com.colorStreet.steps;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.colorStreet.pages.HomePage;
import com.colorStreet.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class HomeSteps extends HomePage {
	
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
	
	@And ("user clicks {string} menu option")
	public void user_clicks_menu_option (String menuOption) throws Exception {
		clickButton(shopXpath(shopDD, menuOption));
		Thread.sleep(1000);
	}
	
	@And ("verify {string} button works")
	public void verify_button_works (String menuOption) {
		Assert.assertTrue(getWindowTitle(menuOption));
	}
	
	@And ("Verify LANGUAGE, STYLIST, LOGIN and SHOPPING CART button works")
	public void verify_menu_option_buttons () {
		LoginPage lp = new LoginPage();
		
		clickButton(lp.userLoginBtn);
		Assert.assertTrue(getWindowTitle("Login"));
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		clickButton(cartBtn);
		Assert.assertTrue(getWindowTitle("Cart"));
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		clickButton(findAStylistBtn);
		Assert.assertTrue(elementPresent(stylistTxt));
		Actions action = new Actions (driver);
		action.sendKeys(Keys.ESCAPE);
		//clickButton(bodyClick);
		clickButton(lp.countryBtn);
		Assert.assertTrue(elementPresent(countryPopUp));
		//clickButton(bodyClick);
		action.sendKeys(Keys.ESCAPE);
	}
	
}
