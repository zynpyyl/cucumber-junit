package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DataTable {

    public DataTable(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "month")
    public WebElement dropDownMonths;


}
