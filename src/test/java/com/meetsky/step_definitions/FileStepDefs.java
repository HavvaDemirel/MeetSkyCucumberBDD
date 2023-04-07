package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.github.javafaker.File;
import com.meetsky.pages.DashboardPage;
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

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.dnd.DragGestureEvent;
import java.awt.event.KeyEvent;

//import static org.testng.Assert.assertTrue;

public class FileStepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();

    //**************************************************************************

    @Given("the user is on the Files page")
    public void theUserIsOnTheFilesPage() {

        dashboardPage.fileButton.click();
    }

    //*********************FIRST SCENARIO STEP DEFINITIONS*************************

    @When("the user clicks on the plus icon button")
    public void theUserClicksOnThePlusIconButton() {
        filesPage.plusIcon.click();
    }

    @And("clicks on upload file button")
    public void clicksOnUploadFileButton() throws AWTException {

        String pathOfFile = "C:\\Users\\sel20\\OneDrive\\Desktop\\Selcuk.SShot.png";
        filesPage.uploadFileButton.click();
        BrowserUtils.waitFor(2);

        // simulate the keyboard shortcut to paste the file path into the input field
        Robot robot = new Robot();
        StringSelection stringSelection = new StringSelection(pathOfFile);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // press Enter to submit the file
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    @Then("the file should appear in the Files list")
    public void theFileShouldAppearInTheFilesList() {

        BrowserUtils.waitFor(3);

        filesPage.newUploadedFile.isDisplayed();
        BrowserUtils.waitFor(2);

        filesPage.threeDots.click();
        BrowserUtils.waitFor(2);
        filesPage.deleteFileButton.click();
    }

    //***********************SECOND SCENARIO STEP DEFINITIONS**************************

    @And("clicks on New Folder file button")
    public void clicksOnNewFolderFileButton() {

        filesPage.newFolderButton.click();
        BrowserUtils.waitFor(2);
    }


    @And("names the folder and clicks the arrow button to save it")
    public void namesTheFolderAndClicksTheArrowButtonToSaveIt() {

        Faker faker = new Faker();

        String fileName = faker.name().lastName();
        filesPage.newFolderNameBox.sendKeys(fileName);
        BrowserUtils.waitFor(2);
        filesPage.submitArrowButton.click();
    }

    @Then("the new folder should appear in the Files list")
    public void theNewFolderShouldAppearInTheFilesList() {

        filesPage.newAddedFolder.isDisplayed();
        BrowserUtils.waitFor(2);
    }


    //***********************THIRD SCENARIO STEP DEFINITIONS**************************


}
