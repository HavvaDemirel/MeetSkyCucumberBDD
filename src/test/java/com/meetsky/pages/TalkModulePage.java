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

    @FindBy(xpath ="//*[starts-with(@id,'conversation')]/div/div[2]/div/div[2]/span[1]")
   // @FindBy(linkText = "You removed")
    public WebElement displayyedRemoveUserA;

    @FindBy(xpath = "//*[starts-with(@id,'conversation')]/div/div[2]/div[1]/div[1]/span[1]")
   // @FindBy(xpath = "//*[@id=\"conversation_svp9d8es\"]/div/div[2]/div[1]/div[2]/span[1]")
    public WebElement groupName;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[1]/div[2]/button")
    public WebElement peopleMenuButton;


    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div[3]/div/form/div[2]/div[2]/div")
    public WebElement inbox;

    @FindBy(xpath = "//*[starts-with(@id,'message')]/div/div[2]/div[1]/div")
   // @FindBy(xpath ="//*[@id=\"app-content-vue\"]/div/div[2]/div[2]/div[2]/div[2]")
    public WebElement textDisplay;

    @FindBy(xpath = "//*[starts-with(@id,'message_2')]/div/div/div[2]/div")
    public WebElement tickSign;

    @FindBy(xpath = "(//div[@class='trigger'][1]/button/span)[1]")
    public WebElement threeDotNextGroupName;

   @FindBy(xpath = "//*[starts-with(@id,'menu')]/li[6]/button")
  //@FindBy(xpath = "//*[@id=\"menu-ngksd\"]/li[6]/button")
    public WebElement deleteConversation;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[9]/h2")
   // @FindBy(linkText = "Do you really want to delete \"Friends\"?")
    public WebElement confirmMessageDelete;

   // @FindBy(xpath = "//*[@id=\"body-user\"]/div[9]/div[2]/button[2]")
    @FindBy(xpath = "//button[@class=\"primary\"]")
    public WebElement yesButton;

   // @FindBy(xpath = "//*[@id=\"emptycontent\"]/h2")
    @FindBy(xpath ="//*[@id=\"emptycontent-icon\"]")
    public WebElement emptyContent;


    @FindBy(xpath = "//*[@id=\"expand\"]/div")
    public WebElement userButton;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[4]/a")
    public WebElement logOutButton;

}
