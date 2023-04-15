package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import com.meetsky.pages.SettingsPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Settings_StepDefinitions extends SettingsPage {

    LoginPage loginPage = new LoginPage();
    SettingsPage settingsPage= new SettingsPage();


    @And("user is on the dashboard page and click on settings section")
    public void userIsOnTheDashboardPageAndClickOnSettingsSection() {

        settingsPage.openedMenuButton.click();
        BrowserUtils.sleep(2);
        settingsPage.settingsbutton.click();

    }

    @Then("user can see name title inside profile setting page")
    public void userCanSeeNameTitleInsideProfileSettingPage() {

        settingsPage.fullName.clear();
        settingsPage.fullName.sendKeys("Summer");
       BrowserUtils.sleep(2);
        //Assert.assertTrue(settingsPage.fullName.isDisplayed());

    }

    @And("user can see email address inside profile setting page")
    public void userCanSeeEmailAddressInsideProfileSettingPage() {


        settingsPage.email.sendKeys("employee81@gmail.com");
        BrowserUtils.sleep(3);
        //Assert.assertTrue(settingsPage.settingsemail.isDisplayed());
    }

    @And("user can see phone number inside profile setting page")
    public void userCanSeePhoneNumberInsideProfileSettingPage() {

        settingsPage.phoneNumber.sendKeys("7884565151");
        BrowserUtils.sleep(3);
        Assert.assertTrue(settingsPage.phoneNumber.isDisplayed());


    }

    @When("user change Full name on the name button")
    public void userChangeFullNameOnTheNameButton() {

        settingsPage.fullName.clear();
        BrowserUtils.sleep(3);
        settingsPage.fullName.sendKeys("Sunshine");

    }

    @And("user see new name on the page successfully")
    public void userSeeNewNameOnThePageSuccessfully() {

        BrowserUtils.sleep(3);
        Assert.assertTrue(settingsPage.fullName.isDisplayed());

    }

    @And("user enter special characters and numbers")
    public void userEnterSpecialCharactersAndNumbers()  {


        BrowserUtils.sleep(3);
        settingsPage.fullName.clear();
        BrowserUtils.sleep(2);
        settingsPage.fullName.sendKeys("#######@!&*3?/");
        BrowserUtils.sleep(3);

        Assert.assertFalse(userName.getText().contains("#######@!&*3?/"));

    }

    @Then("user should not change name with special characters and numbers")
    public void userShouldNotChangeNameWithSpecialCharactersAndNumbers() {
    }


    @When("user click on the federation button and see option on the dropdown")
    public void userClickOnTheFederationButtonAndSeeOptionOnTheDropdown() {

        settingsPage.phoneNumber.sendKeys("7884565151");
        BrowserUtils.sleep(3);
        Assert.assertTrue(settingsPage.phoneNumber.isDisplayed());

        settingsPage.phoneNumberKey.click();
        BrowserUtils.sleep(3);
    }

    @And("user select private section")
    public void userSelectPrivateSection() {

        settingsPage.privateOption.click();
        BrowserUtils.sleep(5);

    }

    @Then("user should display phone number as private successfully")
    public void userShouldDisplayPhoneNumberAsPrivateSuccessfully() {
    }

    @When("user is on the dashboard page and click on settings sectio")
    public void userIsOnTheDashboardPageAndClickOnSettingsSectio() {
    }

    @Then("user click on the Locale section")
    public void userClickOnTheLocaleSection() {

        settingsPage.localeDropdown.click();
        BrowserUtils.sleep(3);

    }

    @And("user select current localation")
    public void userSelectCurrentLocalation() {

        settingsPage.currentLocation.click();
        BrowserUtils.sleep(3);
    }

    @And("user see the current local time on the page")
    public void userSeeTheCurrentLocalTimeOnThePage() {

        BrowserUtils.sleep(3);
        //settingsPage.localtime.click();
        Assert.assertTrue(settingsPage.localtime.isDisplayed());
        BrowserUtils.sleep(5);
    }


}
