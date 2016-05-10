package com.alticor.magic.test.pages.inquiry.bonus;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.pages.inquiry.bonus.MagicAmountFlowInquiry;
import com.alticor.okta.OktaLogin;
import com.alticor.prowl.DriverUtility;
import com.alticor.prowl.EndpointUtility;
import com.alticor.prowl.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;

public class MagicAmountFlowInquiryTest {

    static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setupClass() {
        String baseUrl = EndpointUtility.getEndpoint();
        driver = WebDriverManager.getInstance().getDriver();

        oktaLogin = new OktaLogin(driver, null);
        oktaLogin.login("cmns559",
            "our49pot");// TODO: Make this grab password from environment variables
        driver.getTitle();

        magicPage = new MagicPage(driver, null);
        magicPage.setBaseUrl(baseUrl);

        magicPage.aboLookup("010", "670", null);
    }

    @AfterClass public static void tearDown() {
        WebDriverManager.getInstance().close();
    }

    @Test public void testPageTitle() {
        MagicAmountFlowInquiry inquiry = new MagicAmountFlowInquiry(driver, null);
        inquiry.navigate();
        collector.checkThat("Page Title", driver.getTitle(), equalTo(inquiry.pageTitle()));
    }

    @Test public void testILBFlowSection() {
        MagicAmountFlowInquiry inquiry = new MagicAmountFlowInquiry(driver, null);
        inquiry.navigate();
        collector.checkThat("ILB Flow Bar Label", inquiry.iblFlowBarLabel().getText(),
            equalTo("ILB Flow"));
    }
}
