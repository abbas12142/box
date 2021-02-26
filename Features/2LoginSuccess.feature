Feature: Box User Login Success
  Scenario: Enter email address by user
    Given User entered correct email address
    When Press next button
    Then Verify tha system should show password screen


  Scenario: Enter password by user
    Given User entered correct password
    When Press login button
    Then Verify that user should be logged in Successfully