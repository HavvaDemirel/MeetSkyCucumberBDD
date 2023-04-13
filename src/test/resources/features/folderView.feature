
Feature: Folder View Functionality
  Agile story: As a user, I should be able to change folder view order
  by using Name/Size/Modified buttons.

  Background: For the scenarios in the feature file, user is expected to be on dashboard
    Given user is on the login page and and login with valid credentials
    And user click on Files button and on All files page

  @MEETS10-404
  Scenario: User can change folder view order by Name
    When user click on Name button
    Then user see folders,files in alphabetic order

  @MEETS10-405 @wip
  Scenario: User can change folder view order by Size
    When user click on Size button
    Then user see the folder in order based on their sizes

  @MEETS10-406
  Scenario: User can change folder view order by Modified
    When user click on Modified button
    Then user can see the folder,files based on their dates

  @MEETS10-407
  Scenario: User can change the folder view by clicking the toggle-view button
    When user click on toggle-view
    Then user can see the files,folders with large icons

  @MEETS10-408
  Scenario: Selecting all files and viewing total values
    When user click on Select all checkbox
    And user see all checkboxes are selected
    Then user can see total values of all files,folders
