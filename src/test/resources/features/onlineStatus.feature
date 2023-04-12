
  Feature: Online Status Functionality
    User Story:
    As a user, I should be able to change my online status and set a status message.

    Background:
      Given user logged in successfully

  @MEETS10-428  @wip
      Scenario: View online status
        When user clicks on the profile icon
        And user should be able to see Set Status button
        And user clicks on the Set Status button
        And user should be able to see Online button
        Then user clicks on the Close button
    @MEETS10-429 @wip
        Scenario: Change online status
          When user clicks on the profile icon
          And user clicks on the Set Status button
          When user clicks on the Away button
          Then user clicks on the Close button

    @MEETS10-430 @wip
         Scenario: Set a status message from options
           When user clicks on the profile icon
           And user clicks on the Set Status button
            And user clicks on the In a meeting button
            And user clicks on Set Status Message button

@MEETS10-431 @wip
            Scenario: Set a custom status message with emoji option
              When user clicks on the profile icon
              And user clicks on the Set Status button
              And user clicks Status message placeholder
              And user writes new message on placeholder
              And user clicks emoji icon
              And user clicks and choose emoji with sunglass
              And user clicks on Set Status Message button

@MEETS10-432 @wip
               Scenario: Clear status message
                 When user clicks on the profile icon
                 And user clicks on the Set Status button
                Then user clicks on the Clear status button






