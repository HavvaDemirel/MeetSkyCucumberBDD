package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "user")
    public WebElement usernameInputBox;


    @FindBy(id = "password")
    public WebElement passwordInputBox;


    @FindBy(id = "submit-form")
    public WebElement loginButton;






























}
