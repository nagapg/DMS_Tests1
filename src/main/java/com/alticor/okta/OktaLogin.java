package com.alticor.okta;

import com.alticor.magic.report.Reports;
import com.alticor.magic.report.TestReport;

import io.swarmauto.driverextended.AbstractPageObject;
import io.swarmauto.driverextended.DynamicElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;

public class OktaLogin extends AbstractPageObject {

//    private String baseUrl = "https://amway.okta.com";
private String baseUrl = "https://magic-gamma/EBS_UI_Web/Magic";
    public OktaLogin(WebDriver d, TestReport r) {
        driver = d;
        if (r == null) {
            report = Reports.CurrentTest;
        } else {
            report = r;
        }
    }

    private OktaLogin() {
    }

    public WebElement userNameInputField() {
       return new DynamicElement(driver).addSearch(By.id("input26"));
    	//return new DynamicElement(driver).addSearch(By.id("selectedAffLeftContainer"));//
    	 }

    public WebElement passwordInputField() {
       return new DynamicElement(driver).addSearch(By.id("input33"));
    	//return new DynamicElement(driver).addSearch(By.id("selectedIboNumber"));//
    }

    public WebElement submitButton() {
       return new DynamicElement(driver).addSearch(By.xpath("//input[@value='Sign In']"));
        //return new DynamicElement(driver).addSearch(By.xpath(".//*[@id='form17']/div[2]/input"));//
    	//return new DynamicElement(driver).addSearch(By.xpath(".//*[@id='SubmitButton']"));//
        
    }

    public void login(String username, String password) {
        navigate();
        userNameInputField().sendKeys(username);
        passwordInputField().sendKeys(password);
        submitButton().submit();
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