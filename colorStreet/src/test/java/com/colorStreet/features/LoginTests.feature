Feature: color Street validation test
			
	Scenario: Ensure the use case is wroking fine
		Given user launches the application
		When user selects country as "United States"
		And user select "Solid Colors" from "Shop" drop down
		And user select items from the item result page
		And user "Checkout" for the selected items
		And user opted as "Continue As Guest" option
		When user searches with "50009" zipcode
		And user selects a stylist "TESTCristina  Jimenez"
	  When user Ship to the address by adding a new shipping address
	  And user "Continue" with all the filled address details
	  Then verify user landed on "Payment" page