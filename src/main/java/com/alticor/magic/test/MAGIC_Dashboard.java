//Expected:Navigate to MAGIC Dashboard//
package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.test.pages.Reports;
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

@RunWith(AmwayProwlRunner.class) public class MAGIC_Dashboard {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_Dashboard");
        String baseUrl = EndpointProvider.getEndpoint();
        driver = WebDriverManager.getInstance().getDriver();

        oktaLogin = new OktaLogin(driver, null);
        oktaLogin.login("cmns559",
            "our49pot");// TODO: Make this grab password from environment variables
        driver.getTitle();

        magicPage = new MagicPage(driver, null);
        magicPage.setBaseUrl(baseUrl);
        magicPage.aboLookup("010", "9995", "072016");
    }

    @AfterClass public static void tearDown() {
        WebDriverManager.getInstance().close();
        Reports.endTest();
    }

    /** Declare variables */
    private boolean bStatus=false;
	
	 
	/* @Before public void setUp() throws Exception {
	        Reports.setTestCaseName("MAGIC_Dashboard");
	       bStatus = GeneralFunctions.openIEBrowser("https://magic-gamma:9452/EBS_UI_Web/Magic");
          GeneralFunctions.clickElement(By.id("overridelink"));
	        if (bStatus) {
	            System.out.println("Navigated to Environment");
	        } else {
	            System.out.println("Cannot navigate to Environment");
	        }
	    }*/

	  @Test public void test() {
		 /* bStatus =GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "9995");
		  if (bStatus) {
	            System.out.println("ABO entered");
	        } else {
	            System.out.println("Cannot enter ABO");
	        }*/
	    
		  GeneralFunctions.driver=driver;
		  
		  //Click on Dashboard//
	  bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='verticleMenuExpand']/div[4]"));
	  if (bStatus) {
          System.out.println("Navigated to Dashboard");
      } else {
          System.out.println("Cannot Navigate to Dashboard");
      }

	  
	  //Validating the Expected//
	  bStatus =GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='IboInfoExpand']/div[1]"));
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  if (bStatus) {
          System.out.println("Expected:Dashboard displayed");
      } else {
          System.out.println("Actual:Cannot display Dashboard");
      }
	  
	  
	  com.alticor.magic.GeneralFunctions.close();
		
		//Test Reports//
		 if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Pass", "MAGIC_Dashboard");

	        } else {
	            Reports.logResults(LogStatus.FAIL, "Test Fail", "MAGIC_Dashboard");
	        }
}

/*@After public void afterTest() {
	Reports.endTest();
}*/
	  
}

