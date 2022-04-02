package com.vytrack.step_definitions;

import com.vytrack.pages.AllCar;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AllCarStepDefs {

    AllCar allcar = new AllCar();
    WebDriverWait wait= new WebDriverWait(Driver.get(), 10);

    @And("the user clicks on filter button")
    public void the_user_clicks_on_filter_button() {

        wait.until(ExpectedConditions.elementToBeClickable(allcar.FilterButton));
        allcar.FilterButton.click();

    }

    @Then("the user selects Tags filter")
    public void the_user_selects_Tags_filter() {
        allcar.AddFilterButton.click();
        allcar.TagsButton.click();
    }

    @Then("the filter provides below options")
    public void the_filter_provides_below_options(List<String> options) {

        allcar.Feriha.click();
        allcar.IsAnyOf.click();

        List<WebElement> DropdownElements = allcar.IsAnyOfs;
        List<String> DropdownTexts = new ArrayList<>();

        for (WebElement dropdownElement : DropdownElements) {
            DropdownTexts.add(dropdownElement.getText());
        }

        System.out.println("options = " + options);
        System.out.println("DropdownTexts = " + DropdownTexts);

        Assert.assertEquals(options, DropdownTexts);

    }


    @When("the user clicks on Is any Of button")
    public void the_user_clicks_on_Is_any_Of_button() {

        allcar.Feriha.click();
        allcar.IsAnyOf.click();
        allcar.IsAnyOfOption.click();
        allcar.inputBox.click();
    }

    @When("the user chooses compact option")
    public void the_user_chooses_compact_option() throws InterruptedException {

        Thread.sleep(3000);
        allcar.CompactOption.click();
        allcar.UpdateButton.click();

        Thread.sleep(5000);
    }

    @Then("table contains the corresponding value")
    public void table_contains_the_corresponding_value() {

        List<WebElement> tagColumnElements = allcar.TagColumn;


      List<String> tagColumnText= new ArrayList<>();

        for (WebElement tagColumnElement : tagColumnElements) {
            tagColumnText.add(tagColumnElement.getText());

        }
        System.out.println(tagColumnText);

        for (String each : tagColumnText) {
            Assert.assertTrue(each.contains("Compact"));
        }

    }

}





