package com.carsguide.pages;

import com.carsguide.locators.HomePageLocators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.carsguide.com.au/")
public class HomePage extends PageObject {

    public void moveToBuyAndSell(){
        moveTo(HomePageLocators.BUY_AND_SELL_MENU);
    }

    public void clickSearchCar() {
        find(HomePageLocators.SEARCH_CARS_MENU).click();
    }
}
