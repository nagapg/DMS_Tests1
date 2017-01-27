/*Expected:Navigate to MAGIC AwardBoard 
Enter Note 
Delete Note*/

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

@RunWith(AmwayProwlRunner.class) public class MAGIC_AwardBoardTest {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_AwardBoard");
        String baseUrl = EndpointProvider.getEndpoint();
        driver = WebDriverManager.getInstance().getDriver();

        oktaLogin = new OktaLogin(driver, null);
        oktaLogin.login("cmns559",
            "our49pot");// TODO: Make this grab password from environment variables
        driver.getTitle();

        magicPage = new MagicPage(driver, null);
        magicPage.setBaseUrl(baseUrl);
        magicPage.aboLookup("010", "9995", "012017");
    }

    @AfterClass public static void tearDown() {
        WebDriverManager.getInstance().close();
        Reports.endTest();
    }

/** Declare variables */
    private boolean bStatus=false;
    final private String sExpNote="Test Note";
    
  /*  @Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_AwardBoard");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Application-Pass");
        }	
        else{
        	System.out.println("Application-Fail");
        }
		}*/

	
	  /*@After
      public void tearDown() throws Exception {
	 Reports.endTest();
	   }*/
	
	  @Test
	  public void test() {
		  
		/*  GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"),"9995");
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
	           
			//Maintenance//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			if(bStatus){
	        	System.out.println("Maintanence Click-Pass");
	        	}	
	        else{
	        	System.out.println("Maintanence click-Fail");
	        }
			
			//Maintenance-->Award Board//
			bStatus=GeneralFunctions.clickElement(By.linkText("Award Board"));   
		       if(bStatus){
				System.out.println("Award Board Click-Pass");
		       }	
		       else{
		       	System.out.println("Award Board Click-Fail");
		       }
		       
		       
		       bStatus=GeneralFunctions.enterTextToElement(By.id("commonName"),  "Tester");
		        if(bStatus){
		    		System.out.println("Input Value-Pass");
		           }	
		           else{
		           	System.out.println("Input Value-Fail");
		           }
		       
		        
		        bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
		        if(bStatus){
		 		System.out.println("Reason Code Select-Pass");
		        }	
		        else{
		        	System.out.println("Reason Code Select-Fail");
		        }
		         
		        
		       bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
		        if(bStatus){
		    		System.out.println("Note Select-Pass");
		           }	
		           else{
		           	System.out.println("Note Select-Fail");
		           }
		        
		        bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
		        if(bStatus){
		    		System.out.println("Enter Note-Pass");
		           }	
		           else{
		           	System.out.println("Enter Note-Fail");
		           }
		        
		        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
		        if(bStatus){
		    		System.out.println("Save-Pass");
		           }	
		           else{
		           	System.out.println("Save-Fail");
		           }
		        
		        bStatus=GeneralFunctions.clickElement(By.id("addButton"));
		        if(bStatus){
		    		System.out.println("add-Pass");
		           }	
		           else{
		           	System.out.println("add-Fail");
		           }
		        
		        
		        bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
		        if(bStatus){
		 		System.out.println("Reason Code Select-Pass");
		        }	
		        else{
		        	System.out.println("Reason Code Select-Fail");
		        }
		         
		        
		       bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
		        if(bStatus){
		    		System.out.println("Note Select-Pass");
		           }	
		           else{
		           	System.out.println("Note Select-Fail");
		           }
		        
		          bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
		        if(bStatus){
		    		System.out.println("Enter Note-Pass");
		           }	
		           else{
		           	System.out.println("Enter Note-Fail");
		           }
		        
		         bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
		        if(bStatus){
		    		System.out.println("Save-Pass");
		           }	
		           else{
		           	System.out.println("Save-Fail");
		           }
		        
		        bStatus=GeneralFunctions.clickElement(By.id("editButton"));
		        if(bStatus){
		    		System.out.println("add-Pass");
		           }	
		           else{
		           	System.out.println("add-Fail");
		           }
		        
		        bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
		        if(bStatus){
		 		System.out.println("Reason Code Select-Pass");
		        }	
		        else{
		        	System.out.println("Reason Code Select-Fail");
		        }
		         
		         bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
		        if(bStatus){
		    		System.out.println("Note Select-Pass");
		           }	
		           else{
		           	System.out.println("Note Select-Fail");
		           }
		        
		        bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
		        if(bStatus){
		    		System.out.println("Enter Note-Pass");
		           }	
		           else{
		           	System.out.println("Enter Note-Fail");
		           }
		        
		        
		        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
		        if(bStatus){
		    		System.out.println("Save-Pass");
		           }	
		           else{
		           	System.out.println("Save-Fail");
		           }
		        
		       //Delete the note//
		         bStatus=GeneralFunctions.clickElement(By.id("deleteButton"));
		        if(bStatus){
		    		System.out.println("Delete-Pass");
		           }	
		           else{
		           	System.out.println("Delete-Fail");
		           }
		        
		         //Click on Ok//
		        GeneralFunctions.driver.switchTo().alert().accept();
		        if(bStatus){
		    		System.out.println("Ok-Pass");
		           }	
		           else{
		        	   System.out.println("Ok-Fail");
		           }
		        
		        com.alticor.magic.GeneralFunctions.close();
		        
		        //reporting//

		        if (bStatus) {
		            Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_AwardBoard");

		        } else {
		            Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_AwardBoard");
		        }
		       }
		  }

