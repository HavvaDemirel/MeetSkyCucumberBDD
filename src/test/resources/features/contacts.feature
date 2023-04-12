Feature: Contact group functionality

Background: User is on contact module
  Given Given user is logged in
  And User clicks contact module

@smoke
Scenario: User creates a new group under Contacts Module
When the user clicks on Create New Group
And enters the name of the group
Then the user should see the new group listed in the Contacts Module with no contacts added yet


Scenario: User adds an existing contact to a group from the contact's own info menu
When the user clicks on Create New Group
And enters the name of the group
And selects an existing group from the list
And user can add new contact to the selected group
Then the user should see the contact added to the selected group

Scenario: User views all available groups from a contact's own info menu
When the user clicks on Create New Group
And enters the name of the group
And selects an existing group from the list
And user can add new contact to the selected group
Then the user should see the groups  and selected group in contacts are matching


Scenario: User adds a new property to a contact's info page
When the user clicks on Create New Group
And enters the name of the group
When the user clicks on the Add new property
And selects Birthday from the list
