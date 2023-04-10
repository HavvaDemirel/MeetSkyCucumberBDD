package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.github.javafaker.File;
import com.meetsky.pages.DashboardPage;
import com.meetsky.pages.FilesPage;
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.dnd.DragGestureEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

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

        filesPage.keepNewFileButton.click();
        filesPage.continueButton.click();

        BrowserUtils.waitFor(3);

        filesPage.newUploadedFile.isDisplayed();
        BrowserUtils.waitFor(2);


    }

    //***********************SECOND SCENARIO STEP DEFINITIONS**************************

    @And("clicks on New Folder file button")
    public void clicksOnNewFolderFileButton() {

        filesPage.newFolderButton.click();
        BrowserUtils.waitFor(2);
    }


    Faker faker = new Faker();
    String fileName = faker.name().lastName();

    @And("names the folder and clicks the arrow button to save it")
    public void namesTheFolderAndClicksTheArrowButtonToSaveIt() {

        filesPage.newFolderNameBox.sendKeys(fileName);
        BrowserUtils.waitFor(2);
        filesPage.submitArrowButton.click();
    }

    @Then("the new folder should appear in the Files list")
    public void theNewFolderShouldAppearInTheFilesList() {

        BrowserUtils.waitFor(3);


        List<WebElement> secondColumnInTable = filesPage.namesInTheTable;

            List<String> filesList = new ArrayList<>();

            for (WebElement eachFolderName : secondColumnInTable) {

                filesList.add(eachFolderName.getText());
            }

            System.out.println(filesList);
            BrowserUtils.waitFor(2);

            Assert.assertTrue(filesList.contains(fileName));

    }



    //***********************THIRD SCENARIO STEP DEFINITIONS**************************


    @When("the user right clicks on a file")
    public void theUserRightClicksOnAFile() {

        BrowserUtils.waitFor(3);

        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(filesPage.movingFolder).build().perform();
        BrowserUtils.waitFor(3);
    }

    @And("selects move or copy")
    public void selectsMoveOrCopy() {

        filesPage.moveOrCopy.click();
        BrowserUtils.waitFor(2);
    }

    @And("selects a Destination folder")
    public void selectsADestinationFolder() {

        filesPage.destinationFolder2.click();
        BrowserUtils.waitFor(2);
    }

    @And("clicks on the Move to Destination button again")
    public void clicksOnTheMoveToDestinationButtonAgain() {

        filesPage.moveToDestinationButton.click();
        BrowserUtils.waitFor(2);

    }
    @Then("the selected item should appear in the destination folder")
    public void theSelectedItemShouldAppearInTheDestinationFolder() {

        List<WebElement> secondColumnInTable = filesPage.namesInTheTable;

        List<String> filesList = new ArrayList<>();

        for (WebElement eachFolderName : secondColumnInTable) {

            filesList.add(eachFolderName.getText());
        }

        System.out.println(filesList);
        BrowserUtils.waitFor(2);

        Assert.assertTrue(filesList.contains(filesPage.movedFolder.getText()));



    }




    //***********************FOURTH SCENARIO STEP DEFINITIONS**************************


    @When("the user right clicks on a different file")
    public void theUserRightClicksOnADifferentFile() {
        BrowserUtils.waitFor(3);

        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(filesPage.copiedFolder).build().perform();
        BrowserUtils.waitFor(3);

        BrowserUtils.waitFor(2);

    }

    @And("selects a different Destination folder")
    public void selectsADifferentDestinationFolder() {

        filesPage.destinationFolderCopy.click();

        BrowserUtils.waitFor(3);
    }

    @And("clicks on the Copy to Destination button again")
    public void clicksOnTheCopyToDestinationButtonAgain() {

        filesPage.copyToDestinationButton.click();
        BrowserUtils.waitFor(3);

    }

    //***********************FIFTH SCENARIO STEP DEFINITIONS**************************


    @When("the user clicks on three dots from Folder's menu")
    public void theUserClicksOnThreeDotsFromFolderSMenu() {

        filesPage.deleteDots.click();
        BrowserUtils.waitFor(3);
    }

    @And("clicks on the Delete Folder button")
    public void clicksOnTheDeleteFolderButton() {

        filesPage.deleteFolderButton.click();
        BrowserUtils.waitFor(2);

    }

    @Then("the selected item should disappear from the Files list")
    public void theSelectedItemShouldDisappearFromTheFilesList() {

        filesPage.deletedFilesButton.click();
        filesPage.deletedFile.isDisplayed();

        System.out.println(filesPage.deletedFile.getText());
        BrowserUtils.waitFor(3);

        filesPage.restoreButton.click();

    }
}
