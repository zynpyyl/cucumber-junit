package com.cydeo.step_definitions;

import com.cydeo.pages.DataTable;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinitions {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {
        System.out.println(fruits);
    }

    @Given("User is on the dropdowns page of practice tool")
    public void userIsOnTheDropdownsPageOfPracticeTool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    DataTable dataTable= new DataTable();

    @Then("User should see all months info in month dropdown")
    public void userShouldSeeAllMonthsInfoInMonthDropdown(List<String> expectedMonths) {

//        Select monthOptions=new Select(dataTable.dropDownMonths );
//        List<String> actualMonths = new ArrayList<>();
//        for (WebElement option : monthOptions.getOptions()) {
//            actualMonths.add(option.getText());
//        }

        List<String> actualMonths = BrowserUtils.dropDownOptionsAsString(dataTable.dropDownMonths);

        Assert.assertTrue(expectedMonths.equals(actualMonths));

    }

}
