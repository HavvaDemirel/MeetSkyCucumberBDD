package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.List;

public class FilesPage {


    public FilesPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class = 'button new']")
    public WebElement plusIcon;

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[1]/label")
    public WebElement uploadFileButton;

    @FindBy(xpath = "(//span[@class='displayname'])[2]")
    public WebElement newFolderButton;

    @FindBy(xpath = "//span[.='Selcuk.SShot']")
    public WebElement newUploadedFile;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[2]/a/span[2]/a[2]")
    public WebElement threeDots;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[2]/div/ul/li[8]/a/span[2]")
    public WebElement deleteFileButton;

    @FindBy(xpath = "//input[@id='view11-input-folder']")
    public WebElement newFolderNameBox;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement submitArrowButton;



    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[7]/td[2]/a/span[1]/span")
    public WebElement newAddedFolder;




    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement filesButton;


    @FindBy(xpath = "//tr/td[2]")
    public List<WebElement> tableElements;

    @FindBy(xpath = "//tbody[@id='fileList']/tr/td[1]/a/span[1]/span")
    public WebElement folderWithStar;
    @FindBy(xpath = "//a[@class='menuitem action action-details permanent'][@data-action='Details']\n")
    public WebElement detailsButton;
    @FindBy(xpath ="//h2[@class='app-sidebar-header__maintitle has-tooltip']")
    public WebElement sideBarTitle;
    @FindBy(xpath = "//div[@class='comment__message']")
    public List<WebElement> commends;
    @FindBy(xpath = "//*[@id='tab-comments']/div/div[2]/div[1]/div[2]/div/div/button/span")
    public WebElement sideBarThreeDotsIcon;
    @FindBy(xpath = "//span[.='Delete comment']")
    public WebElement sideBarDeleteButton;
    @FindBy(xpath = "//li[@class='app-sidebar-tabs__tab'][2]")
    public WebElement commendButton;
    @FindBy(xpath = "//div[@contenteditable='true'][@placeholder='Write message, @ to mention someone, : for emoji autocompletion …'][@aria-multiline='true'][contains(@class, 'rich-contenteditable__input')][@data-tribute='true']")
    public WebElement commendInputBox;
    @FindBy(xpath = "//input[@class='comment__submit icon-confirm has-tooltip']")
    public WebElement submitButton;
    @FindBy(xpath = "//div[contains(@class, 'toastify')][contains(@class, 'on')][contains(@class, 'dialogs')][contains(@class, 'toast-undo')][contains(@class, 'toastify-right')][contains(@class, 'toastify-top')][@style='transform: translate(0px, 0px); top: 15px;']")
    public WebElement sideBarDeletedMessage;
    @FindBy(xpath = "//a[.='Favourites']")
    public WebElement favoritesFile;
    @FindBy(xpath = "//span[.='Add to favourites']")
    public WebElement addToFavoritesButton;
    @FindBy(xpath = "//span[.='Rename']")
    public WebElement renameButton;

    @FindBy(xpath = "//table[@id='filestable']//tbody/tr[3]//td[2]")
    public WebElement movingFolder;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr/td[2]")
    public WebElement movedFolder;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[4]/td[2]")
    public WebElement copiedFolder;


//    @FindBy(xpath = "(//*[.='DestinationFolder'])[4]")
//    public WebElement destinationFolder1;

    @FindBy(xpath = "(//span[.='Move or copy'])[3]")
    public WebElement moveOrCopy;

    @FindBy(xpath = "//*[.='Destinati']")
    public WebElement destinationFolder2;

    @FindBy(xpath = "//*[.='onFolder2']")
    public WebElement destinationFolderCopy;



    @FindBy(xpath = "//*[@id=\"body-user\"]/div[10]/div[2]/button[2]")
    public WebElement moveToDestinationButton;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[10]/div[2]/button[1]")
    public WebElement copyToDestinationButton;

    @FindBy(xpath = "//label[@for='checkbox-allnewfiles']")
    public WebElement keepNewFileButton;

    @FindBy(xpath = "//button[@class='continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//table[@id='filestable']/tbody//tr//td[2]")
    public List<WebElement> namesInTheTable;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[10]/td[2]/a/span[3]/a[2]")
    public WebElement deleteDots;

    @FindBy(xpath = "//*[.='Delete folder']")
    public WebElement deleteFolderButton;

    @FindBy(xpath = "//table[@id='filestable']/tbody/tr[10]/td[2]")
    public WebElement deleteFolder;

    @FindBy(xpath = "//*[.='Deleted files']")
    public WebElement deletedFilesButton;

    @FindBy(xpath = "(//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[1])[2]")
    public WebElement deletedFile;

    @FindBy(xpath = "//*[.=' Restore']")
    public WebElement restoreButton;

    @FindBy(xpath = "//*[@id=\"filestable\"]/tfoot/tr/td[2]/span/span[1]")
    public WebElement totalFolders;

    @FindBy(xpath = "//*[@id=\"filestable\"]/tfoot/tr/td[2]/span/span[3]")
    public WebElement totalFiles;













}
