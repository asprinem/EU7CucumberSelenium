package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AllCar extends BasePage{

    public AllCar() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@class='action btn mode-icon-only']")
    public WebElement FilterButton;

    @FindBy(xpath="//a[@class='add-filter-button']")
    public WebElement AddFilterButton;


    @FindBy(id="ui-multiselect-0-0-option-1")
    public WebElement TagsButton;

    @FindBy(xpath = "//div[contains(@class,'btn filter')]")
    public WebElement Feriha;

    @FindBy(xpath = "//a[@class='dropdown-item choice-value']")
    public List<WebElement> IsAnyOfs;

    @FindBy(xpath = "//div[@class='btn-group btn-block']")
    public WebElement IsAnyOf;

    @FindBy(xpath="//*[text()='is any of']")
    public WebElement IsAnyOfOption;

    @FindBy(xpath="//li[@class='select2-search-field']")
    public WebElement inputBox;

    @FindBy(xpath = "//ul[2]/li[1]")
    public WebElement CompactOption;

    @FindBy(xpath = "//*[text()='Update']")
    public WebElement UpdateButton;

    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> TagColumn;


}
