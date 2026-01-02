Feature: Testing Contact List

  Scenario: Testing Login Functionality By using Datatable
    Given User is on login page
    When User enters username & password
      | rutu1@gmail.com | rutu123 |
    Then User clicks on submit button
    And User verify title
    And users clicks on add new contact button
    Then users enters personal info
      | first name | rutu       |
      | last name  | thombre    |
      | DOB        | 04/05/01   |
      | mob no     | 9876543456 |
