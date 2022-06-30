package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearch;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearch googleSearch=new GoogleSearch();

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        // Write code here that turns the phrase above into concrete actions

        Driver.getDriver().get("https://www.google.com");

    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        // Write code here that turns the phrase above into concrete actions

        String expectedTitle="Google";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @When("user types apple in the google search box and clicks enter")
    public void userTypesAppleInTheGoogleSearchBoxAndClicksEnter() {
        googleSearch.searchBox.sendKeys("apple"+ Keys.ENTER);
    }

    @Then("user sees apple is in the google title")
    public void userSeesAppleIsInTheGoogleTitle() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("apple"));
    }

    @When("user types {string} in the google search box and clicks enter")
    public void userTypesInTheGoogleSearchBoxAndClicksEnter(String searchKeyword) {
        googleSearch.searchBox.sendKeys(searchKeyword+Keys.ENTER);
    }

    @Then("user sees {string} is in the google title")
    public void userSeesIsInTheGoogleTitle(String word) {
        String expectedTitle = word+" - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
