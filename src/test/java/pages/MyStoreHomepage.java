package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyStoreHomepage {
public MyStoreHomepage(){
    WebDriver driver= Driver.getDriver();
    PageFactory.initElements(driver,this);

    }
    @FindBy(id="newsletter-input")
            public WebElement email;
}

