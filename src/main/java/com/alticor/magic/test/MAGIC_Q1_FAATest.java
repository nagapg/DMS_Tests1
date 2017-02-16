//Expected:Navigate to  MAGIC FAA Screen//

package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class MAGIC_Q1_FAATest {  
	
	  /** Declare variables */
    private boolean bStatus=false;
    
    @Before public void setUp() throws Exception {
        Reports.setTestCaseName("MAGIC_Q1_FAATest");
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
  
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	//Inquiry//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
     if(bStatus){
     	System.out.println("Click on Inquiry");
     }	
     else{
     	System.out.println("Cannot Click on Inquiry");
     }
		
	  //Inquiry-->Annuals//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[2]"));
	        if(bStatus){
			System.out.println("Click on Annuals");
	        }	
	        else{
	        	System.out.println("Cannot Click on Annuals");
	        }
			
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        //Inquiry-->Awards-->FAA//
	        bStatus=GeneralFunctions.clickElement(By.linkText("FAA"));   
	       if(bStatus){
			System.out.println("Click on FAA");
	       }	
	       else{
	       	System.out.println("Cannot Click on FAA");
	       }
	  
	       try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	    //Validating the Expected//
	       String ExpVal=GeneralFunctions.getTitle(By.xpath("//*[@id='faaDiv']/div"));
		   System.out.println("The Output is:"  +ExpVal);
		  
	 com.alticor.magic.GeneralFunctions.close();
	   			
	   			//Test Reports//
	   			if (bStatus) {
	   		            Reports.logResults(LogStatus.PASS, "Test Pass", "FAATest");

	   		        } else {
	   		            Reports.logResults(LogStatus.FAIL, "Test Fail", "FAATest");
	   		        }
	   	}
	   	}
