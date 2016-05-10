package com.alticor.magic.pages;

import com.alticor.magic.report.DummyReport;
import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.PageObject;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagicPage implements PageObject {


    private static final String MAGIC_HOME = "/EBS_UI_Web/Magic";
    private static final String PAGE_TITLE = "MAGIC - Home Page";

    private static String baseUrl;

    private String path;

    private WebDriver driver;
    private Report report;

    public MagicPage() {
        path = MAGIC_HOME;
    }

    public MagicPage(WebDriver d, Report r) {
        this(d, r, MAGIC_HOME);
    }

    public MagicPage(WebDriver d, Report r, String p) {
        path = p;
        driver = d;
        if (r == null) {
            report = new DummyReport();
        } else {
            report = r;
        }

    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
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

    public DynamicElement getDynamicElement() {
        return new DynamicElement(driver, report);
    }

    @Override public void setup() {
        // Place Setup
    }

    @Override public void tearDown() {
        // Place Tear Down
    }

    @Override public void navigate(WebDriver webDriver, String page) {
        webDriver.navigate().to(page);
    }

    @Override public void navigate(WebDriver webDriver) {
        navigate(webDriver, getPageUrl());
    }

    @Override public void navigate(String s) {
        navigate(driver, s);
    }

    @Override public void navigate() {
        navigate(getPageUrl());
    }

    private String getPageUrl() {
        return baseUrl + path;
    }

    public void aboLookup(String affiliateNumber, String aboNumber, String period) {
        navigate();

        if (affiliateNumber != null) {
            DynamicElement aff = affiliateInputField();
            aff.clear();
            aff.sendKeys(affiliateNumber);
        }

        if (aboNumber != null) {
            DynamicElement aboNum = aboNumberInputField();
            aboNum.clear();
            aboNum.sendKeys(aboNumber);
        }

        if (period != null) {
            DynamicElement per = periodInputField();
            per.clear();
            per.sendKeys();
        }

        mainSubmitButton().click();
    }
}
