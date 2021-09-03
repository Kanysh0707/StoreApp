package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.MyStoreHomepage;
import pages.MyStoreNewPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class MyStoreSteps {
        WebDriver driver= Driver.getDriver();
        MyStoreHomepage myStoreHomepage=new MyStoreHomepage();
        MyStoreNewPage myStoreNewPage=new MyStoreNewPage();

    @Given("navigate to the store application")
    public void navigate_to_the_store_application() {
        driver.get(ConfigReader.getProperty("MyStoreURL"));
    }

    @When("provide email {string} in newsletter search box")
    public void provideEmailInNewsletterSearchBox(String email) {
        BrowserUtils.scroll(700);
        myStoreHomepage.email.sendKeys(email+ Keys.ENTER);
    }

    @Then("Validates success message {string}")
    public void validates_success_message(String successMessage) {
        String actualMessage=myStoreNewPage.successMessage.getText();
        Assert.assertEquals(successMessage,actualMessage);
    }
}
