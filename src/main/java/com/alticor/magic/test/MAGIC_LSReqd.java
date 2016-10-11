//MA 6482 to Capture LS Reqd to be 20 or more if Trips=5 or more//

package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.test.pages.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class MAGIC_LSReqd {
	/** Init variables */
	final private String LS="20.0";
	final private String trips="5";
	boolean bStatus=false;

	
	@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MA 6482");
    	
    	//Open Browser and launch application//
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
		 }
		
		
		@Test
		  public void test() {
				GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "430");
				if(bStatus){
		        	System.out.println("Entered AFF");
		        }	
		        else{
		        	System.out.println("Cannot enter AFF");
		        }
				
		      GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "22");
				if(bStatus){
		        	System.out.println("Enter Abo");
		        }	
		        else{
		        	System.out.println("Cannot enter Abo");
		        }

				GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"082015");
				if(bStatus){
		        	System.out.println("Enter Period");
		        }	
		        else{
		        	System.out.println("Cannot enter Period");
		        }
				
				GeneralFunctions.clickElement(By.id("SubmitButton"));
				if(bStatus){
		        	System.out.println("Click on Submit");
		        }	
		        else{
		        	System.out.println("Cannot click on Submit");
		        }
				
		        //Inquiry//
				GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
				if(bStatus){
		        	System.out.println("Click on Inqiry");
		        }	
		        else{
		        	System.out.println("Click on Inquiry");
		        }
				
				//Inquiry-->GIP//
				GeneralFunctions.clickElement(By.xpath("//span[text()='GIP']"));
				if(bStatus){
		        	System.out.println("Click on GIP");
		        }	
		        else{
		        	System.out.println("Click on GIP");
		        }
				
				//Inquiry-->GIP-->LTS//
				bStatus=GeneralFunctions.clickElement(By.linkText("LTS"));
		        if(bStatus){
				System.out.println("Click on LTS");
		        }	
		        else{
		        	System.out.println("Click on LTS");
		        }

		      
		        //Existence of  LTS Trips//       
		    		bStatus=GeneralFunctions.display(By.xpath(".//*[@id='detailHeaderTable']/tbody/tr[1]/td[6]"));
		       // bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='detailHeaderTable']/tbody/tr[1]/td[6]"));	//
		        if(bStatus){
						System.out.println("LTS Trips displayed ");
				       }	
				       else{
				       	System.out.println("LTS Trips not displayed");
				       }
		    		
		    		//Display LTS Trips//
		    		bStatus=GeneralFunctions.getText(By.xpath(".//*[@id='detailHeaderTable']/tbody/tr[1]/td[6]")).equalsIgnoreCase(trips);
    				if(bStatus){
    					System.out.println("Total Number of LTS Trips are:" + trips);
    			       }	
    			       else{
    			       	System.out.println("Unable to capture LS Req");
    			       }
    				
    				bStatus=GeneralFunctions.getText(By.xpath(".//*[@id='detailHeaderTable']/tbody/tr[2]/td[4]")).equalsIgnoreCase(LS);
		    				if(bStatus){
		    					System.out.println(LS);
		    			       }	
		    			       else{
		    			       	System.out.println("Unable to capture LS Req");
		    			       }
		    				
		    				 com.alticor.magic.GeneralFunctions.close();
		    				 
		    				 //Test Results//
		    				 if (bStatus) {
			           Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_LSReqd");

			       } else {
			           Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_LSReqd");
			       }
			      }
		}




