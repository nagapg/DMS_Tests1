//Expected:Navigate to MAGIC Line Of Spons Map Screen//

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



@RunWith(AmwayProwlRunner.class) public class MAGIC_LOSMapTest {

    static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();


 @BeforeClass public static void setup() {
    	Reports.setTestCaseName("LineofsponMapTest");
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
	   		
	       
	         //Reports-->ABO Reports//
	   			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu5']/a[1]/span[1]"));
	   	        if(bStatus){
	   			System.out.println("Click on ABO Reports");
	   	        }	
	   	        else{
	   	        	System.out.println("Cannot Click on ABO Reports");
	   	        }
	   	        
	  
	   	     //Reports-->ABO Reports-->Line Of Spon Maps Rpts//
	   	        bStatus=GeneralFunctions.clickElement(By.linkText("Line of Sponsorship Maps"));   
	   	       if(bStatus){
	   			System.out.println("Click on Line Of Spon Maps Rpts");
	   	       }	
	   	       else{
	   	       	System.out.println("Cannot Click on Line Of Spon Maps Rpts");
	   	       }
	   	       
	   
	   	       //Validating the Expected//
	   		  bStatus =GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='searchBoxDiv']/div[1]"));
	   		  if (bStatus) {
	   	          System.out.println("Expected:Navigated to LineofsponMap");
	   	      } else {
	   	          System.out.println("Actual:Cannot navigate to LineofsponMapTest");
	   	      }
	   		  
	   		  //Uncheck Schedule//
	   		 bStatus =GeneralFunctions.clickElement(By.id("scheduleReport"));
	   		  if (bStatus) {
	   	          System.out.println("Unchecked");
	   	      } else {
	   	          System.out.println("Checked");
	   	      }
	   		  
	   		  //Click on view//
	   		  bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='formButtons']/table/tbody/tr/td[1]/button"));
	   		  if (bStatus) {
	   	          System.out.println("Clicked on view");
	   	      } else {
	   	          System.out.println("Cannot click on view");
	   	      }
	   		  
	   		
	   		  
	        com.alticor.magic.GeneralFunctions.close();
	   			//Reports//
	   			 if (bStatus) {
	   		            Reports.logResults(LogStatus.PASS, "Test Pass", "LineofsponMapTest");

	   		        } else {
	   		            Reports.logResults(LogStatus.FAIL, "Test Fail", "LineofsponMapTest");
	   		        }
	   		
	   	}
	   	}

	  



