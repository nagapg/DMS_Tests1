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

@RunWith(AmwayProwlRunner.class) public class MAGIC_LTSSymbols {
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_LSSymbols");
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
	Reports.setTestCaseName("MA 5344");
	bStatus=GeneralFunctions.openIEBrowser("https://magic-lambda/EBS_UI_Web/Magic");
	if(bStatus){
    	System.out.println("browser launched sucessfully");
    }	
    else{
    	System.out.println("unable to launch browser");
    }
}
	
	@After
	 public void tearDown() throws Exception {
		Reports.endTest();
	 }*/
	
	
	@Test
	  public void test() {
			
		/*GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "430");
			if(bStatus){
	        	System.out.println("Entered AFF");
	        }	
	        else{
	        	System.out.println("Unable to enter AFF");
	        }
			
	      GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "22");
			if(bStatus){
	        	System.out.println("Entered Abo");
	        }	
	        else{
	        	System.out.println("Unable to enter Abo");
	        }

			
			GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"082016");
			if(bStatus){
	        	System.out.println("Entered Period");
	        }	
	        else{
	        	System.out.println("Unable to enter Period");
	        }
			
			GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Click on Submit");
	        }	
	        else{
	        	System.out.println("Cannot click on Submit");
	        }*/
		  GeneralFunctions.driver=driver;
			
	        //Inquiry//
			GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
			if(bStatus){
	        	System.out.println("Click on Inqiry");
	        }	
	        else{
	        	System.out.println("Canot Click on Inquiry");
	        }
			
			//Inquiry-->GIP//
			GeneralFunctions.clickElement(By.xpath("//span[text()='GIP']"));
			if(bStatus){
	        	System.out.println("Click on GIP");
	        }	
	        else{
	        	System.out.println("Cannot Click on GIP");
	        }
			
			//Inquiry-->GIP-->LTS//
			bStatus=GeneralFunctions.clickElement(By.linkText("GIP/Events"));
	        if(bStatus){
			System.out.println("Click on LTS");
	        }	
	        else{
	        	System.out.println("Cannot Click on LTS");
	        }
	        
	        //Entering GIP:766//
	        bStatus=GeneralFunctions.enterTextToElement(By.id("gipCd"),"766");
			if(bStatus){
	        	System.out.println("Enter GIP:766");
	        }	
	        else{
	        	System.out.println("Cannot Enter GIP");
	        }
			
			 bStatus=GeneralFunctions.DropDown(By.id("bnsYear"),"2015");
			 if(bStatus){
		        	System.out.println("Selected PY");
		        }	
		        else{
		        	System.out.println("Cannot Select PY");
		        }
				
			 //Wait after Selecting PY//
		         try {
		    		Thread.sleep(9000);
		    	} catch (InterruptedException e) {
		    		// TODO Auto-generated catch block
		    		e.printStackTrace();
		    	}
				
		         //Click on Go//
		         bStatus=GeneralFunctions.clickElement(By.id("goButton"));
				if(bStatus){
		        	System.out.println("Clicked on Go");
		        }	
		        else{
		        	System.out.println("Cannot click on Go");
		        }
				
			
		         try {
		    		Thread.sleep(9000);
		    	} catch (InterruptedException e) {
		    		// TODO Auto-generated catch block
		    		e.printStackTrace();
		    	}

				//Validating that Approved,Tracking and Total are present//
				bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='pfbListTable']/thead/tr[2]/th[7]"));
				if(bStatus){
					System.out.println("Approved is visible");
			       }	
			       else{
			       	System.out.println("Approved is not visible");
			       }
				
				bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='pfbListTable']/thead/tr[2]/th[8]"));
				if(bStatus){
					System.out.println("Tracking is visible");
			       }	
			       else{
			       	System.out.println("Tracking is not visible");
			       }
	
              bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='pfbListTable']/thead/tr[2]/th[9]"));
				if(bStatus){
					System.out.println("Total is visible");
			       }	
			       else{
			       	System.out.println("Total is not visible");
			       }
	
				
				
		         try {
		    		Thread.sleep(9000);
		    	} catch (InterruptedException e) {
		    		// TODO Auto-generated catch block
		    		e.printStackTrace();
		    	}
		 
		         //Click on +//
		         GeneralFunctions.clickElement(By.id("iconCue0"));
					if(bStatus){
			        	System.out.println("+ Sysmbol-Clicked");
			        }	
			        else{
			        	System.out.println("+ Sysmbol-Not Clicked");
			        }
		         
					
					 
			         try {
			    		Thread.sleep(9000);
			    	} catch (InterruptedException e) {
			    		// TODO Auto-generated catch block
			    		e.printStackTrace();
			    	}
			         
			         //Click on -//
			         GeneralFunctions.clickElement(By.id("iconCue0"));
						if(bStatus){
				        	System.out.println("-   Sysmbol-Clicked");
				        }	
				        else{
				        	System.out.println("-   Sysmbol-Not Clicked");
				        }
						
						  
					       com.alticor.magic.GeneralFunctions.close();
					       
						//Test Results//
						  if (bStatus) {
					           Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_LSSymbols");

					       } else {
					           Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_LSSymbols");
					       }
						  
						


	}
	}
