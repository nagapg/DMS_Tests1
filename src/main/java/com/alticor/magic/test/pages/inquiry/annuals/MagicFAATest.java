package com.alticor.magic.test.pages.inquiry.annuals;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.pages.inquiry.annuals.MagicFAA;
import com.alticor.okta.OktaLogin;
import com.alticor.prowl.AmwayProwlRunner;
import com.alticor.prowl.EndpointProvider;
import com.alticor.prowl.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(AmwayProwlRunner.class) public class MagicFAATest {

    static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
        String baseUrl = EndpointProvider.getEndpoint();
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
        MagicFAA faa = new MagicFAA(driver, null);
        faa.navigate();
        collector.checkThat("Page Title", driver.getTitle(), equalTo(faa.pageTitle()));
    }
}
