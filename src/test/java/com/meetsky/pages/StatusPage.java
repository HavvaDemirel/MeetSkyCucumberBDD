package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class StatusPage {

    public StatusPage() {PageFactory.initElements(Driver.getDriver(),this);}

   @FindBy( id = "settings")
    public WebElement profileIcon;

    @FindBy( xpath = "//nav[@id='expanddiv']//ul/li/div/a[2]")
    public WebElement setStatus;

    @FindBy(xpath = "//label[starts-with(@class,'user-status-online-select__label icon-user-status-online')]")
    public WebElement onlineStatus;

    @FindBy( xpath = "//label[starts-with(@class,'user-status-online-select__label icon-user-status-away')]")
    public WebElement awayButton;

    @FindBy( xpath = "//button[starts-with(@class,'action-item action-item--single header-close undefined undefined has-tooltip')]")
    public WebElement closeIcon;


    @FindBy(xpath = "//span[contains(@class,'predefined-status__message')]  [contains(text(),'In a meeting')]")
    public  WebElement inMeetingOpt;

    @FindBy(xpath = "//span[contains(@class,'button-vue__text')]  [contains(text(),'Set status message')]")
    public  WebElement setStMessageBtn;

    @FindBy( xpath = "//input[@placeholder='What is your status?']")
    public WebElement messagePHolder;

    @FindBy( xpath = "//button[@class='custom-input__emoji-button']")
    public WebElement emojiHolder;

    @FindBy( xpath = "//span[contains(@class,'emoji-set-apple emoji-type-native')] [contains(text(),'\uD83D\uDE0E')]")
    public WebElement emojiSunglasses;


}
