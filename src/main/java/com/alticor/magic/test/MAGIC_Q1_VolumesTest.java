//Expected:Navigate to  MAGIC Volumes Screen//

package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

 public class MAGIC_Q1_VolumesTest {

	 /** Declare variables */
	    private boolean bStatus=false;
	    
	    @Before public void setUp() throws Exception {
	        Reports.setTestCaseName("MAGIC_Q1_VolumesTest ");
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
	  	
		//click on Dash board//
		  bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]/text"));
		  if (bStatus) {
	          System.out.println("Navigated to Dashboard");
	      } else {
	          System.out.println("Cannot Navigate to Dashboard");
	      }
		  
		//click on Volumes link//
			  bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='collapsibleQuickGlanceContent']/div[3]/a[2]"));
			  if (bStatus) {
		          System.out.println("Navigated to Volumes");
		      } 
			  else {
		          System.out.println("Cannot Navigate to Volumes");
		      }

			  
			  //Validating the Expected//
		       String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='IboBonusDtlBar']"));
			   System.out.println("The Output is:"  +ExpVal);
			  

		com.alticor.magic.GeneralFunctions.close();

			
			//Reports//
	          if (bStatus) {
		            Reports.logResults(LogStatus.PASS, "Test Pass", "VolumesTest");
               } 
			 else {
		            Reports.logResults(LogStatus.FAIL, "Test Fail", "VolumesTest");
		        } 
		   
	}
	}

		  
