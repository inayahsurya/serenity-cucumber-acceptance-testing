package com.carsguide.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfiguration implements DriverSource {
    @Override
    public WebDriver newDriver() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
