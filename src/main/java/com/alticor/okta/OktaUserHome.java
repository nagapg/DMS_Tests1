package com.alticor.okta;

import com.alticor.magic.report.Reports;
import com.alticor.magic.report.TestReport;

import io.swarmauto.driverextended.AbstractPageObject;
import io.swarmauto.driverextended.DynamicElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OktaUserHome extends AbstractPageObject {

    private final String pageUrl = "https://amway.okta.com/app/UserHome";

    public OktaUserHome(WebDriver d, TestReport r) {
        driver = d;
        if (r == null) {
            report = Reports.CurrentTest;
        } else {
            report = r;
        }
    }

    private OktaUserHome() {
    }

    public DynamicElement userNameInputField() {
      //  return getDynamicElement().addSearch(By.id("user-signin"));//
    	 return getDynamicElement().addSearch(By.id("input26"));
    }

    public DynamicElement passwordInputField() {
       // return getDynamicElement().addSearch(By.id("pass-signin"));//
    	 return getDynamicElement().addSearch(By.id("input33"));
    }

    public DynamicElement submitButton() {
       // return getDynamicElement().addSearch(By.id("signin-button"));//
    	 return getDynamicElement().addSearch(By.id("Sign In"));
    }

    public void login(String username, String password) {
        navigate();
        userNameInputField().sendKeys(username);
        passwordInputField().sendKeys(password);
        submitButton().click();
    }

    public String pageTitle() {
        return "Amway Single Sign-on - My Applications";
    }

    public void setup() {

    }

    public void tearDown() {

    }

    public String getBaseUrl() {
        return null;
    }

    public void setBaseUrl(String s) {

    }

    public String getPath() {
        return null;
    }

    public void setPath(String s) {

    }
}
