package com.alticor.magic.test.pages;

import com.alticor.magic.pages.MagicDashboard;
import com.alticor.magic.pages.MagicPage;
import com.alticor.okta.OktaLogin;
import com.alticor.prowl.EndpointRegistry;
import com.alticor.prowl.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;

public class MagicDashboardTest {

    static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
        String browser = System.getenv("BROWSER");
        String target = System.getenv("TARGET");
        String baseUrl = null;

        if (target == null) {
            target = "magic.dev";
        }

        baseUrl = EndpointRegistry.getEndpoint(target);
        driver = WebDriverManager.getInstance().getDriver(browser == null ? "firefox" : browser);

        oktaLogin = new OktaLogin(driver, null);
        oktaLogin.login("cmns559",
            "our49pot");// TODO: Make this grab password from environment variables
        driver.getTitle();

        magicPage = new MagicPage(driver, null);
        magicPage.setBaseUrl(baseUrl);
        magicPage.aboLookup("010", "670", null);
    }

    @AfterClass public static void tearDown() {
        driver.close();
    }

    @Test public void testPageTitle() {
        MagicDashboard dashboard = new MagicDashboard(driver, null);
        collector.checkThat("Page Title", driver.getTitle(), equalTo(dashboard.pageTitle()));
    }

    @Test public void testABOInfoSection() {
        MagicDashboard dashboard = new MagicDashboard(driver, null);
        collector.checkThat("ABO Info Bar Label", dashboard.aboInfoBarLabel().getText(),
            equalTo("Amway Business Owner Information"));
    }

    @Test public void testABOStatisticsSection() {
        MagicDashboard dashboard = new MagicDashboard(driver, null);
        collector.checkThat("ABO Statistics Bar Label", dashboard.aboStatisticsBarLabel().getText(),
            equalTo("Amway Business Owner Statistics"));
    }

    @Test public void testQuickGlanceSection() {
        MagicDashboard dashboard = new MagicDashboard(driver, null);
        collector.checkThat("Quick Glance Bar Label", dashboard.quickGlanceBarLabel().getText(),
            equalTo("Quick Glance"));
    }

    @Test public void testAwardQualifications() {
        MagicDashboard dashboard = new MagicDashboard(driver, null);
        collector.checkThat("Award Qualifications Bar Label",
            dashboard.awardQualificationsBarLabel().getText(), equalTo("Award Qualifications"));
    }
}
