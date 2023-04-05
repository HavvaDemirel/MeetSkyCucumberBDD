package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {
    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement filesButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[2]/a/span[3]/a[2]/span[1]")
    public WebElement threeDots;
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









}
