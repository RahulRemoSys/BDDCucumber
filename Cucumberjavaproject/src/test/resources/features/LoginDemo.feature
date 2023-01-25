Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user click on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Rahul    |    12345 |
      | Sniper   |    12345 |
      | Aniket   |    12345 |
      