package io.swarmauto.driverextended;

import org.openqa.selenium.WebDriver;
import io.swarmauto.driverextended.Reports.*;
/**
 * Created by harolddost on 4/5/16.
 */
public abstract class AbstractPageObject implements PageObject{

    protected WebDriver driver;
    protected Report report;

   
    public void navigate(WebDriver webDriver, String page) {
    	System.out.println("Navigating to: " + page);
        webDriver.navigate().to(page);
    }

    
    public void navigate(WebDriver webDriver) {
        navigate(webDriver,getPageUrl());
    }

   
    public void navigate(String s) {
        navigate(driver,s);
    }

    
    public void navigate() {
    	System.out.println("Navigating to: " + getPageUrl());
        navigate(getPageUrl());
    }

    
    public String getPageUrl() {
        return getBaseUrl() + getPath();
    }
    
    
    public DynamicElement getDynamicElement() {
        return new DynamicElement();
    }



}
