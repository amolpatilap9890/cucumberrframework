Feature: lead functionality

  Background:
    Given user should be on log in page
    When user enters valid credentials and click on log in button


    Scenario: create lead
      When user click on new lead link
      And user fill the last name and company, designation and click on save button
      Then lead should be created and validated successfully
      And close browser