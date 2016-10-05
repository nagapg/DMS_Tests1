package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class MAGIC_BusOwnerAttributeLinks {

	/** Init variables */
    private boolean bStatus=false;
    final private String sSuccessValidationMsg="Validation Was Successful";	//successMessage
    final private String sTranscSuccessMsg="Transaction Successfully Submitted";
	final private String sExpNote="Test Note";
	

	@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_BusOwnerAttributeLinks");
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
		  GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "9995");
			if(bStatus){
	        	System.out.println("Enter Abo");
	        }	
	        else{
	        	System.out.println("Cannot enter Abo");
	        }

			
				bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Click on Submit");
	        }	
	        else{
	        	System.out.println("Cannot Click on Submit");
	        }
			
	       
			//Maintenance//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			if(bStatus){
	        	System.out.println("Click on Maintanence");
	        	}	
	        else{
	        	System.out.println("Cannot Click on Maintanence");
	        }
			
			//Maintenance-->LOS//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='LOS']"));
			if(bStatus){
	        	System.out.println("Click on LOS");
	        }	
	        else{
	        	System.out.println("Cannot Click on LOS");
	        }
			
			//Maintenance-->LOS-->Bus Owner Attribute Links//
			bStatus=GeneralFunctions.clickElement(By.linkText("Bus Owner Attribute Links"));   
		       if(bStatus){
				System.out.println("Click on Bus Owner Attribute");
		       }	
		       else{
		    	   System.out.println("Cannot Click on Bus Owner Attribute");
		       }
			
	        //Enter Reason code//
		       bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
		       if(bStatus){
				System.out.println("Click on  Reason code");
		       }	
		       else{
		       	System.out.println("Cannot Click on  Reason code");
		       }
		        
		       bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
		       if(bStatus){
		   		System.out.println("Click on Note");
		          }	
		          else{
		          	System.out.println("Cannot Click on Note");
		          }
		       
		       
		      bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
		       if(bStatus){
		   		System.out.println("Enter Note");
		          }	
		          else{
		          	System.out.println("Cannot Enter Note");
		          }
		       
		       bStatus=GeneralFunctions.clickElement(By.id("update"));
		       if(bStatus){
				System.out.println("Click on Update");
		       }	
		       else{
		       	System.out.println("Cannot Click on Update");
		       }
		        try {
		   		Thread.sleep(2000);
		   	} catch (InterruptedException e) {
		   		// TODO Auto-generated catch block
		   		e.printStackTrace();
		   	}

		          //Click on Ok//
		         GeneralFunctions.driver.switchTo().alert().accept();
		       if(bStatus){
		   		System.out.println("Click on Ok");
		          }	
		          else{
		       	   System.out.println("Cannot Click on Ok");
		          }
		       
		       com.alticor.magic.GeneralFunctions.close();
		       
		       //Test Results//
		       if (bStatus) {
		           Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_BusOwnerAttributeLinks");

		       } else {
		           Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_BusOwnerAttributeLinks");
		       }
		     

		 		

		   }
		 }
