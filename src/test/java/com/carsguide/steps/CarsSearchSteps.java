package com.carsguide.steps;

import com.carsguide.pages.CarForSalePage;
import com.carsguide.pages.CarSearchPage;
import com.carsguide.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class CarsSearchSteps {

    HomePage homePage;
    CarSearchPage carSearchPage;
    CarForSalePage carForSalePage;

    @Given("User is on the home page")
    public void userIsOnTheHomePage() {
        homePage.open();
    }

    @When("User move to Buy and Sell Menu")
    public void userMoveToBuyAndSellMenu() {
        homePage.moveToBuyAndSell();
    }

    @Then("User click on Search Cars")
    public void userClickOnSearchCars() {
        homePage.clickSearchCar();
    }

    @And("User select car Make as {string}")
    public void userSelectCarMakeAs(String make) {
        carSearchPage.selectCarMake(make);
    }

    @And("User select car Model as {string}")
    public void userSelectCarModelAs(String model) {
        carSearchPage.selectCarModel(model);
    }

    @And("User select car Location as {string}")
    public void userSelectCarLocationAs(String location) {
        carSearchPage.selectCarLocation(location);
    }

    @And("User select car Price to ${string}")
    public void userSelectCarPriceTo(String price) {
        carSearchPage.selectCarPriceTo(price);
    }

    @And("User click on Find My Next Car button")
    public void userClickOnFindMyNextCarButton() {
        carSearchPage.clickFindMyNextCarButton();
    }

    @Then("User should see list of searched cars")
    public void userShouldSeeListOfSearchedCars() {
        System.out.println(carForSalePage.getFirstCarListName());
    }

    @And("Page title should be {string}")
    public void pageTitleShouldBe(String expectedTitle) {
        String actualTitle = carForSalePage.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
