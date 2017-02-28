//Baseline run on Prowl  Supported Code//

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



@RunWith(AmwayProwlRunner.class) public class MAGIC_AnnualBonusScreenTest {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();
    
    @BeforeClass public static void setup() {
    	Reports.setTestCaseName("MAGIC_AnnualBonusScreen");
        String baseUrl = EndpointProvider.getEndpoint();
        driver = WebDriverManager.getInstance().getDriver();

        oktaLogin = new OktaLogin(driver, Reports.CurrentTest);
        oktaLogin.login("cmns559",
            "our49pot");// TODO: Make this grab password from environment variables
        driver.getTitle();

        magicPage = new MagicPage(driver, Reports.CurrentTest);
        magicPage.setBaseUrl(baseUrl);

	
        magicPage.aboLookup("010", "9995", null);
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
		   			
			 //Click on Award Details//
		      bStatus=GeneralFunctions.clickElement(By.linkText("Award Details"));
	   	        if(bStatus){
	   			System.out.println("Click on Award Details");
	   	        }	
	   	        else{
	   	        	System.out.println("Cannot Click on Award Details");
	   	        }
	   			
	   	     //Validating the Expected//
	 	       String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id('AwdHistExpand')/x:div[1]"));
	 	      System.out.println("The Award Details Screen is "+ ExpVal);
	
			
			     com.alticor.magic.GeneralFunctions.close();
				
				//Test Reports//
				 if (bStatus) {
			            Reports.logResults(LogStatus.PASS, "Test Pass", "MAGIC_AnnualBonusScreen");

			        } else {
			            Reports.logResults(LogStatus.FAIL, "Test Fail", "MAGIC_AnnualBonusScreen");
			        }
		  
		    		
}
}



