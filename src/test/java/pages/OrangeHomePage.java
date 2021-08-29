package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeHomePage {
    public OrangeHomePage(){
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//a[@class='firstLevelMenu'][1]")
    public WebElement adminBtn;
    @FindBy(id="searchSystemUser_userName")
    public WebElement searchBox;
    @FindBy(id="searchBtn")
    public WebElement searchBtn;
    @FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr/td[2]")
    public WebElement searchedName;

    }

