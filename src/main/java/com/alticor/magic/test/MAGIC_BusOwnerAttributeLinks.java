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


public class MAGIC_BusOwnerAttributeLinks {

	/** Init variables */
    private boolean bStatus=false;
    final private String sSuccessValidationMsg="Validation Was Successful";	//successMessage
    final private String sTranscSuccessMsg="Transaction Successfully Submitted";
	final private String sExpNote="Test Note";
	

	@BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_BusOwnerAttributeLinks");
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
		  GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "9995");
			if(bStatus){
	        	System.out.println("Abo-Pass");
	        }	
	        else{
	        	System.out.println("Abo-Fail");
	        }

			
				bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Submit-Pass");
	        }	
	        else{
	        	System.out.println("Submit-Fail");
	        }
			
	       
			//Maintenance//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			if(bStatus){
	        	System.out.println("Maintanence Click-Pass");
	        	}	
	        else{
	        	System.out.println("Maintanence Click-Fail");
	        }
			
			//Maintenance-->LOS//
			
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='LOS']"));
			if(bStatus){
	        	System.out.println("LOS Click-Pass");
	        }	
	        else{
	        	System.out.println("LOS Click-Fail");
	        }
			
			//Maintenance-->LOS-->Bus Owner Attribute Links//
			bStatus=GeneralFunctions.clickElement(By.linkText("Bus Owner Attribute Links"));   
		       if(bStatus){
				System.out.println("Bus Owner Attribute Click-Pass");
		       }	
		       else{
		       	System.out.println("Bus Owner Attribute Click-Fail");
		       }
			
	        
	           //Enter Reason code//
		       bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
		       if(bStatus){
				System.out.println("Reason code-Pass");
		       }	
		       else{
		       	System.out.println("Reason code-Fail");
		       }
		        
		       
		      bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
		       if(bStatus){
		   		System.out.println("Note Selected-Pass");
		          }	
		          else{
		          	System.out.println("Note Selected-Fail");
		          }
		       
		       
		      bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
		       if(bStatus){
		   		System.out.println("Note enter-Pass");
		          }	
		          else{
		          	System.out.println("Note enter-Fail");
		          }
		       
		       bStatus=GeneralFunctions.clickElement(By.id("update"));
		       if(bStatus){
				System.out.println("Update-Pass");
		       }	
		       else{
		       	System.out.println("Update-Fail");
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
		   		System.out.println("Ok-Pass");
		          }	
		          else{
		       	   System.out.println("Ok-Fail");
		          }
		       
		       if (bStatus) {
		           Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_BusOwnerAttributeLinks");

		       } else {
		           Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_BusOwnerAttributeLinks");
		       }
		       com.alticor.magic.GeneralFunctions.close();

		 		

		   }
		 }
