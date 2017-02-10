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

@RunWith(AmwayProwlRunner.class) public class MAGIC_BaselineRerunTest {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_BaselineRerun");
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



	/**Declare variables */
	final private String sSuccessValidationMsg="GIP Baseline Recalcs triggered Successfully, Will be Notified via Email when it’s Processed.";
	private boolean bStatus=false;
	 
	
	/*@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_BaselineRerun");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
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
		/*  GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "430");
			if(bStatus){
	        	System.out.println("Enter Aff");
	        }	
	        else{
	        	System.out.println("Cannot Enter Aff");
	        }
			
	     
			GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "225");
			if(bStatus){
	        	System.out.println("Enter Abo");
	        }	
	        else{
	        	System.out.println("Cannot Enter Abo");
	        }

			
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"082016");
			if(bStatus){
	        	System.out.println("Enter Period");
	        }	
	        else{
	        	System.out.println("Cannot Enter Period");
	        }
			
			
			bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Enter Submit");
	        }	
	        else{
	        	System.out.println("Cannot Enter Submit");
	        }*/
			
		  GeneralFunctions.driver=driver;
			
			 //Maintenance//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
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
	       
	    
	       GeneralFunctions.enterTextToElement(By.id("effPerfYear"), "2016");
			if(bStatus){
	        	System.out.println("Enter Eff PY");
	        }	
	        else{
	        	System.out.println("Cannot Enter Eff PY");
	        }

			
			bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.id("userInfoDiv"));
			if(bStatus){
	        	System.out.println("Click Drop down selection");
	        }	
	        else{
	        System.out.println("Cannot Click Drop down selection");
	        }
			
			
			bStatus=GeneralFunctions.verifyVisibilityOFElement(By.linkText("APIND"));
			if(bStatus){
	        	System.out.println("APIND is Visible");
	        }	
	        else{
	        System.out.println("APIND is not Visible");
	        }
			
			
			bStatus=GeneralFunctions.clickElement(By.id("rerunBaselineButton"));
			if(bStatus){
	        	System.out.println("Click on Submit Rerun");
	        }	
	        else{
	        System.out.println("Cannot Click on Submit Rerun");
	        }
		 
			
			
			bStatus= GeneralFunctions.getText(By.id("successMsgDiv")).equalsIgnoreCase(sSuccessValidationMsg);;
		       if(bStatus){
				System.out.println("Capture Rerun");
		       }	
		       else{
		       	System.out.println("Cannot Capture Rerun");
		       }
		       
		       com.alticor.magic.GeneralFunctions.close();
		       
		     if (bStatus) {
		           Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_BaselineRerun");

		       } else {
		           Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_BaselineRerun");
		       }
		     

		 		

		   }
		 }



