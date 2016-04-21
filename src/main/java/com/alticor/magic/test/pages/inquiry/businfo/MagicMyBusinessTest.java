package com.alticor.magic.test.pages.inquiry.businfo;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.pages.inquiry.businfo.MagicMyBusiness;
import com.alticor.okta.OktaLogin;
import com.alticor.prowl.DriverUtility;
import org.junit.*;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;

public class MagicMyBusinessTest {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    static OktaLogin oktaLogin;
    static WebDriver driver;
    static MagicPage magicPage;

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
        MagicMyBusiness business = new MagicMyBusiness(driver,null);
        business.navigate();
        collector.checkThat("Page Title",
                driver.getTitle(),equalTo(business.pageTitle()));
    }

    @Test
    public void testNumberOneBusinessSection(){
        MagicMyBusiness business = new MagicMyBusiness(driver,null);
        business.navigate();
        collector.checkThat("Number One Bar Label",
                business.numberOneBusinessBarLabel().getText(),equalTo("Number 1 Business"));
    }

    @Test
    public void testNumberTwoBusinessSection(){
        MagicMyBusiness business = new MagicMyBusiness(driver,null);
        business.navigate();
        collector.checkThat("Number Two Bar Label",
                business.numberTwoBusinessBarLabel().getText(),equalTo("Number 2 Businesses"));
    }

    @Test
    public void testGlobalMultiBusinessSection(){
        MagicMyBusiness business = new MagicMyBusiness(driver,null);
        business.navigate();
        collector.checkThat("Global Multi Bar Label",
                business.globalMultiBusinessBarLabel().getText(),equalTo("Global Multi Business"));
    }

    @Test
    public void testInternationalSponsorBusinessSection(){
        MagicMyBusiness business = new MagicMyBusiness(driver,null);
        business.navigate();
        collector.checkThat("International Sponsor Bar Label",
                business.internationalSponsoredBusinessBarLabel().getText(),equalTo("Intl Sponsored Businesses"));
    }
}
