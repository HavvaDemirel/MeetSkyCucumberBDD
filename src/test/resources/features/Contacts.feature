
Feature: Contacts Module Functionality

  User story: As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user logged in successfully
    And user clicks contacts icon

    @wip
    Scenario: User creates new contact
      And user clicks New contact
      And user put name and last name of new contact
      Then user sees new contact name on the page


    Scenario:  User can see all the contacts as a list inside the middle column and
    total number of the contacts near the “All Contacts” tab
      When user clicks All contacts
      And user verifies total number next to All contacts
      Then user verifies all contacts in middle part


    Scenario:  User can change the profile picture of any contact with a previously uploaded
    picture by using “Choose from files” option
      When user clicks any user
      And user clicks contact's profile picture
      And user is able to click choose from files


    Scenario:  User can delete any selected contact
      When user clicks any contact
      And user click ... next to contact's name
      And user deletes contact




