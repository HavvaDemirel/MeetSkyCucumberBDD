

Feature: Talk Module and Group Conversations

  As a user, I want to be able to create/delete conversation groups and chat with other co-workers under Talk Module.
  User Story :
  As a user, I should be able to create/delete conversation groups and chat with other co-workers under Talk Module

  Acceptance Criteria
  1. User can create a new group conversation by adding other users
  2. User can can see the participants of the conversation on the right-hand menu under Participants
  3. User can remove any participant from the conversation as being moderator of the conversation
  4. User can send messages by typing inside the inputbox at the bottom of the middle screen on Talk Module page
  5. User can delete any group conversation previously created
  Background: For the scenarios in the feature file, user is expected to be on dashboard
    Given user logged in successfully
    When I navigate to the Talk Module page

  @wip @MEETS10-437
 Scenario: Create a new group conversation can can see the participants of the conversation on the right-hand menu under Participants

    And I click on the add New Group Conversation button
    And I type the group name and click
    And I add as a participant any of the contacts UserA and UserB to the conversation
    And I click Create conversation button
    Then I should see UserA and UserB listed under Participants
    And Group name is displayed under the conversation button
   And user logged out

  @wip @MEETS10-438
  Scenario: Remove a participant from a conversation

    And I click on the add New Group Conversation button
    And I type the group name and click
    And I add as a participant any of the contacts UserA and UserB to the conversation
    And I click Create conversation button
    And I click the group name
    When I click on the threeDot button which is displayed next to UserA
    And I click on the Remove Participant button
    Then I should see UserA removed from the conversation UserA is deleted and not displayed anymore
    And user logged out

  @wip @MEETS10-439
  Scenario: Send a message in a group conversation
    And I click on the add New Group Conversation button
    And I type the group name and click
    And I add as a participant any of the contacts UserA and UserB to the conversation
    And I click Create conversation button
    And I click inbox
    When I type Hello! in the input box to UserB
    And I press Enter or click on the send button
    Then The message displayed in the conversation with tick sign
    And user logged out

  @wip @MEETS10-440
  Scenario: Delete a group conversation
    And I click on the add New Group Conversation button
    And I type the group name and click
    And I add as a participant any of the contacts UserA and UserB to the conversation
    And I click Create conversation button
    And I click on the threeDotButton which is displayed next the group name
    And I click on the Delete conversation button
    And I should see a confirmation message
    And I click the Yes button
    Then the conversation should no longer be listed under group conversations

