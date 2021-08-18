package com.carsguide.pages;

import com.carsguide.locators.CarForSalePageLocators;
import net.thucydides.core.pages.PageObject;

public class CarForSalePage extends PageObject {

    public String getFirstCarListName(){
        return find(CarForSalePageLocators.FIRST_CAR_LIST_TEXT).getText();
    }
}
