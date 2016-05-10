package com.alticor.magic.test.pages.inquiry.businfo;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.pages.inquiry.businfo.MagicBusinessOwnerInfo;
import com.alticor.okta.OktaLogin;
import com.alticor.prowl.DriverUtility;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;

public class MagicBusinessOwnerInfoTest {

    static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
        driver = DriverUtility.getFirefoxDriver();

        oktaLogin = new OktaLogin(driver, null);
        oktaLogin.login("cmns559",
            "our49pot");// TODO: Make this grab password from environment variables
        driver.getTitle();

        magicPage = new MagicPage(driver, null);
        magicPage.aboLookup("010", "670", null);
    }

    @AfterClass public static void tearDown() {
        driver.close();
    }

    @Test public void testPageTitle() {
        MagicBusinessOwnerInfo ownerInfo = new MagicBusinessOwnerInfo(driver, null);
        ownerInfo.navigate();
        collector.checkThat("Page Title", driver.getTitle(), equalTo(ownerInfo.pageTitle()));
    }

    @Test public void testUplineInformationSection() {
        MagicBusinessOwnerInfo ownerInfo = new MagicBusinessOwnerInfo(driver, null);
        ownerInfo.navigate();
        collector.checkThat("Upline Information Bar Label",
            ownerInfo.uplineInformationBarLabel().getText(), equalTo("Upline Information"));
    }

    @Test public void testUplineMapSection() {
        MagicBusinessOwnerInfo ownerInfo = new MagicBusinessOwnerInfo(driver, null);
        ownerInfo.navigate();
        collector.checkThat("Upline Map Bar Label", ownerInfo.uplineMapBarLabel().getText(),
            equalTo("Upline Map"));
    }
}
