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

    @FindBy(xpath = "//div[@role='listitem']/span[1]")
    public WebElement firstPerson;

    @FindBy(xpath = "(//button[@type='button'])[9]")
    public WebElement picIcon;

    @FindBy(xpath = "(//button[@type='button']/span[2])[9]")
    public WebElement chooseFromFiles;

    @FindBy(xpath = "//div[@class='oc-dialog']")
    public WebElement fileWindow;

    @FindBy(xpath = "//div[@role='listitem']/span[3]")
    public WebElement thirdPerson;

    @FindBy(xpath = "(//span[@class='material-design-icon dots-horizontal-icon'])[4]")
    public WebElement threeDots;

    @FindBy(xpath="(//button[@type='button'])[16]")
    public WebElement deleteButton;






}
