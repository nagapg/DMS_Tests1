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

@RunWith(AmwayProwlRunner.class)  public class MAGIC_IBOPlainumDisplay {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_IBOPlainumDisplay");
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
	  Reports.setTestCaseName("MAGIC_IBOPlainumDisplay");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
      	System.out.println("Navigated to beta");
      }	
      else{
      	System.out.println("Cannot Navigate to beta");
      }
		}
  
  @After
  public void tearDown() throws Exception {
	  Reports.endTest();
   }*/
  
  @Test
  public void test() {
	/*	bStatus= GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "170");
		if(bStatus){
        	System.out.println("Entered Aff");
        }	
        else{
        	System.out.println("Cannot Enter Aff");
        }
		
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "3101003819");
		if(bStatus){
        	System.out.println("Entered Abo");
        }	
        else{
        	System.out.println("Cannot Enter Abo");
        }

	bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"062016");
		if(bStatus){
        	System.out.println("Entered Period");
        }	
        else{
        	System.out.println("Cannot Enter Period");
        }
  
		bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
		if(bStatus){
        	System.out.println("Clicked on Submit");
        }	
        else{
        	System.out.println("Cannot Click on Submit");
        }*/
	  
	  GeneralFunctions.driver=driver;
		
		//Click on Dashboard//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='verticleMenuExpand']/div[4]"));
		if(bStatus){
        	System.out.println("Clicked on Dashboard");
        	}	
        else{
        	System.out.println("Cannot Click on Dashboard");
        }
		
       //Capture Platinum value from dashboard//
		String val1=GeneralFunctions.getText(By.xpath(".//*[@id='ABOInfo']/table/tbody/tr[3]/td[5]/a"));
		System.out.println("The Platinum value is    "  +  val1);
		
		//Capturing Sponsor value from Dashboard//
		String val2=GeneralFunctions.getText(By.xpath(".//*[@id='ABOInfo']/table/tbody/tr[4]/td[2]/a"));
		System.out.println("The Sponsor value is      "  +  val2);
		
		//Comparing the string values//
	   if(val1.equals(val2)){
			System.out.println("IBO Platinum and Sponsor are equal");
			}
		else
		{
			System.out.println("IBO Platinum and Sponsor are not equal");
		}
	   
	   com.alticor.magic.GeneralFunctions.close();
		
		//Test Reports//
		 if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Pass", "MAGIC_IBOPlainumDisplay");

	        } else {
	            Reports.logResults(LogStatus.FAIL, "Test Fail", "MAGIC_IBOPlainumDisplay");
	        }
 
}
}




