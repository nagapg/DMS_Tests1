package com.alticor.magic.test.pages.inquiry.bonus;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.pages.inquiry.bonus.MagicTransactionDetail;
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

public class MagicTransactionDetailTest {

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

        magicPage = new MagicTransactionDetail(driver, null);
        magicPage.setBaseUrl(baseUrl);
        magicPage.aboLookup("010", "670", null);
    }

    @AfterClass public static void tearDown() {
        WebDriverManager.getInstance().close();
    }

    @Test public void testPageTitle() {
        MagicTransactionDetail detail = new MagicTransactionDetail(driver, null);
        detail.navigate();
        collector.checkThat("Page Title", driver.getTitle(), equalTo(detail.pageTitle()));
    }

    @Test public void testTransactionSection() {
        MagicTransactionDetail detail = new MagicTransactionDetail(driver, null);
        detail.navigate();
        collector.checkThat("Transaction Bar Label", detail.transactionBarLabel().getText(),
            equalTo("Transactions"));
    }
}
