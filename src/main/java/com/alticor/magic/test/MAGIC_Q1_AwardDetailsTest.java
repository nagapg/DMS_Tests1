//Expected:Naviagate to  MAGIC Award details Screen//

package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

 public class MAGIC_Q1_AwardDetailsTest {

        /** Declare variables */
    private boolean bStatus=false;
    
    @Before public void setUp() throws Exception {
        Reports.setTestCaseName("MAGIC_Q1_AwardDetailsTest");
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
  
	//Click on Awards//
	bStatus=GeneralFunctions.clickElement(By.linkText("Awards"));
	if(bStatus){
    	System.out.println("Clicked on Awards");
    }	
    else{
    	System.out.println("Cannot Click on Awards");
    }
  
	
	
	
		//Validating the Expected//
	String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id('AwdHistExpand')/x:div[1]"));
		System.out.println("The Award Details Screen is "+ ExpVal);
		
		//Close the browser//
 	  com.alticor.magic.GeneralFunctions.close();
 		
     //Test Reports//
    if (bStatus) {
          Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_AwardDetailsTest");

      } else {
          Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_AwardDetailsTest");
      }

		
}
}


