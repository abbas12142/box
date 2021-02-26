Feature: Create Folder
  Scenario: User Create a new folder
    When User Press New Button
    Then User Write Folder Name
    And Press Create button
    Then Verify that folder should be Created Successfully



