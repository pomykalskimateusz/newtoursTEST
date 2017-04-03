Feature: Main page testing

Scenario: Open main page and click links
		Given I open main page
		When I click link "SIGN-ON"
		When I click link "REGISTER"
		When I click link "SUPPORT"
		When I click link "CONTACT"
		Then I should see contact page
		
Scenario: Open sign on page and login as mati96
		Given I open sign on page
		When I fill in login fields with "mati96" "mati96"
		Then I should see flights reservation page
		When I click sign off button
		Then I should see main page
		
Scenario: Open register page and register as specyfic person
		Given I open register page
		When I fill in register fields
		Then I should see thanks for registation