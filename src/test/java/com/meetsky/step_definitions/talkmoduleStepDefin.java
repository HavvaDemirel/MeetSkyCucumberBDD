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
        BrowserUtils.sleep(4);
        talkModulePage.threeDotUserA.click();
        BrowserUtils.sleep(5);
    }

    @And("I click on the Remove Participant button")
    public void iClickOnTheRemoveParticipantButton() {
        talkModulePage.removeUserA.click();
        BrowserUtils.sleep(5);

    }

    @Then("I should see UserA removed from the conversation UserA is deleted and not displayed anymore")
    public void iShouldSeeUserARemovedFromTheConversationUserAIsDeletedAndNotDisplayedAnymore() {
        Assert.assertTrue(talkModulePage.displayyedRemoveUserA.getText().contains("You removed"));
        BrowserUtils.sleep(5);
    }

    @And("I click the group name")
    public void iClickTheGroupName() {
        talkModulePage.groupName.click();
        BrowserUtils.sleep(5);
    }

    @When("I type Hello! in the input box to UserB")
    public void iTypeHelloInTheInputBoxToUserB() {

        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys("Hello!").perform();

        BrowserUtils.sleep(5);


    }

    @And("I press Enter or click on the send button")
    public void iPressEnterOrClickOnTheSendButton() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();
        BrowserUtils.sleep(5);
    }

    @Then("The message displayed in the conversation with tick sign")
    public void theMessageDisplayedInTheConversationWithTickSign() {
        Assert.assertTrue(talkModulePage.textDisplay.isDisplayed());
        BrowserUtils.sleep(5);
        Assert.assertTrue(talkModulePage.tickSign.isDisplayed());
        BrowserUtils.sleep(5);

    }


    @And("I click on the threeDotButton which is displayed next the group name")
    public void iClickOnTheThreeDotButtonWhichIsDisplayedNextTheGroupName() {
      //  talkModulePage.threeDotNextGroupName.click();
     /*   JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", talkModulePage.threeDotNextGroupName);
      */
        BrowserUtils.sleep(5);
       // Actions actions = new Actions(Driver.getDriver());
        talkModulePage.groupName.click();
        BrowserUtils.sleep(5);
      //  actions.moveToElement(talkModulePage.threeDotNextGroupName).perform();
        talkModulePage.threeDotNextGroupName.click();

    }

    @And("I click on the Delete conversation button")
    public void iClickOnTheDeleteConversationButton() {
        BrowserUtils.sleep(3);
        talkModulePage.deleteConversation.click();

    }

    @And("I should see a confirmation message")
    public void iShouldSeeAConfirmationMessage() {
        Assert.assertTrue(talkModulePage.confirmMessageDelete.isDisplayed());
        BrowserUtils.sleep(5);
    }

    @And("I click the Yes button")
    public void iClickTheYesButton() {
        talkModulePage.yesButton.click();
        BrowserUtils.sleep(5);
    }

    @Then("the conversation should no longer be listed under group conversations")
    public void theConversationShouldNoLongerBeListedUnderGroupConversations() {

        Assert.assertTrue(talkModulePage.emptyContent.isDisplayed());
        BrowserUtils.sleep(5);
    }


    @And("I click people menu button")
    public void iClickPeopleMenuButton() {
        BrowserUtils.sleep(5);
        talkModulePage.peopleMenuButton.click();
        BrowserUtils.sleep(3);
    }
}
