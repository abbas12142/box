Feature: Login to box.com
  Scenario: Login page should be loaded successfully
    Given User launch chrome browser
    When User open box.com login page.
    Then Verify that login page should be loaded successfully



  Scenario: Email address field on box.com login page
    Then Verify that the Email address field should be present on page



  Scenario: Next Button on box.com login page
    Then Verify that the Next button should be present on page

  Scenario: Reset Password on Box.com login page
    Then Verify that the Reset password page link should be present on page
