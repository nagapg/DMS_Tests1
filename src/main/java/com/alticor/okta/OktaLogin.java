package com.alticor.okta;

import com.alticor.magic.report.DummyReport;
import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.PageObject;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OktaLogin implements PageObject {

    private final String pageUrl = "https://amway.okta.com/login/default";
    private WebDriver driver;
    private Report report;

    public OktaLogin(WebDriver d, Report r) {
        driver = d;
        if (r == null) {
            report = new DummyReport();
        } else {
            report = r;
        }
    }

    private OktaLogin() {
    }

    public DynamicElement userNameInputField() {
        return getDynamicElement().addSearch(By.id("user-signin"));
    }

    public DynamicElement passwordInputField() {
        return getDynamicElement().addSearch(By.id("pass-signin"));
    }

    public DynamicElement submitButton() {
        return getDynamicElement().addSearch(By.id("signin-button"));
    }

    public void login(String username, String password) {
        navigate();
        userNameInputField().sendKeys(username);
        passwordInputField().sendKeys(password);
        submitButton().click();
    }

    @Override public void setup() {

    }

    @Override public void navigate(WebDriver webDriver, String page) {
        webDriver.get(page);
    }

    @Override public void navigate(WebDriver webDriver) {
        navigate(webDriver, pageUrl);
    }

    @Override public void navigate(String s) {
        navigate(driver, s);
    }

    @Override public void navigate() {
        navigate(pageUrl);
    }

    @Override public void tearDown() {

    }

    private DynamicElement getDynamicElement() {
        return new DynamicElement(driver, report);
    }
}
