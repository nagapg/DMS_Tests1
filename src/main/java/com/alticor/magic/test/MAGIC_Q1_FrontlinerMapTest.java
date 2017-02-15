//Expected:Display MAGIC Frontliner Map Screen//

package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class MAGIC_Q1_FrontlinerMapTest {

	/** Declare variables */
    private boolean bStatus=false;
    
    @Before public void setUp() throws Exception {
        Reports.setTestCaseName("MAGIC_Q1_FrontlinerMapTest");
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
 		
      //Inquiry-->Map//
      bStatus=GeneralFunctions.clickElement(By.linkText("Map"));
	        if(bStatus){
			System.out.println("Click on Map");
	        }	
	        else{
	        	System.out.println("Cannot Click on Map");
	        }
			
	
		
//Validating the Expected//
	  	  bStatus =GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='LosMapExpand']/div"));
	  	  try {
	  			Thread.sleep(3000);
	  		} catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	  	  if (bStatus) {
	            System.out.println("Expected:Frontliner Map Screen displayed");
	        } else {
	            System.out.println("Actual:Cannot display Frontliner Map Screen");
	        }
	
	
	  	com.alticor.magic.GeneralFunctions.close();
	  	
	   	//Test Reports//
	        if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Passed", "FrontlinerMapTest");

	        } else {
	            Reports.logResults(LogStatus.FAIL, "Test Failed", "FrontlinerMapTest");
	        }
	  	  
	       }
	  }
