package gmibank.stepdefinitions;

import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GmibankStepDefinitions {


    @Given("user go to {string}")
    public void user_go_to(String gmi_url) {

        Driver.getDriver().get(gmi_url);
        List<String> listHeader=Driver.getElementsText(By.id("header-tabs"));
        System.out.println(listHeader);

    }


}
