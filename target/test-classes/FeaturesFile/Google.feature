Feature: Test for Google application

  Background: 
    Given Open Google Application

  Scenario: Test Google page title
    #Given Open Google Application
    When I capture the current page title
    Then Title should match to Google

  Scenario: Test search feature with valid keyword of Google
    #Given Open Google Application
    When I search valid keyword in search box
    Then Google application should display valid result
    
