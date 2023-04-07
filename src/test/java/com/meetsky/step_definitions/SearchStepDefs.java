package com.meetsky.step_definitions;

import com.meetsky.pages.DashboardPage;
import com.meetsky.pages.LoginPage;
import com.meetsky.pages.PhotosPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchStepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    PhotosPage photosPage = new PhotosPage();
    @Given("User is on the logs in and in the dashboard page")
    public void user_is_on_the_logs_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("meetsky.url"));
        loginPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("meetsky.username.kemal"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("meetsky.password.kemal"));
        loginPage.loginButton.click();

    }
    @And("user clicks search button and types DoNotDelete")
    public void user_clicks_search_button_and_types_do_not_delete() {
        dashboardPage.magglass.click();
        dashboardPage.searchbutton.sendKeys("DoNotDeleteFolder");
    }
    @Then("user sees DoNotDelete folder")
    public void user_sees_do_not_delete_folder() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(dashboardPage.DoNotDeleteFolder.isDisplayed());
    }

    @And("user clicks search button and types DoNotDeleteContact")
    public void userClicksSearchButtonAndTypesDoNotDeleteContact() {
        BrowserUtils.waitFor(3);
        dashboardPage.magglass.click();
        dashboardPage.searchbutton.sendKeys("DoNotDeleteContact");
    }

    @Then("user sees DoNotDeleteContact contact")
    public void userSeesDoNotDeleteContactContact() {
        Assert.assertTrue(dashboardPage.DoNotDeleteContact.isDisplayed());
    }

    @And("user clicks photos page")
    public void userClicksPhotosPage() {
        photosPage.photospage.click();
    }

    @Then("user should be able to see jpeg files")
    public void userShouldBeAbleToSeeJpegFiles() {
        Assert.assertTrue(photosPage.manondesertphoto.isDisplayed());
    }

    @Then("user clicks to logo and should be on the dashboardpage")
    public void userClicksToLogoAndShouldBeOnTheDashboardpage() {
        photosPage.mainpagefromlogo.click();
        Assert.assertTrue(dashboardPage.dashboardpagemaincontent.isDisplayed());
    }
}
