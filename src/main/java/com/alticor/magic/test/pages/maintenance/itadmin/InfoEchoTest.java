package com.alticor.magic.test.pages.maintenance.itadmin;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.pages.maintenance.itadmin.InfoEcho;
import com.alticor.okta.OktaLogin;
import com.alticor.prowl.AmwayProwlRunner;
import com.alticor.prowl.provider.EndpointProvider;
import com.alticor.prowl.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(AmwayProwlRunner.class) public class InfoEchoTest {

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
    }

    @AfterClass public static void tearDown() {
        WebDriverManager.getInstance().close();
    }

    @Test public void testPageTitle() {
        InfoEcho info = new InfoEcho(driver, null);
        info.navigate();
        collector.checkThat("Page Title", driver.getTitle(), equalTo(info.pageTitle()));
    }

    @Test public void testBuildPropertiesSection() {
        InfoEcho info = new InfoEcho(driver, null);
        info.navigate();
        collector.checkThat("Section Displayed", info.getBuildPropertiesPanel().isDisplayed(),
            equalTo(true));
        String revision = System.getenv("BUILD_REVISION");
        if (revision != null) {
            collector
                .checkThat("Correct Build Revision Number", info.getRevisionNumberField().getText(),
                    equalTo(revision));
        }
    }
}
