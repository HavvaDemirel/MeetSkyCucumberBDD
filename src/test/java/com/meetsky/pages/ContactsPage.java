package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@aria-label='Contacts'][1]")
    public WebElement contactsIcon;

    @FindBy(id = "new-contact-button")
    public WebElement createNewContact;

    @FindBy(id = "contact-fullname")
    public WebElement fullNameInput;

    @FindBy(xpath = "//div[@role='group']")
    public WebElement middleArea;

    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement allContactButton;

    @FindBy(xpath = "//svg[@viewBox='0 0 24 24']")
    public WebElement allListIcon;






}
