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

    @FindBy(xpath = "//*[@id=\"content-vue\"]/div[2]/div[2]/div/div/div[1]/div/div[3]/div[1]/ul/li[2]")
    public WebElement UserA;

    @FindBy(xpath = "//*[@id=\"content-vue\"]/div[2]/div[2]/div/div/div[1]/div/div[3]/div[1]/ul/li[3]")
    public WebElement UserB;

    @FindBy(linkText = "Create conversation")
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

}
