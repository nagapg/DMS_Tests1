//Expected:Navigate to first time award qualification reports//

package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

 public class MAGIC_Q1_FTAQRptsTest {

	   /** Declare variables */
	    private boolean bStatus=false;
	    
	    @Before public void setUp() throws Exception {
	        Reports.setTestCaseName(" MAGIC_Q1_FTAQRptsTest");
	       bStatus = GeneralFunctions.openIEBrowser("https://magic-gamma/EBS_UI_Web/Magic");
	    if (bStatus) {
	            System.out.println("Navigated to Environment");
	        } else {
	            System.out.println("Cannot navigate to Environment");
	        }
	    }
	  
		    @After public void afterTest() {
		        Reports.endTest();
		    }
		
		  
	@Test
	public void test() {
		
		  //Enter Aff//
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "010");
		if(bStatus){
	    	System.out.println("Passed Aff");
	    }	
	    else{
	    	System.out.println("Cannot Pass Aff");
	    }
		
		//enter Abo//
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "9995");
		if(bStatus){
	    	System.out.println("Passed Abo");
	    }	
	    else{
	    	System.out.println("Cannot Pass Abo");
	    }
		
	   bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"012017");
		if(bStatus){
	    	System.out.println("Passed Period");
	    }	
	    else{
	    	System.out.println("Cannot Pass Period");
	    }
		
		
		bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
		if(bStatus){
	    	System.out.println("Clicked on Submit");
	    }	
	    else{
	    	System.out.println("Cannot Click on Submit");
	    }
	  	
		//Reports//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));
        if(bStatus){
        	System.out.println("Click on Reports");
        }	
        else{
        	System.out.println("Cannot Click on Reports");
        }
   		
      
   	  //Reports-->Qualification Reports//
   			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4']/a[6]/span[1]"));
   	        if(bStatus){
   			System.out.println("Click on Qualification Rpts");
   	        }	
   	        else{
   	        	System.out.println("Cannot Click on Qualification Rpts");
   	        }
   			
   	    
   	        //Reports-->Qualification Reports-->Award Qualification Reports //
   	        bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4_6']/a[1]/span[1]"));   
   	       if(bStatus){
   			System.out.println("Click on Award Qualification Reports");
   	       }	
   	       else{
   	       	System.out.println("Cannot Click on Award Qualification Reports");
   	       }
	  
   	       
   	  //Reports-->Qualification Reports-->Award Qualification Reports-->First Time Award Qual Rpts //
   	        bStatus=GeneralFunctions.clickElement(By.linkText("First Time Award Qualifier Reports"));   
   	       if(bStatus){
   			System.out.println("Click on First Time Award Qual Rpts");
   	       }	
   	       else{
   	       	System.out.println("Cannot Click on First Time Award Qual Rpts");
   	       }
   	       
   	 //Validating the Expected//
   	       String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='searchBoxDiv']/div[1]"));
   		   System.out.println("The Output is:"  +ExpVal);
   		  
   	       com.alticor.magic.GeneralFunctions.close();
	   			
	   			//Test Reports//
	   			if (bStatus) {
	   		            Reports.logResults(LogStatus.PASS, "Test Pass", "FirsttimeRptsTest");

	   		        } else {
	   		            Reports.logResults(LogStatus.FAIL, "Test Fail", "FirsttimeRptsTest");
	   		        }
	   	}
	   	}

	  




