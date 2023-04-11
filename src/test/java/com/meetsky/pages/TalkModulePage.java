package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkModulePage {
    public TalkModulePage(){PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[5]/a")
    public WebElement talkModuleButton;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/button/span[1]/svg")
    public WebElement showNavigation;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/div[1]/div/button/span")
    public WebElement addNewConversation;

    @FindBy(xpath = "//input[@class='conversation-name']")
    public WebElement typeGroupName;

    @FindBy(xpath = "//*[@id=\"content-vue\"]/div[2]/div[2]/div/div/div[2]/button/span/span")
    public WebElement addParticipants;

   // @FindBy(xpath = "//li[starts-with(@class,'participant-row isSearched')]")
    //public List<WebElement> addAnyParticipant;

    @FindBy(xpath = "//li[@aria-label='Add participant \"?124@.,\"']")
    public WebElement UserA;

    @FindBy(xpath = "//li[@aria-label='Add participant \"A\"']")
    public WebElement UserB;

    @FindBy(xpath = "//button[@class='button-vue navigation__button-right button-vue--text-only button-vue--vue-primary']")
    public WebElement createConversation;

    @FindBy(xpath = "//a[starts-with(@id,'conversation')]")
    public WebElement isDisplayedGroup;

   /* @FindBy(xpath = "//*[@id=\"tab-participants\"]/div/div/div/ul/li[2]/div[2]/div/span")
    public WebElement UserAisDisplayed;

    @FindBy(xpath = "//*[@id=\"tab-participants\"]/div/div/div/ul/li[3]/div[2]/div/span")
    public WebElement UserBisDisplayed;
*/
    @FindBy(xpath = "//li[starts-with(@class,'participant-row offline')]")
    public List<WebElement> usersDisplayed;

    @FindBy(xpath = "//*[@id=\"tab-participants\"]/div/div/div/ul/li[3]/div[3]/div/div/button")
    public WebElement threeDotUserA;

    @FindBy(xpath = "//*[starts-with(@id,'menu')]/li[7]")
    public WebElement removeUserA;

    @FindBy(xpath ="//*[starts-with(@id,'conversation_9qu4seh4')]/div/div[2]/div[1]/div[2]/span[1]")
   // @FindBy(linkText = "You removed")
    public WebElement displayyedRemoveUserA;



    @FindBy(xpath = "//*[@id=\"conversation_o6cgk4j8\"]")
    public WebElement groupName;


    @FindBy(xpath = "//*[@id=\"message_2455\"]/div/div[2]/div[1]/div")
    public WebElement textDisplay;

    @FindBy(xpath = "//*[@id=\"message_2456\"]/div/div/div[2]/div")
    public WebElement tickSign;

    @FindBy(xpath = "//*[@id=\"conversation_4zkxx574\"]/div/div[2]/div[2]/div/div/div/button/span")
    public WebElement threeDotNextGroupName;



}
