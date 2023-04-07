package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FolderViewPage {

    public FolderViewPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement filesButton;


    @FindBy(xpath = "//div[@id='app-content-files']//table//span[.='Name']")
    public WebElement nameButton;

    @FindBy(xpath = "//tr/td[2]")
    public List<WebElement> nameList;

    @FindBy(xpath = "//div[@id='app-content-files']//table//span[.='Size']")
    public WebElement sizeButton;

    @FindBy(xpath = "//table[@id='filestable']/tbody/tr/td[3]")
    public List<WebElement> sizeList;



    @FindBy(xpath = "//div[@id='app-content-files']//table//span[.='Modified']")
    public WebElement modifiedButton;

    @FindBy(xpath = "//span[@class='modified live-relative-timestamp']")
    public List<WebElement> modifiedList;

    @FindBy(id = "view-toggle")
    public WebElement toggleViewButton;

    // //label[@id='view-toggle']
    @FindBy(xpath = "//tr/td[2]")
    public List<WebElement> fileNames;

    @FindBy(xpath = "//label[@class='button icon-toggle-filelist']")
    public WebElement listView;

    //@FindBy(xpath = "//table[@class='list-container has-controls']")
    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement checkBox;

    //@FindBy (xpath = "//div[@id='app-content-files']//table//span[.='4 folders and 3 files']")
    @FindBy(xpath = "//span[@class='info']")
    public WebElement allSelected;

}
