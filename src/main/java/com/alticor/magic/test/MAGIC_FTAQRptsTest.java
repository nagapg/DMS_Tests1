
//Expected:Navigate to first time award qualification reports//

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

@RunWith(AmwayProwlRunner.class) public class MAGIC_FTAQRptsTest {

    static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("FirsttimeRptsTest");
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
	
			//Reports//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));
	        if(bStatus){
	        	System.out.println("Click on Reports");
	        }	
	        else{
	        	System.out.println("Cannot Click on Reports");
	        }
	   		
	   	  //Reports-->Qualification Reports//
	   			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu5']/a[6]/span[1]"));
	   	        if(bStatus){
	   			System.out.println("Click on Qualification Rpts");
	   	        }	
	   	        else{
	   	        	System.out.println("Cannot Click on Qualification Rpts");
	   	        }
	   			
	   	        //Reports-->Qualification Reports-->Award Qualification Reports //
	   	        bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu5_6']/a[1]/span[1]"));   
	   	       if(bStatus){
	   			System.out.println("Click on Award Qualification Reports");
	   	       }	
	   	       else{
	   	       	System.out.println("Cannot Click on Award Qualification Reports");
	   	       }
		  
	   	       
	   	  //Reports-->Qualification Reports-->Award Qualification Reports-->First Time Award Qual Rpts //
	   	        bStatus=GeneralFunctions.clickElement(By.linkText("First Time Award Qualifier Reports"));   
	   	       if(bStatus){
	   			System.out.println("Click on First Time Award Qual Rpts");
	   	       }	
	   	       else{
	   	       	System.out.println("Cannot Click on First Time Award Qual Rpts");
	   	       }
	   	  //Validating the Expected//
	   		  bStatus =GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='searchBoxDiv']/div[1]"));
	   		  if (bStatus) {
	   	          System.out.println("Expected:First Time Award Qual Rpts displayed");
	   	      } else {
	   	          System.out.println("Actual:Cannot display First Time Award Qual Rpts");
	   	      }
	   		  
	com.alticor.magic.GeneralFunctions.close();
	   			
	   			//Test Reports//
	   			if (bStatus) {
	   		            Reports.logResults(LogStatus.PASS, "Test Pass", "FirsttimeRptsTest");

	   		        } else {
	   		            Reports.logResults(LogStatus.FAIL, "Test Fail", "FirsttimeRptsTest");
	   		        }
	   	}
	   	}

	  




