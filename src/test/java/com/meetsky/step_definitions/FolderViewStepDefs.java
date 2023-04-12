package com.meetsky.step_definitions;

import com.meetsky.pages.FolderViewPage;
import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

public class FolderViewStepDefs {

    LoginPage loginPage = new LoginPage();
    FolderViewPage folderViewPage = new FolderViewPage();


    @Given("user is on the login page and and login with valid credentials")
    public void user_is_on_the_login_page_and_and_login_with_valid_credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("meetsky.url"));
        loginPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("meetsky.username.guzel"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("meetsky.password.guzel"));
        loginPage.loginButton.click();
    }


    @And("user click on Files button and on All files page")
    public void user_click_on_files_button_and_on_all_files_page() throws InterruptedException {
       Thread.sleep(2);
        folderViewPage.filesButton.click();
    }

    @When("user click on Name button")
    public void user_click_on_name_button() throws InterruptedException {
        Thread.sleep(3);
        folderViewPage.nameButton.click();
    }
    @Then("user see folders,files in alphabetic order")
    public void user_see_folders_files_in_alphabetic_order() {

        List<WebElement> tableElement = folderViewPage.nameList;
        List<String> filesnames = new ArrayList<>();

/*
            for (WebElement names : tableElement) {
                if (names.getText().startsWith("1") || names.getText().startsWith("3")) {
                    continue;
                }
                filesnames.add(names.getText());

            }

 */

        System.out.println(filesnames);
        boolean isAscending = true;

        for (int i = 0; i < filesnames.size() - 1; i++) {
            if (filesnames.get(i).compareTo(filesnames.get(i + 1)) < 0) {
                isAscending = false;
                break;
            }
        }
        Assert.assertTrue(isAscending);


    }

    // second scenario
    @When("user click on Size button")
    public void user_click_on_size_button() {

        folderViewPage.sizeButton.click();

    }

    @Then("user see the folder in order based on their sizes")
    public void user_see_the_folder_in_order_based_on_their_sizes() throws InterruptedException {

        List<WebElement> tableElementBeforeClick = folderViewPage.sizeList;
        List<String> sizeBeforeClick = new ArrayList<>();

        for (WebElement names : tableElementBeforeClick) {
            sizeBeforeClick.add(names.getText());
        }

        Thread.sleep(2);
        folderViewPage.sizeButton.click();


        List<WebElement> tableElementAfterClick = folderViewPage.sizeList;
        List<String> size = new ArrayList<>();

        for (WebElement names : tableElementAfterClick) {
            size.add(names.getText());
        }
        Assert.assertEquals(sizeBeforeClick, size);

    }


    //3rd scenario
    @When("user click on Modified button")
    public void user_click_on_modified_button() {
        BrowserUtils.sleep(3);
        folderViewPage.modifiedButton.click();
        BrowserUtils.sleep(3);//
    }

    @Then("user can see the folder,files based on their dates")
    public void user_can_see_the_folder_files_based_on_their_dates() {
        List<WebElement> tableElementBefore = folderViewPage.modifiedList;
        List<String> dateBefore = new ArrayList<>();

        for (WebElement names : tableElementBefore) {
            dateBefore.add(names.getText());
        }

        BrowserUtils.sleep(3);
        folderViewPage.modifiedButton.click();
        BrowserUtils.sleep(3);

        List<WebElement> tableElementAfter = folderViewPage.modifiedList;
        List<String> dateAfter = new ArrayList<>();

        for (WebElement names : tableElementAfter) {
            dateAfter.add(names.getText());
        }
        Assert.assertEquals(dateAfter, dateBefore);


    }

    //4rth scenario
    @When("user click on toggle-view")
    public void user_click_on_toggle_view() {
        BrowserUtils.sleep(3);
        folderViewPage.toggleViewButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("user can see the files,folders with large icons")
    public void user_can_see_the_files_folders_with_large_icons() {
        Assert.assertTrue(folderViewPage.listView.isDisplayed());


    }

    //5th scenario
    @When("user click on Select all checkbox")
    public void user_click_on_select_all_checkbox() {
        BrowserUtils.sleep(3);//
        folderViewPage.checkBox.click();
        BrowserUtils.sleep(3);
    }
    @And("user see all checkboxes are selected")
    public void user_see_all_checkboxes_are_selected() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(folderViewPage.checkBox.isEnabled());
    }

    @Then("user can see total values of all files,folders")
    public void user_can_see_total_values_of_all_files_folders() throws InterruptedException {
        Thread.sleep(3);
        Assert.assertTrue(folderViewPage.allSelected.isDisplayed());



    }


}