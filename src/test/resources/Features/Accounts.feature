@india
Feature: Accounts Page

  Background: Valid log in required
    Given user should be on log in page
    When user enters valid credentials and click on log in button

    Scenario: Accounts deletion
      When user click on accounts link
      And user can view existing entries
      Then user can delete existing entries
