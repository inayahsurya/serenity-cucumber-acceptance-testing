package com.carsguide.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfiguration implements DriverSource {
    @Override
    public WebDriver newDriver() {

        WebDriver driver;

        // chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // firefox
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();

        driver.manage().window().maximize();

        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
