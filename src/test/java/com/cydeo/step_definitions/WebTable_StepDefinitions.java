package com.cydeo.step_definitions;

import com.cydeo.pages.WebTable;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebTable_StepDefinitions {
    WebTable webTable = new WebTable();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableUrl"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTable.usernameInputBox.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTable.passwordInputBox.sendKeys(string);
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        webTable.loginButton.click();
    }
    @Then("user should verify that url contains {string}")
    public void user_should_verify_that_url_contains(String string) {
        //Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
        BrowserUtils.verifyUrlContains(string);
    }

    @When("user enters username {string} and password {string} and click login")
    public void userEntersUsernameAndPasswordAndClickLogin(String arg0, String arg1) {
        webTable.usernameInputBox.sendKeys(arg0);
        webTable.passwordInputBox.sendKeys(arg1);
        webTable.loginButton.click();
    }
}
