package com.colorStreet.steps;

import com.colorStreet.pages.HomePage;
import io.cucumber.java.en.And;

public class HomeSteps extends HomePage{
	
	@And ("^user select \"(.*)\" from \"(.*)\" drop down$")
	public void user_select_from_dropdown (String list, String drop) throws Exception {
		Thread.sleep(1000);
		mouseHover(shopXpath(shopDD, drop));
		clickButton(shopXpath(solidColorListItem, list));
	}
	
	@And ("^user select \"(.*)\" items from the item result page$")
	public void user_select_items_from_item_result_page (String items) {
		listElementClick(addToCartBtn);
	}

}
