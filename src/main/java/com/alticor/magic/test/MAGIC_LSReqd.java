//MA 6482 to Capture LS Reqd to be 20 or more if Trips=5 or more//

package com.alticor.magic.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.alticor.magic.test.pages.Reports;

import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;


public class MAGIC_LSReqd {
	/** Init variables */
	final private String LS="20.0";
	final private String trips="5";
	boolean bStatus=false;

	
	@BeforeMethod
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
		
		@AfterMethod
		 public void tearDown() throws Exception {
			 Reports.endTest();
		 }
		
		
		@Test
		  public void test() {
				GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "430");
				if(bStatus){
		        	System.out.println("AFF-Pass");
		        }	
		        else{
		        	System.out.println("AFF-Fail");
		        }
				
		      GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "22");
				if(bStatus){
		        	System.out.println("Abo-Pass");
		        }	
		        else{
		        	System.out.println("Abo-Fail");
		        }

				GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"082015");
				if(bStatus){
		        	System.out.println("Period-Pass");
		        }	
		        else{
		        	System.out.println("Period-Fail");
		        }
				
				GeneralFunctions.clickElement(By.id("SubmitButton"));
				if(bStatus){
		        	System.out.println("Submit-Pass");
		        }	
		        else{
		        	System.out.println("Submit-Fail");
		        }
				
		        //Inquiry//
				GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
				if(bStatus){
		        	System.out.println("Inqiry-Pass");
		        }	
		        else{
		        	System.out.println("Inquiry-Fail");
		        }
				
				//Inquiry-->GIP//
				GeneralFunctions.clickElement(By.xpath("//span[text()='GIP']"));
				if(bStatus){
		        	System.out.println("GIP-Pass");
		        }	
		        else{
		        	System.out.println("GIP-Fail");
		        }
				
				//Inquiry-->GIP-->LTS//
				bStatus=GeneralFunctions.clickElement(By.linkText("LTS"));
		        if(bStatus){
				System.out.println("LTS-Pass");
		        }	
		        else{
		        	System.out.println("LTS-Fail");
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
		    				
		    				 if (bStatus) {
			           Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_LSReqd");

			       } else {
			           Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_LSReqd");
			       }
			       com.alticor.magic.GeneralFunctions.close();


}
		}



