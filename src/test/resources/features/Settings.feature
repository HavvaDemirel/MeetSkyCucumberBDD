@wip1
Feature: Profile Settings Functionality
  As a user, I should be able to change profile info settings under the Profile module

  Background:
    Given user logged in successfully

@MEETS10-445 @Smoke
  Scenario:User can see at least following titles inside personal info under Profile Settings page;
  =>Full name/Email/Phone Number
    When user is on the dashboard page and click on settings section
    Then user can see name title inside profile setting page
    And user can see email address inside profile setting page
    And user can see phone number inside profile setting page

@MEETS10-446
  Scenario: User can change "Full name" info under Profile Settings page
    When user is on the dashboard page and click on settings section
    Then user change Full name on the name button
    And user see new name on the page successfully

@MEETS10-447
  Scenario: User should not be change name with special characters and numbers
    When user is on the dashboard page and click on settings section
    And user enter special characters and numbers
    Then user should not change name with special characters and numbers

  @MEETS10-448
  Scenario: User can make "Phone number" info as private under Profile Settings page
    When user is on the dashboard page and click on settings section
    Then user click on the federation button and see option on the dropdown
    And user select private section
    And user should display phone number as private successfully

@MEETS10-449
  Scenario: User can see the current local time under the Local dropdown
    When user is on the dashboard page and click on settings section
    Then user click on the Locale section
    And user select current localation
    And user see the current local time on the page