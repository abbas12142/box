Feature: User want to Logout from box.com
  Scenario: User want to logout
    Given User Click On profile avatar
    When User click logout option in menu
    Then Verify that user Should Logout Successfully