Feature: color Street validation test
			
	Scenario: Ensure the use case is wroking fine
		Given user launches the application
		When user selects country as "Canada"
		And user select "Solid Colors" from "Shop" drop down
		And user select "3, 6, 9" items from the item result page
		When user navigates to "Shopping Bag" screen
		And user "Checkout" from the cart page
		Then verify colorStree offer as "BUY 3 GET 1 FREE! Colors, Glitters, Nail Art Designs, and French"
		And user "Return To Catalog" to add one more item to the bag
		Then verify colorStree offer description as "Buy 3 Get 1 Free Discount"
		And user "Checkout" from the cart page
		And user opted as "Continue as Guest" option
		When user searches with "07512" zipcode
		And user selects 4th stylist "Morgan Hamway"
	  When user Ship to the address by adding a new shipping address
	  And user "Continue" with all the filled address details
	  Then verify user landed on "Payment" page