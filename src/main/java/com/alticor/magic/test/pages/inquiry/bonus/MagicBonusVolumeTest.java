package com.alticor.magic.test.pages.inquiry.bonus;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.pages.inquiry.bonus.MagicBonusVolume;
import com.alticor.okta.OktaLogin;
import com.alticor.prowl.DriverUtility;
import org.junit.*;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;

public class MagicBonusVolumeTest {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    static MagicPage magicPage;
    static WebDriver driver;
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
        MagicBonusVolume volume = new MagicBonusVolume(driver,null);
        volume.navigate();
        collector.checkThat("Page Title",
                driver.getTitle(),equalTo(volume.pageTitle()));
    }

    @Test
    public void testAnnualVolumeSection(){
        MagicBonusVolume volume = new MagicBonusVolume(driver,null);
        volume.navigate();
        collector.checkThat("Annual Volumes Bar Label",
                volume.annualVolumeBarLabel().getText(),equalTo("Annual Volumes"));
    }

    @Test
    public void testMonthlyVolumeSection(){
        MagicBonusVolume volume = new MagicBonusVolume(driver,null);
        volume.navigate();
        collector.checkThat("Monthly Volumes Bar Label",
                volume.monthlyVolumeBarLabel().getText(),equalTo("Monthly Volumes"));
    }
}
