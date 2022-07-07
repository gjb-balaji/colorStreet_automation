Feature: color Street validation test
			
#	Scenario: Ensure user can place an order without login to the application
#		Given user launches the application
#		When user selects country as "United States"
#		And user select "Solid Colors" from "Shop" drop down
#		And user select items from the item result page
#		And user "Checkout" for the selected items
#		And user opted as "Continue As Guest" option
#		When user searches with "50009" zipcode
#		And user selects a stylist "TESTCristina  Jimenez"
#	  When user Ship to the address by adding a new shipping address
#	  Then verify user continue with all the filled payment details
    #Then verify user can "Place Your Order"
	  
	Scenario: Ensure user can place an order by login with a valid user
		Given user launches the application
		When user login with "automation" username and "auto123" password
		When user selects country as "United States"
		And user select "Solid Colors" from "Shop" drop down
		And user select items from the item result page
		And user "Checkout" for the selected items
		And user opted as "Continue As Guest" option
		When user searches with "50009" zipcode
		And user selects a stylist "TESTCristina  Jimenez"
	  When user Ship to the address by adding a new shipping address
	  Then verify user continue with all the filled payment details
    Then verify user can "Place Your Order"
    And user logout from the application
	
	