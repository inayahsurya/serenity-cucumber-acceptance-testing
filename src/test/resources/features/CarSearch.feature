Feature: Validation of car search page
  In order to validate car search
  as a buyer
  I navigate to http://www.carsguide.com.au

  Scenario: Searching for a new car
    Given User is on the home page
    When User move to Buy and Sell Menu
    Then User click on Search Cars
    And User select car Make as "BMW"
    And User select car Model as "1 Series"
    And User select car Location as "Any Location"
    And User select car Price to $"10000"
    And User click on Find My Next Car button
    Then User should see list of searched cars
    And Page title should be "Bmw 1 Series Under 10000 for Sale | carsguide"
