Feature: Check login functionality

  Scenario: 
    Given user is on login page
    When user enters valid user name and password
    And clicks on login button
    Then user is navigating to the home page
