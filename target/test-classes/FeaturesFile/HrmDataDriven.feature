Feature: Test Orangehrm application

  Scenario Outline: Test Login functionality for data driven test
    Given Open Orangehrm applicaiton
    When User enters username  "<Un>" and enters password "<Psw>"
    When User clicks on Login button from login panel
    Then User should able to login and navigate dashboard page

    Examples: 
      | Un      | Psw      |
      | Admin   | admin123 |
      | Abhinav | test123  |
      | Admin   | admin123 |
      | Kumar   | test123  |
