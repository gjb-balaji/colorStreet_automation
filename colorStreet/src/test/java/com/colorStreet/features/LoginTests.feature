Feature: color Street validation test
			
	Scenario: Ensure the use case is wroking fine
		Given user launches the application
		When user selects country as "Canada"
		And user select "Solid Colors" from "Shop" drop down
		And user select items from the item result page
		When user navigates to "Shopping Bag" screen
		And user "Checkout" from the cart page
		And user opted as "Continue As Guest" option
		When user searches with "07512" zipcode
		And user selects 4th stylist "Morgan Hamway"
	  When user Ship to the address by adding a new shipping address
	  And user "Continue" with all the filled address details
	  Then verify user landed on "Payment" page