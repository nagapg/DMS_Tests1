//Expected:Navigate to  MAGIC Award search Screen//

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


@RunWith(AmwayProwlRunner.class) public class MAGIC_AwardSearchTest {

    static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();
    
    @BeforeClass public static void setup() {
    	Reports.setTestCaseName("AwardSearchTest");
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
	  boolean bStatus=false;
	  
	  @Test
	  public void test() {
			
		  GeneralFunctions.driver=driver;
			
		//Inquiry//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
	        if(bStatus){
	        	System.out.println("Click on Inquiry");
	        }	
	        else{
	        	System.out.println("Cannot Click on Inquiry");
	        }
	   		
	   	  //Inquiry-->Awards//
	   			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[1]/span[1]"));
	   	        if(bStatus){
	   			System.out.println("Click on Awards");
	   	        }	
	   	        else{
	   	        	System.out.println("Cannot Click on Awards");
	   	        }
	   			
	   	        //Inquiry-->Awards-->Award Search//
	   	        bStatus=GeneralFunctions.clickElement(By.linkText("Award Search"));   
	   	       if(bStatus){
	   			System.out.println("Click on Award Search");
	   	       }	
	   	       else{
	   	       	System.out.println("Cannot Click on Award Search");
	   	       }
		  
	   	  //Validating the Expected//
	   		  bStatus =GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='searchBoxDiv']/div[1]"));
	   		  if (bStatus) {
	   	          System.out.println("Expected:Award Search Screen displayed");
	   	      } else {
	   	          System.out.println("Actual:Cannot display Award Search Screen");
	   	      }
	   		  
	   		  
	 com.alticor.magic.GeneralFunctions.close();
	   			
	   			//Test Reports//
	   			if (bStatus) {
	   		            Reports.logResults(LogStatus.PASS, "Test Pass","AwardSearchTest");

	   		        } else {
	   		            Reports.logResults(LogStatus.FAIL, "Test Fail","AwardSearchTest");
	   		        }
	   	}
	   	}

	  






