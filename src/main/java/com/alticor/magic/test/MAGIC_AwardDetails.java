//Expected Navigate to MAGIC Award Details screen//

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


@RunWith(AmwayProwlRunner.class) public class MAGIC_AwardDetails {
	
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
	
	/* @Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_AwardBoard");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-gamma:9452/EBS_UI_Web/Magic");
		GeneralFunctions.clickElement(By.id("overridelink"));
     if(bStatus){
        	System.out.println("Application-Pass");
        }	
        else{
        	System.out.println("Application-Fail");
        }
		}

	 @After
      public void tearDown() throws Exception {
	 Reports.endTest();
	   }*/
	
	  @Test
	  public void test() {
		  
		/*GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"),"9995");
	   		if(bStatus){
	          	System.out.println("Abo-Pass");
	           }	
	           else{
	           	System.out.println("Abo-Fail");
	           }
	   	
	   		bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
	   		if(bStatus){
	           	System.out.println("submit-Pass");
	           }	
	           else{
	           	System.out.println("submit-Fail");
	           }*/
	   		
		  GeneralFunctions.driver=driver;
		  
	   	 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   	 
	   	 
	   		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='IboDashboardAwardsdiv']/div/a[1]"));
			if(bStatus){
	        	System.out.println("Clicked on Awards link");
	        	}	
	        else{
	        	System.out.println("Cannot Click on Awards link");
	        }
			
	   		bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='AwdHistExpand']/div[1]"));
	   		if(bStatus){
	        	System.out.println("AwardDetails is present");
	        	}	
	        else{
	        	System.out.println("AwardDetails is  not present");
	        }
			
	   	 com.alticor.magic.GeneralFunctions.close();
	   		
	   //Test Reports//

	        if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_AwardDetails");

	        } else {
	            Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_AwardDetails");
	        }

			
}
}


