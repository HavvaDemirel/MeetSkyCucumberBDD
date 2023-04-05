@smoke
Feature: User can search file typing its name through the magnifying glass icon and see the details side page of the file when clicked on it.
  @MEETS10-396
  Scenario: User can search file typing its name through the magnifying glass icon and see the details side page of the file when clicked on it.
    Given User is on the logs in and in the dashboard page
    And user clicks search button and types DoNotDelete
    Then user sees DoNotDelete folder
  @MEETS10-395
  Scenario: User can search contacts by clicking on the contacts icon and typing its name
    Given User is on the logs in and in the dashboard page
    And user clicks search button and types DoNotDeleteContact
    Then user sees DoNotDeleteContact contact
    @MEETS10-394
  Scenario: User can also see the images files under the Photos module when uploaded them
    Given User is on the logs in and in the dashboard page
    And user clicks photos page
    Then user should be able to see jpeg files
      @MEETS10-393
  Scenario: User can navigate to the Dashboard page whenever clicking the Meetsky icon at the top left corner on the page
    Given User is on the logs in and in the dashboard page
    And user clicks photos page
    Then user clicks to logo and should be on the dashboardpage

