Feature: feature to test funtionality

  Scenario: Check login is successful with valid credentials
    Given browser is open
    When user is on login page
    And user enters email and password
    Then user is navigated to the home page
