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

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[1]/label")
    public WebElement uploadFileButton;

    @FindBy(xpath = "(//span[@class='displayname'])[2]")
    public WebElement newFolderButton;

    @FindBy(xpath = "//span[.='Selcuk.SShot']")
    public WebElement newUploadedFile;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[2]/a/span[2]/a[2]")
    public WebElement threeDots;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[2]/div/ul/li[8]/a/span[2]")
    public WebElement deleteFileButton;

    @FindBy(xpath = "//input[@id='view11-input-folder']")
    public WebElement newFolderNameBox;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement submitArrowButton;

    @FindBy(xpath = "(//*[.='Selcuk'])[2]")
    public WebElement newSelcukFolder;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[7]/td[2]/a/span[1]/span")
    public WebElement newAddedFolder;





}
