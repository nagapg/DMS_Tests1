package com.alticor.prowl;

import com.alticor.prowl.provider.DriverProvider;
import org.openqa.selenium.WebDriver;

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
            driver = DriverProvider.getDriver(browser);
        }
        return driver;
    }

    public synchronized WebDriver getDriver() {
        if (driver == null) {
            driver = DriverProvider.getDriver();
        }
        return driver;
    }

    public synchronized void close() {
        
       driver.quit();
        driver = null;
    }
}
