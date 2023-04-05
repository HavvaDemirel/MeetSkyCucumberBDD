@smoke
@Wip
Feature: Files Functionality
  US: As a user, I should be able to add a file to favorites, rename any file and give some comments on any file.

  Background:
    Given user logged in successfully

  @MEETS10-399
  Scenario: User can add a comment to any file

    Given the user click on the files button
    When the user selects an item by clicking on the three dots menu
    And the user clicks details button
    Then the file details menu opened right side
    When the user clicks commend button
    And user adds any commend
    And  the user clicks on the post comment button
    Then the comment should be added to the file

@MEETS10-400
  Scenario: Delete a comment on a file

    Given the user click on the files button
    When the user selects an item by clicking on the three dots menu
    And the user clicks details button
    Then the file details menu opened right side
    When the user clicks commend button
    And user adds any commend
    And  the user clicks on the post comment button
    Then the comment should be added to the file
    And the user clicks three dots menu on the commend
    And the user clicks delete commend button
    Then user see comment deleted message

  @MEETS10-401
  Scenario: user can rename a file

    Given  the user click on the files button
    When the user selects an item by clicking on the three dots menu
    And the user clicks rename button
    Then the selected item name should be changed

  @MEETS10-402
  Scenario: User can add any file to favorite

    Given the user click on the files button
    When the user selects an item by clicking on the three dots menu
    And the user clicks add favorite button
    And the user select favorites file
    Then the selected item should be appears in the favorites file

