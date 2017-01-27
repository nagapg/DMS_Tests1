//Expected:Naviagate to  MAGIC Award details Screen//

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


@RunWith(AmwayProwlRunner.class) public class MAGIC_AwardDetailsTest {

    static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_AwardDetailsTest");
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
    private boolean bStatus=false;
	

	
	      @Test
     public void test() {

      GeneralFunctions.driver=driver;
    	  
    	//Click on Awards//
        bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='IboDashboardAwardsdiv']/div/a[1]"));
		if(bStatus){
      	System.out.println("Clicked on Awards link");
      	}	
      else{
      	System.out.println("Cannot Click on Awards link");
      }
		
 		bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='AwdHistExpand']/div[1]"));
 		if(bStatus){
      	System.out.println("Expected:AwardDetails displayed");
      	}	
      else{
      	System.out.println("Actual:AwardDetails not displayed");
      }
		
 	com.alticor.magic.GeneralFunctions.close();
 		
     //Test Reports//
    if (bStatus) {
          Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_AwardDetailsTest");

      } else {
          Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_AwardDetailsTest");
      }

		
}
}


