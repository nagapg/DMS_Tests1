//Expected:Display MAGIC Frontliner Map Screen//

package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.report.Reports;
import com.alticor.okta.OktaLogin;
import com.alticor.prowl.AmwayProwlRunner;
import com.alticor.prowl.WebDriverManager;
import com.alticor.prowl.provider.EndpointProvider;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(AmwayProwlRunner.class) public class MAGIC_FrontlinerMapTest {

    static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("FrontlinerMapTest");
        String baseUrl = EndpointProvider.getEndpoint();
        driver = WebDriverManager.getInstance().getDriver();

        oktaLogin = new OktaLogin(driver, null);
        oktaLogin.login("cmns559",
            "our49pot");// TODO: Make this grab password from environment variables
        driver.getTitle();

        magicPage = new MagicPage(driver, null);
        magicPage.setBaseUrl(baseUrl);
        magicPage.aboLookup("010", "9995", "062016");
    }

    @AfterClass public static void tearDown() {
        WebDriverManager.getInstance().close();
        Reports.endTest();
    }





	/** Declare variables */
	boolean bStatus;

	@Test public void test() {

      GeneralFunctions.driver=driver;

			//click on frontliner map//
		  bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='IboDashboardMapExpand']/div[5]/a"));
	  	  if (bStatus) {
	            System.out.println("Navigated to Frontliner Map Screen");
	        } else {
	            System.out.println("Cannot Navigate to Frontliner Map Screen");
	        }

	  	  
	  	  //Validating the Expected//
	  	  bStatus =GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='LosMapExpand']/div"));
	  	  try {
	  			Thread.sleep(3000);
	  		} catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	  	  if (bStatus) {
	            System.out.println("Expected:Frontliner Map Screen displayed");
	        } else {
	            System.out.println("Actual:Cannot display Frontliner Map Screen");
	        }
	
	  	com.alticor.magic.GeneralFunctions.close();
	  	
	   	//Test Reports//
	        if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Passed", "FrontlinerMapTest");

	        } else {
	            Reports.logResults(LogStatus.FAIL, "Test Failed", "FrontlinerMapTest");
	        }
	  	  
	       }
	  }