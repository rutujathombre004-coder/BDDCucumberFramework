Feature: Testing Contact List App

  Background: 
    Given User in on login page
    When User is clicking on the signup button

  Scenario: Scenario1
    Then User is entering Firstname & Lastname
    And Clicking on the submit button

  Scenario: Scenario2
    Then User is entering email & password
    And User is clicking on cancle button
