package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.OrangeHRMPage;
import pages.OrangeHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class OrangeHRMSteps {
    WebDriver driver= Driver.getDriver();
   // steps.EtsyAppSteps.OrangeHRMSteps orangeHRMSteps=new steps.EtsyAppSteps.OrangeHRMSteps();
    OrangeHRMPage orangeHRMPage=new OrangeHRMPage();
    OrangeHomePage orangeHomePage=new OrangeHomePage();

    @Given("provide to the OrangeHRM web application")
    public void provide_to_the_OrangeHRM_web_application() {
        driver.get(ConfigReader.getProperty("OrangeHRMURL"));
    }
    @When("provide username {string} and password {string}")
    public void provide_username_and_password(String username, String password) {
        orangeHRMPage.userName.sendKeys(username);
        orangeHRMPage.password.sendKeys(password);
        orangeHRMPage.loginBtn.click();
    }
    @When("click on Admin tab")
    public void click_on_Admin_tab() throws InterruptedException {
        orangeHomePage.adminBtn.click();
        Thread.sleep(2000);
    }
    @When("provide any user name in username searchBox")
    public void provide_any_user_name_in_username_searchBox() {
        orangeHomePage.searchBox.sendKeys("Alice.Duval");
    }
    @When("click on search button")
    public void click_on_search_button() throws InterruptedException {
        orangeHomePage.searchBtn.click();
        Thread.sleep(2000);
    }
    @Then("validates that user name is searched")
    public void validates_that_user_name_is_searched() {
        String actualText=orangeHomePage.searchedName.getText();
        String expectedText="Alice.Duval";
        Assert.assertEquals(expectedText,actualText);
    }
}
