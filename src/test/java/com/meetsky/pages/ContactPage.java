package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.jsoup.helper.W3CDom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy (xpath = "//a[@aria-label='Contacts']")
    public WebElement contactsButton;


    @FindBy (xpath = "//div[@id='newgroup']//button[@class='icon vue-button action-item__menutoggle icon-add']")
    public WebElement groupsAddButton;

    @FindBy (xpath = "//input[@class='action-input__input focusable']")
    public WebElement createGroupInput;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[3]/a/span")
    public WebElement coworkersisdisplayed;

    @FindBy (xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[4]/a/span")
    public WebElement groupsCoworker;

    @FindBy (xpath = "//*[@id=\"new-contact-button\"]")
    public WebElement newContact;

    @FindBy (className = "multiselect__tag")
    public WebElement selectedGroup;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[4]/a/span")
    public WebElement coworkerstext;


    @FindBy (xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/section/div[5]/div/div[2]/div[2]/div[1]")
    public WebElement contactGroupsDropdown;

    @FindBy (xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[4]/a/span")
    public WebElement  groupsFriendText;

    @FindBy (xpath = "//*[@id=\"NzQyYjAyZDMtZDJmOC00MzM0LWEzYTktMWNhNDhlOWJkZjdkfmNvbnRhY3\"]/div[2]/span")
    public WebElement newContact2;


    @FindBy (xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/section/div[6]/div/div[2]/div[2]/input")
    public WebElement addNewProperty;

    @FindBy(id = "new-contact-button")
    public WebElement newcontactbutton;

    @FindBy(xpath = "//input[@class='multiselect__input' and @autocomplete='nope' and @placeholder='Choose property type']")
    public WebElement propertytype;

    @FindBy(xpath = "//span[@class='name-parts__first' and text()='Birthday']")
    public WebElement birthdaybutton;














}
