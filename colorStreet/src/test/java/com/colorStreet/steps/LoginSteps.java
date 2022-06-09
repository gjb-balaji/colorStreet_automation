package com.colorStreet.steps;


import com.colorStreet.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps extends LoginPage {
	
	@Given ("^user launches the application$")
	public void user_launches_app () throws Exception {
		openBrowser();
		launchApp();
	}
	
	@When ("^user selects country as \"(.*)\"$")
	public void user_selects_country (String value) throws Exception {
		selectAValueFromDD(CountryDD, value);
		clickButton(SubmitBtn);
	}
	
	
	
}
