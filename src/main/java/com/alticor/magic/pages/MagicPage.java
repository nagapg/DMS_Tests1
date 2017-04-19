package com.alticor.magic.pages;

import com.alticor.magic.report.Reports;
import com.alticor.magic.report.TestReport;

import io.swarmauto.driverextended.AbstractPageObject;
import io.swarmauto.driverextended.DynamicElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagicPage extends AbstractPageObject {

    private static final String MAGIC_HOME = "/EBS_UI_Web/Magic";
    private static final String PAGE_TITLE = "MAGIC - Home Page";

    private static String baseUrl;
    private String path;


    public MagicPage() {
        path = MAGIC_HOME;
    }

    public MagicPage(WebDriver d, TestReport r) {
        this(d, r, MAGIC_HOME);
    }

    public MagicPage(WebDriver d, TestReport r, String p) {
        path = p;
        driver = d;
        if (r == null) {
            report = Reports.CurrentTest;
        } else {
            report = r;
        }

    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        navigate(baseUrl);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String s) {
        throw new UnsupportedOperationException();
    }

    public void setup() {
        // Place Setup
    }

    public void tearDown() {
        // Place Tear Down
    }

    public String pageTitle() {
        return PAGE_TITLE;
    }

    public DynamicElement affiliateInputField() {
        return getDynamicElement().addSearch(By.id("selectedAffLeftContainer"));
        
    }

    public DynamicElement aboNumberInputField() {
        return getDynamicElement().addSearch(By.id("selectedIboNumber"));
    }

    public DynamicElement periodInputField() {
        return getDynamicElement().addSearch(By.id("selectedPeriod"));
    }

    public DynamicElement mainSubmitButton() {
        return getDynamicElement().addSearch(By.id("SubmitButton"));
    }

    public DynamicElement userLoginLabel() {
        return getDynamicElement().addSearch(By.className("login-as-container"));
    }


    public void aboLookup(String affiliateNumber, String aboNumber, String period) {
        driver.navigate();

       
        if (affiliateNumber != null) {
            DynamicElement aff = affiliateInputField();
            aff.clear();
            aff.sendKeys(affiliateNumber);
        }

        if (aboNumber != null) {
            DynamicElement aboNum = aboNumberInputField();
           // aboNum.clear();
            aboNum.sendKeys(aboNumber);
        }

        if (period != null) {
            DynamicElement per = periodInputField();
           // per.clear();
            per.sendKeys(period);
        }

        mainSubmitButton().click();
    }
}
