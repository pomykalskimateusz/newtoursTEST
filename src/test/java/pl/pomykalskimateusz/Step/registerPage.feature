Feature: Register page testing

Scenario: Open register page and register as specyfic person
		Given I open register page
		When I fill in register fields
		Then I should see thanks for registation