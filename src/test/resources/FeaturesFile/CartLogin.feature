Feature: Test for Open Cart Application

  Scenario: Test Login for Cart with valid data
    Given Open Cart Login page
    When I enter valid credentials for login
      | email             | password |
      | pooja24@gmail.com | test123  |
    When I click Login button from cart page
    Then Is should able to login into openCart application
