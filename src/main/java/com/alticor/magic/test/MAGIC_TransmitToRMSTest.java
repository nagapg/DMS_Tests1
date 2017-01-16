//Expected:Click the check box and check the visibility of the check box in Transmit to RMS SCreen//

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

@RunWith(AmwayProwlRunner.class) public class MAGIC_TransmitToRMSTest {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	Reports.setTestCaseName("MAGIC_TransmitToRMSTest");
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

			//Processing//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[3]"));
			if(bStatus){
	        	System.out.println("click on Processing");
	        }	
	        else{
	        	System.out.println("Cannot click on Processing");
	        }
			
			//Processing-->Month Processing//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Month Processing']"));
			if(bStatus){
	        	System.out.println("click on Month Processing");
	        }	
	        else{
	        	System.out.println("Cannot click on Month Processing");
	        }
			
			//Processing-->Month Processing-->Transmit To RMS//
			bStatus=GeneralFunctions.clickElement(By.linkText("Transmit to RMS"));
	        if(bStatus){
			System.out.println("click on Transmit To RMS");
	        }	
	        else{
	        	System.out.println("Cannot click on Transmit To RMS");
	        }
		
	        
	        //Click the check box//
          bStatus=GeneralFunctions.clickElement(By.id("rowSelectedIN3"));
	        if(bStatus){
			System.out.println("click on Checkbox");
	        }	
	        else{
	        	System.out.println("Cannot click on Checkbox ");
	        }
	        
	         try {
	    		Thread.sleep(9000);
	    	} catch (InterruptedException e) {
	    		// TODO Auto-generated catch block
	    		e.printStackTrace();
	    	}
	        
	        //Check the visibility//
	        bStatus=GeneralFunctions.verifyVisibilityOFElement(By.id("faaCheckedIN3"));
	        if(bStatus){
			System.out.println("FAA Checkbox Visible-Pass");
	        }	
	        else{
	        	System.out.println("FAA Checkbox Visible-Fail");
	        }
	        
	        
	       //Check the second check box//
	        bStatus=GeneralFunctions.verifyVisibilityOFElement(By.id("intCheckedIN3"));
	        if(bStatus){
			System.out.println("INT Checkbox Click-Pass");
	        }	
	        else{
	        	System.out.println("INT Checkbox Click-Fail");
	        }
	        
	        com.alticor.magic.GeneralFunctions.close();
	        
	    if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_TransmitToRMSTest");

	        } else {
	            Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_TransmitToRMSTest");
	        }
	      }
	  }
