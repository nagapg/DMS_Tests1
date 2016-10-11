package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.test.pages.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class MAGIC_InvoiceInquiry {

	/** Init variables */
    boolean bStatus=false;
    
    @Before
	public void setUp() throws Exception {
    	Reports.setTestCaseName("MAGIC_InvoiceInquiry");
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
	   }
	
	  @Test
	  public void test() {
		  //Enter values//
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "010");
			if(bStatus){
	        	System.out.println("Enter Aff");
	        }	
	        else{
	        	System.out.println("Cannot enter Aff");
	        }
			
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "9995");
			if(bStatus){
	        	System.out.println("Enter Abo");
	        }	
	        else{
	        	System.out.println("Cannot Enter Abo");
	        }
			
	       bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"072016");
			if(bStatus){
	        	System.out.println("Enter Period");
	        }	
	        else{
	        	System.out.println("Cannot Enter Period");
	        }
			
			
			bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Click on Submit");
	        }	
	        else{
	        	System.out.println("Cannot click on submit");
	        }
			
			//Payment inquiry//
			bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[4]"));
					if(bStatus){
			        	System.out.println("Click on Payment Inquiry");
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
			        	System.out.println("Cannot click on Invoice Inquiry");
			        }
					
					
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
					
					
					bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='invoiceABODataTable']/tbody/tr[2]/td[10]/span/b"));
					if(bStatus){
			        	System.out.println("Orange Link clicked");
			        }	
			        else{
			        	System.out.println("Unable to click Orange Link");
			        }
					try {
						Thread.sleep(6000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					bStatus=GeneralFunctions.clickElement(By.name("viewButton"));
					if(bStatus){
			        	System.out.println("Clicked on Back button");
			        }	
			        else{
			        	System.out.println("Cannot Click on Back button");
			        }
					
					com.alticor.magic.GeneralFunctions.close();
					
					//Test Results//
					 if (bStatus) {
				          Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_InvoiceInquiry");

				      } else {
				          Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_InvoiceInquiry");
				      }
				      

						

				  }
				}
