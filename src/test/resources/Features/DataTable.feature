Feature: databtable concept


  Scenario: datatable implementation
    Given user should be on log in page
    When user enters valid credentials and click on log in button
    When user need to create multiple leads and validate based on dataset
    |Tata   | TCS       | CEO     |
    |Nadela | Microsoft | CEO     |
    |Pichai | Google    | CEO     |
    |Musk   | Tesla     | CEO     |
    |Musk   | SpaceX    | Founder |
    Then user will open leads page
    Then user will delete the entered data
    And close browser
