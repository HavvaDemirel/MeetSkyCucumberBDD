package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotosPage {
    public PhotosPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div/div/div/div[2]/a/span/img")
    public WebElement manondesertphoto;
    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[3]/a")
    public WebElement photospage;

    @FindBy(xpath = "//*[@id=\"nextcloud\"]/div")
    public WebElement mainpagefromlogo;

}
