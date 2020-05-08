@Web @Modifiers
Feature: Modifiers

  Scenario: Create modifier
    Given User open moka backoffice login page
    And User input email "082189814330" on backoffice login page
    And User input password "Natalia24" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu modifiers on backoffice
    And User click create modifier button
    And User input random modifier name
    And User click add or manage option
    And User click add options button
    And User input "Chocolate" as option name
    And User input "5000" as option price
    And User click save options
    Then User click save modifier button on modifier page
    And User go to menu modifiers on backoffice
    And User check modifier name