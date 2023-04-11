

Feature: Talk Module and Group Conversations

  As a user, I want to be able to create/delete conversation groups and chat with other co-workers under Talk Module.
  @wip
 Scenario: Create a new group conversation can can see the participants of the conversation on the right-hand menu under Participants
    Given user logged in successfully
    When I navigate to the Talk Module page
    And I click on the add New Group Conversation button
    And I type the group name and click
    And I add as a participant any of the contacts UserA and UserB to the conversation
    And I click Create conversation button
    Then I should see UserA and UserB listed under Participants
    And Group name is displayed under the conversation button

  Scenario: Remove a participant from a conversation
    Given user logged in successfully
    When I click on the threeDot button which is displayed next to UserA
    And I click on the Remove Participant button
    Then I should see UserA removed from the conversation
    And UserA is deleted and not displayed anymore

  Scenario: Send a message in a group conversation
    Given user logged in successfully
    And I click the group name
    And I am in a group conversation with UserB
    When I type Hello! in the input box
    And I press Enter or click on the send button
    Then The message displayed in the conversation with tick sign

  Scenario: Delete a group conversation
    Given user logged in successfully
    When I navigate to the Talk Module page
    And there is a group conversation that I previously created
    And I click on the threeDotButton which is displayed next the group name
    And I click on the Delete conversation button
    And I should see a confirmation message
    And I click the Yes button
    Then the conversation should no longer be listed under group conversations

    #User Story :
    #As a user, I should be able to create/delete conversation groups and chat with other co-workers under Talk Module
    #
    #Acceptance Criteria
    #1. User can create a new group conversation by adding other users
    #2. User can can see the participants of the conversation on the right-hand menu under Participants
    #3. User can remove any participant from the conversation as being moderator of the conversation
    #4. User can send messages by typing inside the inputbox at the bottom of the middle screen on Talk Module page
    #5. User can delete any group conversation previously created