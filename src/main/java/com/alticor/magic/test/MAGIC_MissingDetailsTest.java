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

@RunWith(AmwayProwlRunner.class) public class MAGIC_MissingDetailsTest {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_MissingDetails");
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

    /*@Test public void testPageTitle() {
        MagicFAA faa = new MagicFAA(driver, null);
        faa.navigate();
        collector.checkThat("Page Title", driver.getTitle(), equalTo(faa.pageTitle()));
    }*/
	
	/** Declare variables */
    boolean bStatus=false;

   /* @Before public void setUp() throws Exception {
   Reports.setTestCaseName("MAGIC_MissingDetails");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Opened beta");
        }	
        else{
        	System.out.println("Cannot Open beta");
        }
		}

	
    @After public void tearDown() throws Exception {
		  Reports.endTest();
	   }*/
	
	  @Test
	  public void test() {
		  /*Enter values//
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "010");
			if(bStatus){
	        	System.out.println("Passed Aff");
	        }	
	        else{
	        	System.out.println("Cannot Pass Aff");
	        }
			
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "9995");
			if(bStatus){
	        	System.out.println("Passed Abo");
	        }	
	        else{
	        	System.out.println("Cannot Pass Abo");
	        }
			
	       bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"072016");
			if(bStatus){
	        	System.out.println("Passed Period");
	        }	
	        else{
	        	System.out.println("Cannot Pass Period");
	        }
			
			
			bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Clicked on Submit");
	        }	
	        else{
	        	System.out.println("Cannot Click on Submit");
	        }*/
		  
		  GeneralFunctions.driver=driver;
		  
			 //Payment inquiry//
			bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[4]"));
					if(bStatus){
			        	System.out.println("Clicked on Payment Inquiry");
			        }	
			        else{
			        	System.out.println("Cannot Click on Payment Inquiry");
			        }
					
					//Payment Inquiry-->Invoice Inquiry//
					bStatus=GeneralFunctions.clickElement(By.linkText("Invoice Inquiry"));
					if(bStatus){
			        	System.out.println("Click on Invoice Inquiry");
			        }	
			        else{
			        	System.out.println("Cannot Click on Invoice Inquiry");
			        }
					
					bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='invoiceABODataTable']/tbody/tr[2]/td[10]/span/b"));
					if(bStatus){
			        	System.out.println("Clicked on Orange Link");
			        }	
			        else{
			        	System.out.println("Cannot Click on Orange Link click");
			        }
					
					//Validating the Expected//
					bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='viewTableDiv']/table/tbody/tr[2]/td[4]/span/b"));
					if(bStatus){
			        	System.out.println("Amount Details are displayed");
			        }	
			        else{
			        	System.out.println("Cannot display Amount Details");
			        }

                  //Capture the screen//
					bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='div0']/table/tbody/tr[2]/td[1]/div/table/tbody/tr[1]/td[2]"));
						if(bStatus){
						System.out.println("Values present");
               }
                else{
    	       System.out.println("Values not present");
              }
						
						//Close the Screen//
					bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='div0']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/img"));
					if(bStatus){
			        	System.out.println("Close the Screen");
			        }	
			        else{
			        	System.out.println("Cannot Close the Screen");
			        }
		
					bStatus=GeneralFunctions.clickElement(By.name("viewButton"));
					if(bStatus){
			        	System.out.println("Clicked on Back Button ");
			        }	
			        else{
			        	System.out.println("Cannot Click on Back Button");
			        }
					
					 com.alticor.magic.GeneralFunctions.close();
					
					//Test Results// 
					if (bStatus) {
				          Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_MissingDetails");

				      } else {
				          Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_MissingDetails");
				      }
				     

}
}
