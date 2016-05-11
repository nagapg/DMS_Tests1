package com.alticor.magic.test.pages.inquiry.bonus;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.pages.inquiry.bonus.MagicBonusAmount;
import com.alticor.okta.OktaLogin;
import com.alticor.prowl.provider.EndpointProvider;
import com.alticor.prowl.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;

public class MagicBonusAmountTest {

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
        MagicBonusAmount amount = new MagicBonusAmount(driver, null);
        amount.navigate();
        collector.checkThat("Page Title", driver.getTitle(), equalTo(amount.pageTitle()));
    }

    @Test public void testMonthlyVolumeSection() {
        MagicBonusAmount amount = new MagicBonusAmount(driver, null);
        amount.navigate();
        collector.checkThat("Monthly Volume Bar Label", amount.monthlyAmountsBarLabel().getText(),
            equalTo("Monthly Amounts"));
    }

    @Test public void testAnnualVolumeSection() {
        MagicBonusAmount amount = new MagicBonusAmount(driver, null);
        amount.navigate();
        collector.checkThat("Annual Volume Bar Label", amount.annualAmountsBarLabel().getText(),
            equalTo("Annual Amounts"));
    }
}
