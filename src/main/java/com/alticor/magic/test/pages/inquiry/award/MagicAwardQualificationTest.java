package com.alticor.magic.test.pages.inquiry.award;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.pages.inquiry.award.MagicAwardQualifications;
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

public class MagicAwardQualificationTest {

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
        magicPage.aboLookup("010", "670", null);
    }

    @AfterClass public static void tearDown() {
        WebDriverManager.getInstance().close();
    }

    @Test public void testPageTitle() {
        MagicAwardQualifications qualifications = new MagicAwardQualifications(driver, null);
        qualifications.navigate();
        collector.checkThat("Page Title", driver.getTitle(), equalTo(qualifications.pageTitle()));
    }

    @Test public void testQualificationsSection() {
        MagicAwardQualifications qualifications = new MagicAwardQualifications(driver, null);
        qualifications.navigate();
        collector.checkThat("Qualifications Bar Label",
            qualifications.qualificationsBarLabel().getText(), equalTo("Qualifications"));
    }
}
