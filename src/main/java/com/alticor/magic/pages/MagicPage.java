package com.alticor.magic.pages;

import com.alticor.magic.report.DummyReport;
import io.swarmauto.driverextended.AbstractPageObject;
import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.Report;
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

    @Override public String getBaseUrl() {
        return baseUrl;
    }

    @Override public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override public String getPath() {
        return path;
    }

    @Override public void setPath(String s) {
        throw new UnsupportedOperationException();
    }

    @Override public void setup() {
        // Place Setup
    }

    @Override public void tearDown() {
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
            per.sendKeys(period);
        }

        mainSubmitButton().click();
    }
}
