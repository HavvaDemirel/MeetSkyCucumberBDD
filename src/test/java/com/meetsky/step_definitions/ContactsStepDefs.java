package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.meetsky.pages.ContactsPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactsStepDefs {

ContactsPage contactsPage;
Faker faker = new Faker();

String fakeName= faker.name().firstName();


    @Given("user clicks contacts icon")
    public void user_clicks_contacts_icon() {
      BrowserUtils.sleep(10);
       contactsPage= new ContactsPage();
       contactsPage.contactsIcon.click();


    }
    @Given("user clicks New contact")
    public void user_clicks_new_contact() {
        contactsPage.createNewContact.click();

    }
    @Given("user put name and last name of new contact")
    public void user_put_name_and_last_name_of_new_contact() {
       contactsPage.fullNameInput.sendKeys(fakeName);
       BrowserUtils.sleep(5);
    }
    @Then("user sees new contact name on the page")
    public void user_sees_new_contact_name_on_the_page() {
        BrowserUtils.sleep(4);

        List<WebElement> list= new ArrayList<>();
        list.add(contactsPage.middleArea);
        
    }

    @When("user clicks All contacts")
    public void user_clicks_all_contacts() {
      contactsPage.allContactButton.click();
    }
    @And("user verifies total number next to All contacts")
    public void user_verifies_total_number_next_to_all_contacts() {

    }
    @Then("user verifies all contacts in middle part")
    public void user_verifies_all_contacts_in_middle_part() {
        //contactsPage.allListIcon.click();
        List<WebElement> allContacts= new ArrayList<>();
        allContacts.add(contactsPage.middleArea);

        for (WebElement each : allContacts) {
            System.out.println(each.getText());
           Assert.assertEquals(each.getText(), "DoNotDeleteContact");
        }


    }




}
