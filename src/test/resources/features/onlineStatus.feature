@wip
  Feature: Online Status Functionality
    User Story:
    As a user, I should be able to change my online status and set a status message.

    Background:
      Given user logged in successfully
      When user clicks on the profile icon
      And user should be able to see Set Status button
      And user clicks on the Set Status button

      Scenario: View online status

        And user should be able to see Online button
        Then user clicks on the Close button

        Scenario: Change online status

          When user clicks on the Away button
          And user clicks on the Close button
          When user clicks on the profile icon
          Then user should able to see change online status


         Scenario: Set a status message from options

            And user clicks on the In a meeting button
            And user clicks on Set Status Message button
            When user clicks on the profile icon
            Then user should able to see change online status


            Scenario: Set a custom status message with emoji option

              And user clicks Status message placeholder
              And user writes new message on placeholder
              And user clicks emoji icon
              And user clicks and choose emoji with sunglass
              Then user clicks on Set Status Message button
              When user clicks on the profile icon
              Then user should be able to see change online status


               Scenario: Clear status message

                Then user clicks on the Clear status button






