package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class FilesPage {


    public FilesPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class = 'button new']")
    public WebElement plusIcon;

    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "(//span[@class='displayname'])[2]")
    public WebElement newFolderButton;




}
