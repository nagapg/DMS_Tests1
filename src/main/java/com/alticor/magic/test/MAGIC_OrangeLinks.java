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

@RunWith(AmwayProwlRunner.class) public class MAGIC_OrangeLinks {

	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_OrangeLinks");
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
		Reports.setTestCaseName("MAGIC_OrangeLinks");
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
		  
		  GeneralFunctions.driver=driver;
		//Processing//
		  bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[3]"));
			if(bStatus){
	        	System.out.println("Processing-Pass");
	        }	
	        else{
	        	System.out.println("Processing-Fail");
	        }
			
			
			//Processing-->payments//
			bStatus=GeneralFunctions.clickElement(By.xpath("(//span[text()='Payments'])[position()=2]"));
			if(bStatus){
	        	System.out.println("Payments-Pass");
	        }	
	        else{
	        	System.out.println("Payments-Fail");
	        }
			
			//Processing-->Payments-->ILB bank file//
			bStatus=GeneralFunctions.clickElement(By.linkText("ILB Bank File"));
			if(bStatus){
	        	System.out.println("ILB Bank File-Pass");
	        }	
	        else{
	        	System.out.println("ILB Bank File-Fail");
	        }
			
			//Enter Period//
			bStatus=GeneralFunctions.enterTextToElement(By.id("period"),"022015");
			if(bStatus){
	        	System.out.println("Period Enter-Pass");
	        }	
	        else{
	        	System.out.println("Period Enter-Fail");
	        }
			
			//click on Go button//
			bStatus=GeneralFunctions.clickElement(By.id("viewButton"));
			if(bStatus){
	        	System.out.println("Go-Pass");
	        }	
	        else{
	        System.out.println("Go-Fail");
	        }
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			
			bStatus=GeneralFunctions.clickElement(By.linkText("Rejected"));
			if(bStatus){
	        	System.out.println("Orange Link click-Pass");
	        }	
	        else{
	        System.out.println("Orange Link click-Fail");
	        }
			
	    	  try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  
	    	  bStatus=GeneralFunctions.clickElement(By.id("viewButton"));
	    	  if(bStatus){
	          	System.out.println("Back Click-Pass");
	          }	
	          else{
	          	System.out.println("Back Click-Fail");
	          }
	    		com.alticor.magic.GeneralFunctions.close();		
	 	
		if(bStatus){
			Reports.logResults(LogStatus.PASS,"Test Pass","MAGIC_OrangeLinks");
		}
		else
		{
			Reports.logResults(LogStatus.FAIL,"Test Fail","MAGIC_OrangeLinks");
		}
	
		
		
		}

	}







