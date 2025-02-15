Feature: Test Registration page functionality

  Scenario Outline: Test the user input
    Given user is on registration page
    Then user register new user by reading test data from "<sheetName>" and <RowNumber>
    And click on submit button

    Examples: 
      | sheetName | RowNumber |
      | Guru99    |         1 |
      | Guru99    |         2 |
