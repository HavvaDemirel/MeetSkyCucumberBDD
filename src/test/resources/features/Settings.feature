Feature: Settings Function
  As a user, I should be able to change profile info settings under the Profile module

  Background:
    Given user logged in successfully


  Scenario:User can see at least following titles inside personal info under Profile Settings page;
  =>Full name/Email/Phone Number
    When user is on the dashboard page and click on settings section
    Then user can see name title inside profile setting page
    And user can see email address inside profile setting page
    And user can see phone number inside profile setting page


  Scenario: User can change "Full name" info under Profile Settings page
    When user is on the dashboard page and click on settings section
    Then user change Full name on the name button
    And user see new name on the page successfully

  Scenario: User can make "Phone number" info as private under Profile Settings page
    When user is on the dashboard page and click on settings section
    Then user click on the federation button and see option on the dropdown
    And user select private section
    And user should display phone number as private successfully

  @wip
  Scenario: User can see the current local time under the Local dropdown
    When user is on the dashboard page and click on settings section
     #Then user click on the Locale section
    #And user select current localation
    And user see the current local time on the page