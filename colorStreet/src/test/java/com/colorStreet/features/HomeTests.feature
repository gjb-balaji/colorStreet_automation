Feature: color Street home page validation
	
	Scenario Outline: Verify SHOP button works for a valid user
		Given user launches the application
		When user login with "automation" username and "auto123" password
		And user clicks "<menuOption>" menu option
		Then verify "<menuOption>" button works

	Examples:
	| menuOption |
	| Shop			 |
	| Join			 |	
	| Host			 |
	
	Scenario Outline: Verify SHOP button works for a guest user
		Given user launches the application
		And user clicks "<menuOption>" menu option
		Then verify "<menuOption>" button works

	Examples:
	| menuOption |
	| Shop			 |
	| Join			 |	
	| Host			 |
	
#	Scenario: Verify LANGUAGE, STYLIST, LOGIN and SHOPPING CART button works for a valid user
#	    Given user launches the application
#	    When user login with "automation" username and "auto123" password
#	    Then Verify LANGUAGE, STYLIST, LOGIN and SHOPPING CART button works
#	    	    
#	    
	 #Scenario: Verify LANGUAGE and STYLIST button works