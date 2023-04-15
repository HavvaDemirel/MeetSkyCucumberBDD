package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class
FilesFunctionsStepDefs {


    FilesPage filesPage = new FilesPage();
    Faker faker = new Faker();


    @Given("the user click on the files button")
    public void the_user_click_on_the_files_button() {

        filesPage.filesButton.click();
    }
    @When("the user selects an item by clicking on the three dots menu")
    public void the_user_selects_an_item_by_clicking_on_the_three_dots_menu() {

         BrowserUtils.sleep(3);
        filesPage.threeDots.click();

    }

    @And("the user clicks details button")
    public void theUserClicksDetailsButton() {

        filesPage.detailsButton.click();

    }

    @Then("the file details menu opened right side")
    public void theFileDetailsMenuOpenedRightSide() {

        Assert.assertTrue(filesPage.sideBarTitle.isDisplayed());

    }

    @When("the user clicks commend button")
    public void theUserClicksCommendButton() {

        filesPage.commendButton.click();

    }

    @And("user adds any commend")
    public void userAddsAnyCommend() {

        filesPage.commendInputBox.clear();

        filesPage.commendInputBox.sendKeys("Well Done");

    }

    @And("the user clicks on the post comment button")
    public void theUserClicksOnThePostCommentButton() {

        filesPage.submitButton.click();

    }

    @Then("the comment should be added to the file")
    public void theCommentShouldBeAddedToTheFile() {

        String commend = "Well Done";

        boolean commendMessageAdded = Driver.getDriver().findElement(By.xpath("//div[.='"+commend+"']")).isDisplayed();

        Assert.assertTrue(commendMessageAdded);

    }

    @And("the user clicks three dots menu on the commend")
    public void theUserClicksThreeDotsMenuOnTheCommend() {

        filesPage.sideBarThreeDotsIcon.click();

    }

    @And("the user clicks delete commend button")
    public void theUserClicksDeleteCommendButton() {

      filesPage.sideBarDeleteButton.click();

        BrowserUtils.sleep(3);

    }

    @Then("user see comment deleted message")
    public void userSeeCommentDeletedMessage() {

        Assert.assertTrue(filesPage.sideBarDeletedMessage.isDisplayed());

    }

    @And("the user clicks add favorite button")
    public void theUserClicksAddFavoriteButton() {

        filesPage.addToFavoritesButton.click();

    }

    @And("the user select favorites file")
    public void theUserSelectFavoritesFile() {

        filesPage.favoritesFile.click();

    }


    @Then("the selected item should be appears in the favorites file")
    public void theSelectedItemShouldBeAppearsInTheFavoritesFile() {

        Assert.assertTrue(filesPage.folderWithStar.isDisplayed());


    }

    @When("the user clicks rename button")
    public void the_user_clicks_rename_button() {

        filesPage.renameButton.click();



    }
    @Then("the selected item name should be changed")
    public void the_selected_item_name_should_be_changed() {

        String newName = faker.letterify("????????");

        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(newName).perform();

        actions.sendKeys(Keys.ENTER).perform();


        List<WebElement> files = filesPage.tableElements;

        List<String> filesNames = new ArrayList<>();

        for (WebElement file : files){
           filesNames.add(file.getText());
          }

        Assert.assertTrue(filesNames.contains(newName));

    }

}
