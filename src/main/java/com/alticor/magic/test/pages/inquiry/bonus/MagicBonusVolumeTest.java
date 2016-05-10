package com.alticor.magic.test.pages.inquiry.bonus;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.pages.inquiry.bonus.MagicBonusVolume;
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

public class MagicBonusVolumeTest {

    static MagicPage magicPage;
    static WebDriver driver;
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
        MagicBonusVolume volume = new MagicBonusVolume(driver, null);
        volume.navigate();
        collector.checkThat("Page Title", driver.getTitle(), equalTo(volume.pageTitle()));
    }

    @Test public void testAnnualVolumeSection() {
        MagicBonusVolume volume = new MagicBonusVolume(driver, null);
        volume.navigate();
        collector.checkThat("Annual Volumes Bar Label", volume.annualVolumeBarLabel().getText(),
            equalTo("Annual Volumes"));
    }

    @Test public void testMonthlyVolumeSection() {
        MagicBonusVolume volume = new MagicBonusVolume(driver, null);
        volume.navigate();
        collector.checkThat("Monthly Volumes Bar Label", volume.monthlyVolumeBarLabel().getText(),
            equalTo("Monthly Volumes"));
    }
}
