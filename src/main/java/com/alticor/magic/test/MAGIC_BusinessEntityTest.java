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

@RunWith(AmwayProwlRunner.class) public class MAGIC_BusinessEntityTest {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_BusinessEntity");
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
		Reports.setTestCaseName("MAGIC_BusinessEntity");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Naviated to beta");
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
		  
		  GeneralFunctions.driver=driver;

		//Reports//
			GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));
			if(bStatus){
	        	System.out.println("Clicked on Reports");
	        }	
	        else{
	        	System.out.println("Cannot Click on Reports");
	        }
			
			//Reports-->ABO Reports//
			GeneralFunctions.clickElement(By.xpath("//span[text()='ABO Reports']"));
			if(bStatus){
	        	System.out.println("Clicked on ABO Reports");
	        }	
	        else{
	        	System.out.println("Cannot Click on ABO Reports");
	        }
			
			//Reports-->ABO Reports-->ILB bank File//
			GeneralFunctions.clickElement(By.linkText("ILB Alt Name"));
			if(bStatus){
	        	System.out.println("Clicked on ILB Alt name");
	        }	
	        else{
	        	System.out.println("Cannot Click on ILB Alt name");
	        }
			
			//Test Case1:Validating Business Entity Field//
			bStatus=GeneralFunctions.driver.findElement(By.name("searchInputCol2")).getAttribute("value").isEmpty();
			if(bStatus){
	        	System.out.println("BE Field is Empty");
	        }	
	        else{
	        	System.out.println("BE is not Empty");
	        }
			
			//Test Case2:Validating values on Business Entity Field//
			bStatus=GeneralFunctions.clickElement(By.name("searchButtonCol2"));
			if(bStatus){
	        	System.out.println("BE Drop Down list Visible");
	        }	
	        else{
	        System.out.println("BE Drop Down List not Visible");
	        }
			
			com.alticor.magic.GeneralFunctions.close();
			
			//Test Results//
			if(bStatus){
				Reports.logResults(LogStatus.PASS,"Tests Passed","MAGIC_BusinessEntity");
			}
			else{
				Reports.logResults(LogStatus.FAIL,"Tests Failed","MAGIC_BusinessEntity");
			}
			
		
		   }

		   }





