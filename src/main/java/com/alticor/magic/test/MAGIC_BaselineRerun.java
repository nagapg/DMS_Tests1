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


public class MAGIC_BaselineRerun {

	/** Init variables */
	final private String sSuccessValidationMsg="GIP Baseline Recalcs triggered Successfully, Will be Notified via Email when it’s Processed.";
	private boolean bStatus=false;
	 
	
	@BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_BaselineRerun");
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
		  GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "430");
			if(bStatus){
	        	System.out.println("Aff-Pass");
	        }	
	        else{
	        	System.out.println("Aff-Fail");
	        }
			
	     
			GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "225");
			if(bStatus){
	        	System.out.println("Abo-Pass");
	        }	
	        else{
	        	System.out.println("Abo-Fail");
	        }

			
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"082016");
			if(bStatus){
	        	System.out.println("Period-Pass");
	        }	
	        else{
	        	System.out.println("Period-Fail");
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
	        	System.out.println("Maintanence-Pass");
	        }	
	        else{
	        	System.out.println("Maintanence-Fail");
	        }
			
			//Maintenance-->GIP//
			bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='SubMenu2']/a[14]/span[1]"));
			if(bStatus){
	        	System.out.println("GIP-Pass");
	        }	
	        else{
	        	System.out.println("GIP-Fail");
	        }
			
			
			
	        //Maintenance-->GIP-->Baseline Rerun//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Baseline Rerun"));   
	       if(bStatus){
			System.out.println("Baseline Rerun-Pass");
	       }	
	       else{
	       	System.out.println("Baseline Rerun-Fail");
	       }
	       
	    
	       GeneralFunctions.enterTextToElement(By.id("effPerfYear"), "2016");
			if(bStatus){
	        	System.out.println("Enter Eff PY-Pass");
	        }	
	        else{
	        	System.out.println("Enter Eff PY-Fail");
	        }

			
			bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.id("userInfoDiv"));
			if(bStatus){
	        	System.out.println("Drop down selection-Pass");
	        }	
	        else{
	        System.out.println("Drop down selection-Fail");
	        }
			
			
			bStatus=GeneralFunctions.verifyVisibilityOFElement(By.linkText("APIND"));
			if(bStatus){
	        	System.out.println("APIND Visible-Pass");
	        }	
	        else{
	        System.out.println("APIND Visible-Fail");
	        }
			
			
			bStatus=GeneralFunctions.clickElement(By.id("rerunBaselineButton"));
			if(bStatus){
	        	System.out.println("Submit Rerun-Pass");
	        }	
	        else{
	        System.out.println("Submit Rerun-Fail");
	        }
		 
			
			
			bStatus= GeneralFunctions.getText(By.id("successMsgDiv")).equalsIgnoreCase(sSuccessValidationMsg);;
		       if(bStatus){
				System.out.println("Rerun-Pass");
		       }	
		       else{
		       	System.out.println("Rerun-Pass");
		       }
		       
		       if (bStatus) {
		           Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_BaselineRerun");

		       } else {
		           Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_BaselineRerun");
		       }
		       com.alticor.magic.GeneralFunctions.close();

		 		

		   }
		 }


