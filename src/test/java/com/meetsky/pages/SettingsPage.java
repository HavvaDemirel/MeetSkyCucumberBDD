package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

    public SettingsPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy (xpath="//*[@id=\"settings\"]")
    public WebElement openedMenu;

    @FindBy(xpath = "//*[@id=\"expand\"]/div/img")
    public WebElement openedMenuButton;

    @FindBy(xpath = "//li[@data-id='settings']")
    public WebElement settingsbutton;

    @FindBy(xpath = "//*[@id=\"app-dashboard\"]/h2")
    public WebElement displaynamemessage;

    @FindBy(id = "displayname")
    public WebElement fullName;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "phone")
    public WebElement phoneNumber;

    @FindBy(xpath="//*[@id=\"phoneform\"]/h3/a/span")
    public WebElement phoneNumberKey;




    @FindBy (xpath ="//*[@id=\"phoneform\"]/h3/a/div/ul/li[1]/a/p/strong")
    public WebElement privateOption;


   // @FindBy (xpath="//*[@id=\"localeexample-date\"]")
   //@FindBy(id= "localeinput")
    //public WebElement localeDropdown;


   // @FindBy (xpath= "//*[@id=\"localeinput\"]/option[271]")
   // public WebElement currentLocation;


   //@FindBy(xpath="//*[@id=\"localeexample-date\"]")
    @FindBy(id="localeexample-time")
    public WebElement localtime;









}
