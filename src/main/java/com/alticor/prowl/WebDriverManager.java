package com.alticor.prowl;

import org.openqa.selenium.WebDriver;

/**
 * Created by harolddost on 4/2/16.
 */
public class WebDriverManager {
    private static WebDriverManager instance;

    private WebDriver driver;

    private WebDriverManager() {
    }

    public static synchronized WebDriverManager getInstance() {
        if (instance == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    public synchronized WebDriver getDriver(String browser) {
        if (driver == null) {
            driver = DriverUtility.getDriver(browser);
        }
        return driver;
    }
}
