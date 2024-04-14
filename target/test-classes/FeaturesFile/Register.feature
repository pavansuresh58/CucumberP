Feature: Test OpenCart application

  Scenario: Test Register feature with valid data using DataTable
    Given Open Register page of OpenCart application
    When I enter required fields with valid data
      | fname | lname | email           | tel        | pass    | cpass   |
      | Pooja | Patil | pooja24@gmail.com | 9878665577 | test123 | test123 |
    When I click on Yes radio button
    When I check privacy policy
    When I click on Continue button
    Then I should able to register in opencart
