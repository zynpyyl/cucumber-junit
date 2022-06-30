package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    // import from io.cucumber.java not from junit
    @Before // every scenario
    public void setupScenario(){
        System.out.println("======Setting up browser using cucumber @Before");
    }

    @After  // every scenario
    public void tearDownScenario(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
        // System.out.println("======Closing browser using cucumber @After");
    }

    @BeforeStep
    public void setup(){
        System.out.println("====Applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("====Applying tearDown using @AfterStep");
    }
}


/*
In the class we will be able to pass pre & post conditions to each scenario and each step
 */