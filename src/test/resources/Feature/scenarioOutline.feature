Feature: Testing Contact List App

  Scenario Outline: Tesing Validity Of Credentials
    Given user is on loginpage
    When user is providing "<Username>"& "<Password>"
    Then user is clicking on submit button
    And verifying title of the page

    Examples: 
      | Username        | Password |
      | rutu1@gmail.com | rutu123  |
      | rutu1@gmail.com | rutu1    |
      | rutu            | rutu123  |
