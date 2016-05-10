package com.alticor.magic.test.pages;

import com.alticor.magic.pages.MagicPage;
import com.alticor.okta.OktaLogin;
import com.alticor.prowl.DriverUtility;
import com.alticor.prowl.EndpointUtility;
import com.alticor.prowl.WebDriverManager;
import com.alticor.prowl.categories.SmokeTests;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;

@Category(SmokeTests.class) public class MagicPageTest {

    static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
        String baseUrl = EndpointUtility.getEndpoint();
        driver = WebDriverManager.getInstance().getDriver();

        oktaLogin = new OktaLogin(driver, null);
        oktaLogin.login("cmns559",
            "our49pot");// TODO: Make this grab password from environment variables
        driver.getTitle();

        magicPage = new MagicPage(driver, null);
        magicPage.setBaseUrl(baseUrl);
        magicPage.navigate();
    }

    @AfterClass public static void tearDown() {
        WebDriverManager.getInstance().close();
    }

    @Test public void testBasicMagicPageTitle() {
        collector.checkThat("Page Title", driver.getTitle(), equalTo(magicPage.pageTitle()));
    }

    @Test public void testABOLookupForm() {
        collector
            .checkThat("User Display", magicPage.userLoginLabel().isDisplayed(), equalTo(true));
        collector.checkThat("Affiliate Field",
            magicPage.affiliateInputField().getAttribute("value").length(), equalTo(3));
        collector
            .checkThat("ABO Number Field", magicPage.aboNumberInputField().getText(), equalTo(""));
        collector
            .checkThat("Period Field", magicPage.periodInputField().getAttribute("value").length(),
                equalTo(6));
    }
}
