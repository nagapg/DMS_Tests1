package com.alticor.prowl.provider;

import com.alticor.prowl.UnsupportedBrowserException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class DriverProvider {
    private DriverProvider() {
    }

    public static WebDriver getFirefoxDriver() {
        
          
        FirefoxProfile p = new	FirefoxProfile();
        p.setAcceptUntrustedCertificates(true);
        p.setAssumeUntrustedCertificateIssuer(false);
       
        

      
       System.setProperty("webdriver.gecko.driver","geckodriver.exe");
       
       DesiredCapabilities cap =  DesiredCapabilities.firefox();
       //cap.setCapability(FirefoxDriver.MARIONETTE, true);
       //cap.setCapability("acceptSslCerts", true);
       //cap.setCapability("trustAllSSLCertificates", true);
       cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
       cap.setCapability(FirefoxDriver.PROFILE, p);      
       
        WebDriver driver = new FirefoxDriver(cap);

        
        driver.manage().window().maximize();
      
      // configureDriver(driver);

        return driver;
    }

    public static WebDriver getChromeDriver() {
    	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");

		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		
		WebDriver driver=new ChromeDriver(cap);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	

        configureDriver(driver);

        return driver;
    }

    public static WebDriver getIEDriver() {
        System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		cap.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
        cap.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
        cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
        cap.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING,false);
        cap.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS,true);
        
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		            //cap.setCapability(InternetExplorerDriver.HOST,true);//
        
		WebDriver driver = new InternetExplorerDriver(cap);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

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
        return getDriver(browser == null ? "ie" : browser);
    }
}
