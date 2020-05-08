@Web @Categories
Feature: Categories

  Background: User Login
    Given User open moka backoffice login page
    And User input email "082189814330" on backoffice login page
    And User input password "Natalia24" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice

  Scenario: Create Categories
    When User go to menu categories on backoffice
    And User click create category
    And User input category name
    Then User click save category button on categories page
    And User go to menu categories on backoffice

