package com.meetsky.step_definitions;

import com.meetsky.pages.StatusPage;
import com.meetsky.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class onlineStatus_StepsDefs {

    StatusPage statusPage = new StatusPage();


    @When("user clicks on the profile icon")
    public void user_clicks_on_the_profile_icon() {

        BrowserUtils.sleep(5);
        statusPage.profileIcon.click();


    }

    @When("user should be able to see Set Status button")
    public void user_should_be_able_to_see_set_status_button() {


        Assert.assertTrue(statusPage.setStatus.isDisplayed());
      //  BrowserUtils.sleep(3);
    }

    @And("user clicks on the Set Status button")
    public void userClicksOnTheSetStatusButton() {

        BrowserUtils.sleep(5);
        statusPage.setStatus.click();
    }

    @And("user should be able to see Online button")
    public void user_should_be_able_to_see_online_button() {
        BrowserUtils.sleep(5);
        Assert.assertTrue(statusPage.onlineStatus.isDisplayed());

    }

    @Then("user clicks on the Close button")
    public void user_clicks_on_the_close_button() {

        BrowserUtils.sleep(5);
        statusPage.closeIcon.click();

    }

    @When("user clicks on the Away button")
    public void user_clicks_on_the_away_button() {

        BrowserUtils.sleep(15);
        statusPage.awayButton.click();

    }

  //  @When("user clicks on the Close button")
  //  public void user_clicks_on_the_close_button() {

  //      BrowserUtils.sleep(2);
  //      statusPage.closeIcon.click();

 //   }

   // @When("user clicks on the profile button")
  //  public void user_clicks_on_the_profile_button() {

    //    statusPage.profileIcon.click();
   //     BrowserUtils.sleep(3);

  //  }

   @Then("user should able to see change online status")
    public void user_should_able_to_see_change_online_status() {

       Assert.assertTrue(statusPage.setStatus.isDisplayed());
    }

    @And("user clicks on the In a meeting button")
    public void userClicksOnTheInAMeetingButton() {

        BrowserUtils.sleep(5);
        statusPage.inMeetingOpt.click();
    }

    @And("user clicks on Set Status Message button")
    public void userClicksOnSetStatusMessageButton() {

        BrowserUtils.sleep(3);
        statusPage.setStMessageBtn.click();
    }


    @And("user clicks Status message placeholder")
    public void userClicksStatusMessagePlaceholder() {

        BrowserUtils.sleep(5);
        statusPage.messagePHolder.click();
    }

    @And("user writes new message on placeholder")
    public void userWritesNewMessageOnPlaceholder() {

        BrowserUtils.sleep(7);
        statusPage.messagePHolder.sendKeys("Hello World!");
    }

    @And("user clicks emoji icon")
    public void userClicksEmojiIcon() {

        BrowserUtils.sleep(5);
        statusPage.emojiHolder.click();
    }

    @And("user clicks and choose emoji with sunglass")
    public void userClicksAndChooseEmojiWithSunglass() {

        BrowserUtils.sleep(5);
        statusPage.emojiSunglasses.click();
    }

    @Then("user should be able to see change online status")
    public void userShouldBeAbleToSeeChangeOnlineStatus() {

        BrowserUtils.sleep(5);
        Assert.assertTrue(statusPage.setStatus.isDisplayed());
    }

    @Then("user clicks on the Clear status button")
    public void userClicksOnTheClearStatusButton() {

        BrowserUtils.sleep(5);
        statusPage.clearStatusMessage.click();
    }
}
