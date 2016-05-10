package com.alticor.prowl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtility {
    private DriverUtility() {
    }

    public static WebDriver getFirefoxDriver() {
        WebDriver driver = new FirefoxDriver();

        configureDriver(driver);

        return driver;
    }

    public static WebDriver getChromeDriver() {
        WebDriver driver = new ChromeDriver();

        configureDriver(driver);

        return driver;
    }

    public static WebDriver getIEDriver() {
        WebDriver driver = new InternetExplorerDriver();

        configureDriver(driver);

        return driver;
    }

    private static void configureDriver(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver(String browser) {
        switch (browser) {
            case "chrome":
                return DriverUtility.getChromeDriver();
            case "firefox":
                return DriverUtility.getFirefoxDriver();
            case "ie":
                return DriverUtility.getIEDriver();
            default:
                throw new UnsupportedOperationException("Unknown Browser: " + browser);
        }
    }
}
