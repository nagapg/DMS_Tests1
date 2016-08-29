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

public class MAGIC_TransmitToRMS {

	/** Init variables */
    boolean bStatus=false;
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_TransmitToRMS");
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
		  GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "010");
			if(bStatus){
	        	System.out.println("Aff-Pass");
	        }	
	        else{
	        	System.out.println("Aff-Fail");
	        }
			
	     

			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"082015");
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

			
			 //Processing//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[3]"));
			if(bStatus){
	        	System.out.println("Processing-Pass");
	        }	
	        else{
	        	System.out.println("Processing-Fail");
	        }
			
			//Processing-->Month Processing//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Month Processing']"));
			if(bStatus){
	        	System.out.println("Month Processing-Pass");
	        }	
	        else{
	        	System.out.println("Month Processing-Fail");
	        }
			
			//Processing-->Month Processing-->Transmit To RMS//
			bStatus=GeneralFunctions.clickElement(By.linkText("Transmit to RMS"));
	        if(bStatus){
			System.out.println("Transmit To RMS-Pass");
	        }	
	        else{
	        	System.out.println("Transmit To RMS-Fail");
	        }
		
	        
	        //Click the check box//

			bStatus=GeneralFunctions.clickElement(By.id("rowSelectedIN3"));
	        if(bStatus){
			System.out.println("Checkbox Click-Pass");
	        }	
	        else{
	        	System.out.println("Checkbox Click-Fail");
	        }
	        
	        
          //Wait//
	        
	        try {
	    		Thread.sleep(9000);
	    	} catch (InterruptedException e) {
	    		// TODO Auto-generated catch block
	    		e.printStackTrace();
	    	}
	        
	        //Check the visibility//
	        bStatus=GeneralFunctions.verifyVisibilityOFElement(By.id("faaCheckedIN3"));
	        if(bStatus){
			System.out.println("FAA Checkbox Visible-Pass");
	        }	
	        else{
	        	System.out.println("FAA Checkbox Visible-Fail");
	        }
	        
	        
	       //Check the second check box//
	        bStatus=GeneralFunctions.verifyVisibilityOFElement(By.id("intCheckedIN3"));
	        if(bStatus){
			System.out.println("INT Checkbox Click-Pass");
	        }	
	        else{
	        	System.out.println("INT Checkbox Click-Fail");
	        }
	        
	       
	        
	        if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_TransmitToRMS");

	        } else {
	            Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_TransmitToRMS");
	        }
	        com.alticor.magic.GeneralFunctions.close();

	  		

	    }
	  }
