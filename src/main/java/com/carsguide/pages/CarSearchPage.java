package com.carsguide.pages;

import com.carsguide.locators.CarSearchPageLocators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.carsguide.com.au/buy-a-car/new-and-used-car-search")
public class CarSearchPage extends PageObject {

    public void selectMake(String make){
        find(CarSearchPageLocators.MAKE_DROP_DOWN).selectByVisibleText(make);
    }

    public void selectModel(String model){
        find(CarSearchPageLocators.MODEL_DROP_DOWN).selectByVisibleText(model);
    }

    public void selectLocation(String location){
        find(CarSearchPageLocators.LOCATION_DROP_DOWN).selectByVisibleText(location);
    }

    public void selectPriceTo(String price){
        find(CarSearchPageLocators.PRICE_TO_DROP_DOWN).selectByValue(price);
    }

    public void clickFindMyNextCarButton(){
        find(CarSearchPageLocators.FIND_MY_NEXT_CAR_BUTTON).click();
    }

}
