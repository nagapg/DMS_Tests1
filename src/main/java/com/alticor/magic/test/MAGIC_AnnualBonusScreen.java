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


@RunWith(AmwayProwlRunner.class) public class MAGIC_AnnualBonusScreen {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();
    
    @BeforeClass public static void setup() {
    	Reports.setTestCaseName("MAGIC_AnnualBonusScreen");
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
	  boolean bStatus=false;
	  
	
	  
	  
	  @Test
	  public void test() {
			
		  GeneralFunctions.driver=driver;
			
		   //Inquiry//
			GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
			if(bStatus){
	        	System.out.println("Clicked on Inqiry");
	        }	
	        else{
	        	System.out.println("Cannot click on Inquiry");
	        }
			
			//Inquiry-->Annuals//
			GeneralFunctions.clickElement(By.xpath("//span[text()='Annuals']"));
			if(bStatus){
	        	System.out.println("Clicked on Annuals");
	        }	
	        else{
	        	System.out.println("Cannot Click on Annuals");
	        }
			
			//Inquiry-->Annuals-->Annual Bonus//
			bStatus=GeneralFunctions.clickElement(By.linkText("Annual Bonus"));
	        if(bStatus){
			System.out.println("Clicked on Annual Bonus");
	        }	
	        else{
	        	System.out.println("Cannot Click on Annual Bonus");
	        }

	        //Validating the expected//
	        bStatus=GeneralFunctions.display(By.xpath(".//*[@id='searchBoxDiv']/form/div[1]"));
		     if(bStatus){
						System.out.println("Annual Bonus Screen is loaded");
				       }	
				       else{
				       	System.out.println("Cannot Load Annual Bonus Screen");
				       }
		     
		     com.alticor.magic.GeneralFunctions.close();
				
				//Test Reports//
				 if (bStatus) {
			            Reports.logResults(LogStatus.PASS, "Test Pass", "MAGIC_AnnualBonusScreen");

			        } else {
			            Reports.logResults(LogStatus.FAIL, "Test Fail", "MAGIC_AnnualBonusScreen");
			        }
		  
		    		
}
}



