package com.alticor.prowl.provider;

import com.alticor.prowl.UnsupportedBrowserException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DriverProvider {
    private DriverProvider() {
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
                return DriverProvider.getChromeDriver();
            case "firefox":
                return DriverProvider.getFirefoxDriver();
            case "ie":
                return DriverProvider.getIEDriver();
            default:
                throw new UnsupportedBrowserException(browser);
        }
    }

    /**
     * Returns a webdriver based on the environment variable BROWSER. The default for this is to use Firefox for now
     *
     * @return Configured WebDriver
     */
    public static WebDriver getDriver() {
        String browser = System.getenv("BROWSER");
        return getDriver(browser == null ? "firefox" : browser);
    }
}
