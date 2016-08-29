package com.alticor.magic.test;
import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.alticor.magic.test.pages.Reports;

import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;

public class MAGIC_InvoiceInquiry {

	/** Init variables */
    boolean bStatus=false;
    
    @BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_InvoiceInquiry");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Application-Pass");
        }	
        else{
        	System.out.println("Application-Fail");
        }
		}

	
	  @AfterMethod
      public void tearDown() throws Exception {
	  Reports.endTest();
	   }
	
	  @Test
	  public void test() {
		  //Enter values//
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "010");
			if(bStatus){
	        	System.out.println("Aff-Pass");
	        }	
	        else{
	        	System.out.println("Aff-Fail");
	        }
			
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "9995");
			if(bStatus){
	        	System.out.println("Abo-Pass");
	        }	
	        else{
	        	System.out.println("Abo-Fail");
	        }
			
	       bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"072016");
			if(bStatus){
	        	System.out.println("Period-Pass");
	        }	
	        else{
	        	System.out.println("Period-Fail");
	        }
			
			
			bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("submit-Pass");
	        }	
	        else{
	        	System.out.println("submit-Fail");
	        }
			
			
			
			
			        //Payment inquiry//
			bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[4]"));
					if(bStatus){
			        	System.out.println("Payment Inquiry-Pass");
			        }	
			        else{
			        	System.out.println("Payment Inquiry-Fail");
			        }
					
					//Payment Inquiry-->Invoice Inquiry//
					bStatus=GeneralFunctions.clickElement(By.linkText("Invoice Inquiry"));
					if(bStatus){
			        	System.out.println("Invoice Inquiry-Pass");
			        }	
			        else{
			        	System.out.println("Invoice Inquiry-Fail");
			        }
					
					
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
					
					
					bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='invoiceABODataTable']/tbody/tr[2]/td[10]/span/b"));
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
					
					bStatus=GeneralFunctions.clickElement(By.name("viewButton"));
					if(bStatus){
			        	System.out.println("Back button-Pass");
			        }	
			        else{
			        	System.out.println("Back button-Fail");
			        }
					
					
					 if (bStatus) {
				          Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_InvoiceInquiry");

				      } else {
				          Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_InvoiceInquiry");
				      }
				      com.alticor.magic.GeneralFunctions.close();

						

				  }
				}
