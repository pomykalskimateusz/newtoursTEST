Feature: Reservation testing

Scenario: Sign on as mati96 and do reservation for 1 person
		Given I open sign on page
		When I fill in login fields with "mati96" "mati96"
		Then I should see flights reservation page
		When I fill in first reservation fields for "1" person
		Then I should see second reservation page
		When I fill in second reservation fields
		Then I should see third reservation page
		When I fill in third reservation fields
		Then I should see flight confirmation