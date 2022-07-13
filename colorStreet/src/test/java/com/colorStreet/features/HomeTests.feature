Feature: color Street home page validation
	
	Scenario Outline: Verify SHOP button works
		Given user launches the application
		When user login with "automation" username and "auto123" password
		When user selects country as "United States"
		And user clicks "<menuOption>" menu option
		Then verify "<menuOption>" button works

	Examples:
	| menuOption |
	| Shop			 |
	| Host			 |
#	| Join			 |	