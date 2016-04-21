package com.alticor.magic.test.pages.inquiry.award;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.pages.inquiry.award.MagicAwardInquiry;
import com.alticor.okta.OktaLogin;
import com.alticor.prowl.DriverUtility;
import org.junit.*;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;

public class MagicAwardInquiryTest {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;

    @BeforeClass
    public static void setup(){
        driver = DriverUtility.getFirefoxDriver();

        oktaLogin = new OktaLogin(driver,null);
        oktaLogin.login("cmns559","our49pot");// TODO: Make this grab password from environment variables
        driver.getTitle();

        magicPage = new MagicPage(driver,null);
        magicPage.aboLookup("010","670",null);
    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }

    @Test
    public void testPageTitle(){
        MagicAwardInquiry inquiry = new MagicAwardInquiry(driver,null);
        inquiry.navigate();
        collector.checkThat("Page Title",
                driver.getTitle(),equalTo(inquiry.pageTitle()));
    }

    @Test
    public void testAwardFrontlinersSection(){
        MagicAwardInquiry inquiry = new MagicAwardInquiry(driver,null);
        inquiry.navigate();
        collector.checkThat("Frontliners Bar Label",
                inquiry.annualFrontLinersBarLabel().getText(),equalTo("Annual Frontliners"));
    }

    @Test
    public void testAwardInformationSection(){
        MagicAwardInquiry inquiry = new MagicAwardInquiry(driver,null);
        inquiry.navigate();
        collector.checkThat("Award Information Bar Label",
                inquiry.awardInformationBarLabel().getText(),equalTo("Award Information"));
    }

    @Test
    public void testAwardTrackingSection(){
        MagicAwardInquiry inquiry = new MagicAwardInquiry(driver,null);
        inquiry.navigate();
        collector.checkThat("Award Tracking Bar Label",
                inquiry.awardTrackingBarLabel().getText(),equalTo("Award Tracking"));
    }

    @Test
    public void testHighestAwardSection(){
        MagicAwardInquiry inquiry = new MagicAwardInquiry(driver,null);
        inquiry.navigate();
        collector.checkThat("Highest Award Bar Label",
                inquiry.highestAwardBarLabel().getText(),equalTo("Highest Tracking"));
    }

    @Test
    public void testTrackLegsSection(){
        MagicAwardInquiry inquiry = new MagicAwardInquiry(driver,null);
        inquiry.navigate();
        collector.checkThat("Track Legs Bar Label",
                inquiry.trackLegsBarLabel().getText(),equalTo("Tracking Legs"));
    }
}
