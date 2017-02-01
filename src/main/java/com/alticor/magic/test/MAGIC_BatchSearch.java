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

@RunWith(AmwayProwlRunner.class) public class MAGIC_BatchSearch {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName(" MAGIC_BatchSearch");
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
	
	/*@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_BatchSearch");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Navigated to beta");
        }	
        else{
        	System.out.println("Cannot navigate to beta");
        }
		}

	
	  @After
      public void tearDown() throws Exception {
	  Reports.endTest();
	   }*/
	
	  @Test
	  public void test() {
		  
		  GeneralFunctions.driver=driver;
		  
		  
			//Processing//
			bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[3]"));
	        if(bStatus){
	        	System.out.println("Click on Processing");
	        }	
	        else{
	        	System.out.println("Cannot Click on Processing");
	        }
	   		
	   	  //Processing-->Batch Processing//
	   			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Batch Processing']"));
	   	        if(bStatus){
	   			System.out.println("Click on Batch Processing");
	   	        }	
	   	        else{
	   	        	System.out.println("Cannot Click on Batch Processing");
	   	        }
	   			
	   	        //Processing-->Batch Processing-->Batch Search//
	   	        bStatus=GeneralFunctions.clickElement(By.linkText("Batch Search"));   
	   	       if(bStatus){
	   			System.out.println("Click on Batch Search");
	   	       }	
	   	       else{
	   	       	System.out.println("Cannot Click on Batch Search");
	   	       }
	   	       
	   	     bStatus=GeneralFunctions.enterTextToElement(By.name("searchBatchNumber"), "18848");
	   			if(bStatus){
	   	        	System.out.println("Enter Batch Number");
	   	        }	
	   	        else{
	   	        	System.out.println("Cannot Enter Batch Number");
	   	        }
	   			
	   			bStatus=GeneralFunctions.clickElement(By.id("viewButton"));
	   			if(bStatus){
	   	        	System.out.println("Click on Submit");
	   	        }	
	   	        else{
	   	        	System.out.println("Cannot Click on Submit");
	   	        }
	   			
	   		bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.linkText("18848"));
	   			if(bStatus){
	   			System.out.println("Click on Orange Link");
	   	       }	
	   	       else{
	   	       	System.out.println("Cannot Click on Orange Link");
	   	       }
	   			try {
	 			Thread.sleep(6000);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	   	
	   	bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath("//img[@tip='Back to Batch Search screen']"));
	   		 if(bStatus){
			System.out.println("Click on Back Button");
	       }	
	       else{
	       	System.out.println("Cannot Click on Back Button");
	       }
	   		  try {
	  			Thread.sleep(6000);
	  		} catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	   		 com.alticor.magic.GeneralFunctions.close();
	   		 
	   		 //Test Results//
	   		 if (bStatus) {
	             Reports.logResults(LogStatus.PASS, "Test Passed", " MAGIC_BatchSearch");

	         } else {
	             Reports.logResults(LogStatus.FAIL, "Test Failed", " MAGIC_BatchSearch");
	         }
	        }
	   }
