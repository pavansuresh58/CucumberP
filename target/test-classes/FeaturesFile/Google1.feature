Feature: Test for Google Application

  Scenario: Test Google page title
    Given open google application
    When i capture the current page title
    Then title should match to google
