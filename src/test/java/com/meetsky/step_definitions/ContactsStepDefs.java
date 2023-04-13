package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.meetsky.pages.ContactPage;
import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.concurrent.Callable;

public class ContactsStepDefs {

    ContactPage contactPage = new ContactPage();
    LoginPage loginPage = new LoginPage();


    @Given("User clicks contact module")
    public void user_clicks_contact_module() {
        BrowserUtils.waitFor(3);
        contactPage.contactsButton.click();

    }
    @When("the user clicks on Create New Group")
    public void the_user_clicks_on_create_new_group() {

     contactPage.groupsAddButton.click();

    }
    @When("enters the name of the group")
    public void enters_the_name_of_the_group() {

        contactPage.createGroupInput.sendKeys("Coworkers");
        contactPage.createGroupInput.sendKeys(Keys.chord(Keys.ENTER));

        contactPage.createGroupInput.sendKeys("Friends");
        contactPage.createGroupInput.sendKeys(Keys.chord(Keys.ENTER));
    }
    @Then("the user should see the new group listed in the Contacts Module with no contacts added yet")
    public void the_user_should_see_the_new_group_listed_in_the_contacts_module_with_no_contacts_added_yet() {
        Assert.assertTrue(contactPage.coworkersisdisplayed.isDisplayed());


    }


//--------------------------------------------------------





    @When("selects an existing group from the list")
    public void selects_an_existing_group_from_the_list() {
        contactPage.groupsCoworker.click();

    }

    @And("user can add new contact to the selected group")
    public void userCanAddNewContactToTheSelectedGroup() {

        contactPage.newContact.click();
    }
    @Then("the user should see the contact added to the selected group")
    public void the_user_should_see_the_contact_added_to_the_selected_group() {


        Assert.assertEquals(contactPage.coworkerstext.getText(),contactPage.selectedGroup.getText());

    }

//----------------------------------------------------------------------
    @Then("the user should see the groups  and selected group in contacts are matching")
    public void theUserShouldSeeTheGroupsAndSelectedGroupInContactsAreMatching() {

        Assert.assertEquals(contactPage.coworkerstext.getText(),contactPage.selectedGroup.getText());
        Assert.assertEquals(contactPage.groupsFriendText.getText(),contactPage.groupsFriendText.getText());

    }


//---------------------------------------------------------------------------------



    @When("the user clicks on the Add new property")
    public void theUserClicksOnTheAddNewProperty() {

        contactPage.newcontactbutton.click();
        contactPage.propertytype.click();


    }

    @And("selects Birthday from the list")
    public void selectsBirthdayFromTheList() {
        contactPage.birthdaybutton.click();

    }














    @Given("Given user is logged in")
    public void givenUserIsLoggedIn() {
        Driver.getDriver().get(ConfigurationReader.getProperty("meetsky.url"));

        loginPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("meetsky.username.neva"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("meetsky.password.neva"));
        loginPage.loginButton.click();
    }



}
