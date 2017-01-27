//Expected:Navigate to  MAGIC Volumes Screen//

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



@RunWith(AmwayProwlRunner.class) public class MAGIC_VolumesTest {

static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();


 @BeforeClass public static void setup() {
    	Reports.setTestCaseName("VolumesTest");
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
	

	// Declare variables //
	  boolean bStatus;

	@Test public void test() {
			
		  GeneralFunctions.driver=driver;

			//click on Volumes link//
		  bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='quickglancediv']/div[2]/a[1]"));
		  if (bStatus) {
	          System.out.println("Navigated to Volumes");
	      } 
		  else {
	          System.out.println("Cannot Navigate to Volumes");
	      }

		  
		  //Validating the Expected//
		  bStatus =GeneralFunctions.verifyVisibilityOFElement(By.id(".//*[@id='Tab_1']/div/span/a"));
		  if (bStatus) {
	          System.out.println("Navigated to Volumes");
	      } 
		  else {
	          System.out.println("Cannot Navigate to Volumes");
	      }
		
		  
		  com.alticor.magic.GeneralFunctions.close();

			
			//Reports//
	          if (bStatus) {
		            Reports.logResults(LogStatus.PASS, "Test Pass", "VolumesTest");
               } 
			 else {
		            Reports.logResults(LogStatus.FAIL, "Test Fail", "VolumesTest");
		        } 
		   
	}
	}

		  
