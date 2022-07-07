package com.colorStreet.steps;


import com.colorStreet.pages.LoginPage;

import io.cucumber.java.en.And;
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
		clickButton(countryBtn);
		selectAValueFromDD(CountryDD, value);
		clickButton(SubmitBtn);
	}
	
	@And ("^user login with \"(.*)\" username and \"(.*)\" password$")
	public void user_login_with_uName_pWord (String uName, String pWord) {
		clickButton(userLoginBtn);
		enterText(userNameTxt, uName);
		enterText(passWordTxt, pWord);
		clickButton(signInBtn);
	}
	
	@And ("^user logout from the application$")
	public void user_logout_from_the_app () {
		clickButton(userLoginBtn);
		clickButton(signOutBtn);
	}
	
}
