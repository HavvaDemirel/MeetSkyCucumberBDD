Feature: File feature

  User Story :
  As a user, I should be able to upload a file, move or delete any
  selected file under the Files module
#**************************************************************************

  Background:
    Given user logged in successfully
    And the user is on the Files page
#***************************************************************************

  #@MEETS10-411 @wip1
  Scenario: User uploads a file
    When the user clicks on the plus icon button
    And clicks on upload file button
    Then the file should appear in the Files list
    #***********************************************************************
  @smoke #@MEETS10-412 @wip1
  Scenario: User creates a new folder
    When the user clicks on the plus icon button
    And clicks on New Folder file button
    And names the folder and clicks the arrow button to save it
    Then the new folder should appear in the Files list

    #************************************************************************
 #@MEETS10-419 @wip1
  Scenario: User moves a selected item to a folder
    When the user right clicks on a file
    And selects move or copy
    And selects a Destination folder
    And clicks on the Move to Destination button again
    Then the selected item should appear in the destination folder
  #*************************************************************************
 # @MEETS10-424 @wip1
 Scenario: User copies a selected item to a folder
    When the user right clicks on a different file
    And selects move or copy
    And selects a different Destination folder
    And clicks on the Copy to Destination button again
    Then the selected item should appear in the destination folder
  #*************************************************************************
  #@MEETS10-425 @wip1
  Scenario: User deletes a selected item
    When the user clicks on three dots from Folder's menu
    And clicks on the Delete Folder button
    Then the selected item should disappear from the Files list
  #************************************************************************
  #@MEETS10-423 @wip1
  Scenario: User sees the total number of files and folders
    Then the Files list should display the total number of files and folders
  #************************************************************************



