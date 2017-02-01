package io.swarmauto.driverextended;

import org.openqa.selenium.WebDriver;
import com.alticor.magic.report.Reports;
import com.alticor.magic.report.StepReport;
import com.alticor.magic.report.TestReport;

/**
 * Created by harolddost on 4/5/16.
 */
public abstract class AbstractPageObject implements PageObject{

    protected WebDriver driver;
    protected TestReport report;

   
    public void navigate(WebDriver webDriver, String page) {
    	report.AddStep(new StepReport("Navigating to: " + page,report.ID));
        webDriver.navigate().to(page);
    }

    
    public void navigate(WebDriver webDriver) {
        navigate(webDriver,getPageUrl());
    }

   
    public void navigate(String s) {
        navigate(driver,s);
    }

    
    public void navigate() {
    	report.AddStep(new StepReport("Navigating to: " + getPageUrl(),report.ID));
        navigate(getPageUrl());
    }

    
    public String getPageUrl() {
        return getBaseUrl() + getPath();
    }
    
    
    public DynamicElement getDynamicElement() {
        return new DynamicElement(driver);
    }



}
