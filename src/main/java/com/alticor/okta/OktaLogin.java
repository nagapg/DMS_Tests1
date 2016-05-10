package com.alticor.okta;

import com.alticor.magic.report.DummyReport;
import io.swarmauto.driverextended.AbstractPageObject;
import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OktaLogin extends AbstractPageObject {

    private String baseUrl = "https://amway.okta.com";

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

    @Override public void tearDown() {

    }

    @Override public String getBaseUrl() {
        return baseUrl;
    }

    @Override public void setBaseUrl(String s) {
        this.baseUrl = s;
    }

    @Override public String getPath() {
        return "/login/default";
    }

    @Override public void setPath(String s) {
        throw new UnsupportedOperationException();
    }
}
