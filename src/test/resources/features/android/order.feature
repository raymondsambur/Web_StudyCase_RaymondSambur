@Android
Feature: Login

  Scenario: login with correct username and password
    Given User is on moka start page android
    And User click sign in button on moka start page android
    And User is on login page
    And User input "082189814330" as username
    And User input "Natalia24" as password
    And User click sign in button on login page
    And User is on moka main page
    When User click "Chicken Wings" with quantity of 1 in item list
    And User click "Chicken Drum Stick" with quantity of 1 in item list
    And User click charge button on shopping cart
    And User input cash amount of "100000"
    And User click charge button on checkout pop up
    Then User see receipt page
    And User click new sale button