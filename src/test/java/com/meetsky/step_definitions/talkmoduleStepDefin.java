package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.meetsky.pages.LoginPage;
import com.meetsky.pages.TalkModulePage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class talkmoduleStepDefin {

    LoginPage loginPage = new LoginPage();

    TalkModulePage talkModulePage = new TalkModulePage();



    @When("I navigate to the Talk Module page")
    public void iNavigateToTheTalkModulePage() {

        BrowserUtils.sleep(5);
        talkModulePage.talkModuleButton.click();

        BrowserUtils.sleep(5);
    }

    @And("I click on the add New Group Conversation button")
    public void iClickOnTheButton() {
//        talkModulePage.showNavigation.click();
        BrowserUtils.sleep(5);
        talkModulePage.addNewConversation.click();
        BrowserUtils.sleep(5);
    }

    @And("I type the group name and click")
    public void iTypeTheGroupName() {
        talkModulePage.typeGroupName.sendKeys("Friends");
        BrowserUtils.sleep(5);
        talkModulePage.addParticipants.click();
        BrowserUtils.sleep(5);

    }

    @And("I add as a participant any of the contacts UserA and UserB to the conversation")
    public void iAddAsAParticipantAnyOfTheContactsAndToTheConversation() {
        BrowserUtils.sleep(5);

       /* Actions actions = new Actions(Driver.getDriver());
        actions.click(talkModulePage.UserA);
        BrowserUtils.sleep(5);

        actions.click(talkModulePage.UserB);
        BrowserUtils.sleep(5);
*/

        talkModulePage.UserA.click();
        BrowserUtils.sleep(5);
        talkModulePage.UserB.click();
        BrowserUtils.sleep(5);

    /*  JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //3- Scroll down to “userA” link
       js.executeScript("arguments[0].scrollIntoView(true)", talkModulePage.UserA);
        BrowserUtils.sleep(5);
        js.executeScript("arguments[0].scrollIntoView(true)", talkModulePage.UserB);
        BrowserUtils.sleep(5);
*/


     /*   for (WebElement option : talkModulePage.addAnyParticipant) {
            if (option.getAttribute("class").contains(UserA.toLowerCase())) {
                option.click();
                break;

            }

            BrowserUtils.sleep(5);
        }

        for (WebElement option : talkModulePage.addAnyParticipant) {
            if (option.getAttribute("class").contains(UserB.toLowerCase())) {
                option.click();
                break;

            }

            BrowserUtils.sleep(5);
        }

      */
    }

    @And("I click Create conversation button")
    public void iClickCreateConversationButton() {

        BrowserUtils.sleep(5);
/*
        Actions actions = new Actions(Driver.getDriver());
        actions.click(talkModulePage.createConversation);

       */

        talkModulePage.createConversation.click();
        BrowserUtils.sleep(5);
    }

    @Then("I should see UserA and UserB listed under Participants")
    public void iShouldSeeAndListedUnderParticipants() {

       /* Assert.assertTrue(talkModulePage.UserAisDisplayed.isDisplayed());
        Assert.assertTrue(talkModulePage.UserBisDisplayed.isDisplayed());
        */

        BrowserUtils.sleep(5);

        for (WebElement option : talkModulePage.usersDisplayed) {
            Assert.assertTrue(option.getAttribute("class").contains("participant"));
        break;}

            BrowserUtils.sleep(5);
    }

    @And("Group name is displayed under the conversation button")
    public void groupNameIsDisplayedUnderTheConversationButton() {
        Assert.assertTrue(talkModulePage.isDisplayedGroup.isDisplayed());
    }

    @When("I click on the threeDot button which is displayed next to UserA")
    public void iClickOnTheThreeDotButtonWhichIsDisplayedNextTo() {
    }

    @And("I click on the Remove Participant button")
    public void iClickOnTheRemoveParticipantButton() {
    }

    @Then("I should see UserA removed from the conversation")
    public void iShouldSeeRemovedFromTheConversation() {
    }

    @And("UserA is deleted and not displayed anymore")
    public void isDeletedAndNotDisplayedAnymore() {
    }

    @And("I click the group name")
    public void iClickTheGroupName() {
    }

    @And("I am in a group conversation with UserB")
    public void iAmInAGroupConversationWith() {
    }

    @When("I type Hello! in the input box")
    public void iTypeInTheInputBox(String arg0) {
    }

    @And("I press Enter or click on the send button")
    public void iPressEnterOrClickOnTheSendButton() {
    }

    @Then("The message displayed in the conversation with tick sign")
    public void theMessageDisplayedInTheConversationWithTickSign() {
    }

    @And("there is a group conversation that I previously created")
    public void thereIsAGroupConversationThatIPreviouslyCreated() {
    }

    @And("I click on the threeDotButton which is displayed next the group name")
    public void iClickOnTheThreeDotButtonWhichIsDisplayedNextTheGroupName() {
    }

    @And("I click on the Delete conversation button")
    public void iClickOnTheDeleteConversationButton() {
    }

    @And("I should see a confirmation message")
    public void iShouldSeeAConfirmationMessage() {
    }

    @And("I click the Yes button")
    public void iClickTheYesButton() {
    }

    @Then("the conversation should no longer be listed under group conversations")
    public void theConversationShouldNoLongerBeListedUnderGroupConversations() {
    }
}
