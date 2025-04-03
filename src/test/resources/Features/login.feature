Feature: Log in functionality

  Background:
    Given user should be on log in page


  Scenario: valid log in

    When user enters valid credentials and click on log in button
    Then user navigated to home page
    And user can see log out link
    And close browser

  Scenario: invalid log in

    When user enters invalid credentials and click on log in button
    Then user can see error message
    And close browser


  Scenario Outline: invalid log in with different data

    When user enters invalid credentials user name as "<userid>" and password as "<password>" and click on log in button
    Then user can see error message
    And close browser
    Examples:
    | userid | password |
    | ad1    | pwd1     |
    | ad2    | pwd2     |
    | ad3    | pwd3     |