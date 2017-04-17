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

@RunWith(AmwayProwlRunner.class)  public class MA9732_WithProwlCodeTest {
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();


 @BeforeClass public static void setup() {
	 Reports.setTestCaseName("MA9732_WithProwlCode");
        String baseUrl = EndpointProvider.getEndpoint();
        driver = WebDriverManager.getInstance().getDriver();

        oktaLogin = new OktaLogin(driver, null);
       //oktaLogin.login("cmns559","our49pot");//
     
        driver.getTitle();

        magicPage = new MagicPage(driver, null);
        magicPage.setBaseUrl(baseUrl);
        magicPage.aboLookup("430", "46", null);
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
			//Maintenance//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[3]"));
			if(bStatus){
	    	System.out.println("Click on Maintanence");
	    }	
	    else{
	    	System.out.println("Cannot Click on Maintanence");
	    }
			
			//Maintenance-->GIP//
			bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='SubMenu2']/a[14]/span[1]"));
			if(bStatus){
	    	System.out.println("Click on GIP");
	    }	
	    else{
	    	System.out.println("Cannot Click on GIP");
	    }
			
		  //Maintenance-->GIP-->Baseline Rerun//
	    bStatus=GeneralFunctions.clickElement(By.linkText("Baseline Rerun"));   
	   if(bStatus){
			System.out.println("Click on Baseline Rerun");
	   }	
	   else{
	   	System.out.println("Cannot Click on Baseline Rerun");
	   }
	   
 bStatus=GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='effPerfYear']"),"2016");
	if(bStatus){
		System.out.println("Enter Eff PY");
	}	
	else{
		System.out.println("Cannot Enter Eff PY");
	}

bStatus=GeneralFunctions.clickElement(By.id("rerunBaselineButton"));
	if(bStatus){
		System.out.println("Click on Submit Rerun");
	}	
	else{
	System.out.println("Cannot Click on Submit Rerun");
	}
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	//Capture the Result1//
	String ExpVal2=GeneralFunctions.getText(By.xpath(".//*[@id='successMsgDiv']"));
	 System.out.println("The Output is:"  +ExpVal2);

	 com.alticor.magic.GeneralFunctions.close();
		
		//Test Reports//
		 if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Pass", "MA9732_WithProwlCode");

	        } else {
	            Reports.logResults(LogStatus.FAIL, "Test Fail", "MA9732_WithProwlCode");
	        }

 		
}
}

