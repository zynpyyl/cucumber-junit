package com.cydeo.step_definitions;

import com.cydeo.pages.Wikipedia;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDefinitions {

    Wikipedia wikipedia = new Wikipedia();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://wikipedia.org/");
    }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
        wikipedia.searchBox.sendKeys(arg0);
    }


    @And("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipedia.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arg0));
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String arg0) {
        Assert.assertTrue(wikipedia.mainHeader.getText().contains(arg0));
    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String arg0) {
        Assert.assertTrue(wikipedia.imageHeader.getText().contains(arg0));
    }
}
