package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement fileButton;


    @FindBy(xpath = "//*[@id=\"header-menu-unified-search\"]/div[2]/div[1]/form/input")
    public WebElement searchbutton;

    @FindBy(xpath = "//*[@id=\"unified-search\"]/a/span")
    public WebElement magglass;

    @FindBy(xpath = "//*[@id=\"header-menu-unified-search\"]/div[2]/ul[1]/li[1]/a/span/h3/span/strong")
    public WebElement DoNotDeleteFolder;
    @FindBy(xpath = "//*[@id=\"header-menu-unified-search\"]/div[2]/ul/li[1]/a/span/h3")
    public WebElement DoNotDeleteContact;
    @FindBy(className = "app-dashboard")
    public WebElement dashboardpagemaincontent;




}
