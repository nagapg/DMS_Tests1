/*Open IE 11 and navigate to Omega
 *Enter Aff:170/Abo:1707163545
 *Go to Inquiry-->Annuals-->Annual Bonus
 *Expected:Screen should appear without error display */

package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class MAGIC_AnnualBonusScreen {

      /** Init variables */
	  boolean bStatus=false;
	  
	  @Before
		public void setUp() throws Exception {
			Reports.setTestCaseName("MAGIC_AnnualBonusScreen ");
			bStatus=GeneralFunctions.openIEBrowser("https://magic-omega/EBS_UI_Web/Magic");
			if(bStatus){
	      	System.out.println("Navigated to Omega");
	      }	
	      else{
	      	System.out.println("Cannot Navigate to Omega");
	      }
			}
	  
	  @After
	  public void tearDown() throws Exception {
	  Reports.endTest();
	   }
	  
	  @Test
	  public void test() {
			bStatus= GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "170");
			if(bStatus){
	        	System.out.println("Entered Aff");
	        }	
	        else{
	        	System.out.println("Cannot Enter Aff");
	        }
			
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "1707163545");
			if(bStatus){
	        	System.out.println("Entered Abo");
	        }	
	        else{
	        	System.out.println("Cannot Enter Abo");
	        }
			
			bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Clicked on Submit");
	        }	
	        else{
	        	System.out.println("Cannot Click on Submit");
	        }
			
		   //Inquiry//
			GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
			if(bStatus){
	        	System.out.println("Clicked on Inqiry");
	        }	
	        else{
	        	System.out.println("Cannot click on Inquiry");
	        }
			
			//Inquiry-->Annuals//
			GeneralFunctions.clickElement(By.xpath("//span[text()='Annuals']"));
			if(bStatus){
	        	System.out.println("Clicked on Annuals");
	        }	
	        else{
	        	System.out.println("Cannot Click on Annuals");
	        }
			
			//Inquiry-->Annuals-->Annual Bonus//
			bStatus=GeneralFunctions.clickElement(By.linkText("Annual Bonus"));
	        if(bStatus){
			System.out.println("Clicked on Annual Bonus");
	        }	
	        else{
	        	System.out.println("Cannot Click on Annual Bonus");
	        }

	        //Validating the expected//
	        bStatus=GeneralFunctions.display(By.xpath(".//*[@id='searchBoxDiv']/form/div[1]"));
		     if(bStatus){
						System.out.println("Annual Bonus Screen is loaded");
				       }	
				       else{
				       	System.out.println("Cannot Load Annual Bonus Screen");
				       }
		     
		     com.alticor.magic.GeneralFunctions.close();
				
				//Test Reports//
				 if (bStatus) {
			            Reports.logResults(LogStatus.PASS, "Test Pass", "MAGIC_AnnualBonusScreen");

			        } else {
			            Reports.logResults(LogStatus.FAIL, "Test Fail", "MAGIC_AnnualBonusScreen");
			        }
		  
		    		
}
}