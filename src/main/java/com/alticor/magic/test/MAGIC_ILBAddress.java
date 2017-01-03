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

@RunWith(AmwayProwlRunner.class) public class MAGIC_ILBAddress {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_ILBAddress");
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
    final private String sExpNote="Test Note";
	
	/*@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_ILBAddress");
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
	
			/* GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "9995");
			if(bStatus){
	        	System.out.println("Enter Abo");
	        }	
	        else{
	        	System.out.println("Cannot Enter Abo");
	        }
			
			
		   bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Click on Submit");
	        }	
	        else{
	        	System.out.println("Cannot Click on Submit");
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
			
			
			//Maintenance-->Alternate ILB Add//
			bStatus=GeneralFunctions.clickElement(By.linkText("Alternate ILB Address"));   
		       if(bStatus){
				System.out.println("Click on Alt ILB Add");
		       }	
		       else{
		       	System.out.println("Cannot Click on Alt ILB Add Click");
		       }
		       
		       	bStatus=GeneralFunctions.enterTextToElement(By.id("nameOne"),  "Tester");
		        if(bStatus){
		    		System.out.println("Entered Name");
		           }	
		           else{
		           	System.out.println("Unable to Enter Name");
		           }
		        
		        //Enter Note//
		        bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
		        if(bStatus){
		 		System.out.println("Reason Code Select to enter the note");
		        }	
		        else{
		        	System.out.println("Cannot select Reason Code  to enter the note");
		        }
		         
		        
		       bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
		        if(bStatus){
		    		System.out.println("Note Selected");
		           }	
		           else{
		           	System.out.println("Unable to Select Note");
		           }
		        
		        
		       bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
		        if(bStatus){
		    		System.out.println("Note Entered");
		           }	
		           else{
		           	System.out.println("Unable to enter Note");
		           }
		        
		        
		        //Save the note//
		        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
		        if(bStatus){
		    		System.out.println("Clicked on Save");
		           }	
		           else{
		           	System.out.println("Unable to click on Save");
		           }
		        

		        
		        bStatus=GeneralFunctions.clickElement(By.id("submitButton"));
		        if(bStatus){
		    		System.out.println("Click on Submit");
		           }	
		           else{
		           	System.out.println("Unable to Click on Submit");
		           }
		        
		        
		        //Delete the note//
		        bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
		        if(bStatus){
		 		System.out.println("Delete the note");
		        }	
		        else{
		        	System.out.println("Cannot delete the note");
		        }
		         
		        
		       bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
		        if(bStatus){
		    		System.out.println("Note Selected");
		           }	
		           else{
		           	System.out.println("Cannot Select Note");
		           }
		        
		        
		       bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
		        if(bStatus){
		    		System.out.println("Note Entered");
		           }	
		           else{
		           	System.out.println("Cannot enter Note");
		           }
		        
		        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
		        if(bStatus){
		    		System.out.println("Clicked on save");
		           }	
		           else{
		           	System.out.println("Cannot click on Save");
		           }
		        
		        
		        bStatus=GeneralFunctions.clickElement(By.id("deleteButton"));
		        if(bStatus){
		    		System.out.println("Clicked on Delete");
		           }	
		           else{
		           	System.out.println("Cannot click on delete");
		           }
		        
		        //Confirm the delete//
		        GeneralFunctions.driver.switchTo().alert().accept();
		        if(bStatus){
		    		System.out.println("Note Deleted");
		           }	
		           else{
		        	   System.out.println("Unable to delete Note");
		           }

		        com.alticor.magic.GeneralFunctions.close();
		        
		        //Test Results//
		        if (bStatus) {
		            Reports.logResults(LogStatus.PASS, "Test Pass", "MAGIC_ILBAddress");

		        } else {
		            Reports.logResults(LogStatus.FAIL, "Test Fail", "MAGIC_ILBAddress");
		        }
		        
		        
		    }       
		       }
		 





