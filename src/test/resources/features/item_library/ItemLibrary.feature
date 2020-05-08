@Web @ItemLibrary
Feature: Item Library

  Background: User Login
    Given User open moka backoffice login page
    And User input email "082189814330" on backoffice login page
    And User input password "Natalia24" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice

  Scenario: Create Item
    When User go to menu item library on backoffice
    And User click create item button
    And User input item name
    And User input random item price
    And User input random sku
    And User select "Topping" as modifier
    And User input "First Testing" as description
    Then User click save item button on library page
    And User check item created
    And User go to menu item library on backoffice

  Scenario: Check for error message when save with empty item name
    When User go to menu item library on backoffice
    And User click create item button
    And User input random item price
    And User input random sku
    And User select "Topping" as modifier
    And User input "First Testing" as description
    Then User click save item button on library page
    And User see error message for empty field