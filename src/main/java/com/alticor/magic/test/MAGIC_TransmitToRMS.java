package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.test.pages.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class MAGIC_TransmitToRMS {

	/** Init variables */
    boolean bStatus=false;
	
	
	@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_TransmitToRMS");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Navigated to beta");
        }	
        else{
        	System.out.println("Cannot Navigate to beta");
        }
		}

	
	  @After
      public void tearDown() throws Exception {
		  Reports.endTest();
	   }
	
	  @Test
	  public void test() {
		  GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "010");
			if(bStatus){
	        	System.out.println("Entered Aff");
	        }	
	        else{
	        	System.out.println("Cannot Enter Aff");
	        }
			
	     

			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"082015");
			if(bStatus){
	        	System.out.println("Enter Period");
	        }	
	        else{
	        	System.out.println("Cannot Enter Period");
	        }
			
			
			bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("click on Submit");
	        }	
	        else{
	        	System.out.println("Cannot click on Submit");
	        }

			
			 //Processing//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[3]"));
			if(bStatus){
	        	System.out.println("click on Processing");
	        }	
	        else{
	        	System.out.println("Cannot click on Processing");
	        }
			
			//Processing-->Month Processing//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Month Processing']"));
			if(bStatus){
	        	System.out.println("click on Month Processing");
	        }	
	        else{
	        	System.out.println("Cannot click on Month Processing");
	        }
			
			//Processing-->Month Processing-->Transmit To RMS//
			bStatus=GeneralFunctions.clickElement(By.linkText("Transmit to RMS"));
	        if(bStatus){
			System.out.println("click on Transmit To RMS");
	        }	
	        else{
	        	System.out.println("Cannot click on Transmit To RMS");
	        }
		
	        
	        //Click the check box//

			bStatus=GeneralFunctions.clickElement(By.id("rowSelectedIN3"));
	        if(bStatus){
			System.out.println("click on Checkbox");
	        }	
	        else{
	        	System.out.println("Cannot click on Checkbox ");
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
	        
	        com.alticor.magic.GeneralFunctions.close();
	        
	    if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_TransmitToRMS");

	        } else {
	            Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_TransmitToRMS");
	        }
	      

	  		

	    }
	  }
