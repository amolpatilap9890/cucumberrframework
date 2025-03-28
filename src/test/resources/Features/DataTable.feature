Feature: databtable concept

  @india
  Scenario: datatable implementation
    Given user should be on log in page
    When user enters valid credentials and click on log in button
    When user need to create multiple leads and validate based on dataset
    |Tata   | TCS       |
    |Nadela | Microsoft |
    |Pichai | Google    |
    |Musk   | Tesla     |
    |Musk   | SpaceX    |
    And close browser