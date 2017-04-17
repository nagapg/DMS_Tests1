package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.alticor.prowl.AmwayProwlRunner;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

 public class MA9732_Q2Test {
	
	 /** Declare variables */
   private boolean bStatus=false;
   
   @Before public void setUp() throws Exception {
       Reports.setTestCaseName("MA9732_Q2Test");
       
       //Open Browser Navigate to Gamma//
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
	
	  //Enter Aff:430//
	  bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"430");
	  if (bStatus) {
   System.out.println("AFF entered");
   } else {
   System.out.println("Cannot enter AFF");
  }
	  
	//Enter Abo:46//
	bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"46");
	  if (bStatus) {
     System.out.println("ABO entered");
     } else {
     System.out.println("Cannot enter ABO");
    }
	  
 //Enter Period:042017//
 bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"042017");
		if(bStatus){
     	System.out.println("Entered Period");
     }	
     else{
     	System.out.println("Cannot Enter Period");
     }

   //Click on submit//
		  bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
		  if (bStatus) {
	        System.out.println("Click on Submit");
	    } else {
	        System.out.println("Cannot click on submit");
	    }
		  
	 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//Maintenance//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[3]"));
		if(bStatus){
    	System.out.println("Click on Maintanence");
    }	
    else{
    	System.out.println("Cannot Click on Maintanence");
    }
		
		//Maintenance-->GIP//
		bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='SubMenu2']/a[14]/span[1]"));
		if(bStatus){
    	System.out.println("Click on GIP");
    }	
    else{
    	System.out.println("Cannot Click on GIP");
    }
		
	  //Maintenance-->GIP-->Baseline Rerun//
    bStatus=GeneralFunctions.clickElement(By.linkText("Baseline Rerun"));   
   if(bStatus){
		System.out.println("Click on Baseline Rerun");
   }	
   else{
   	System.out.println("Cannot Click on Baseline Rerun");
   }
   

   bStatus=GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='effPerfYear']"),"2016");
if(bStatus){
	System.out.println("Enter Eff PY");
}	
else{
	System.out.println("Cannot Enter Eff PY");
}


bStatus=GeneralFunctions.clickElement(By.id("rerunBaselineButton"));
if(bStatus){
	System.out.println("Click on Submit Rerun");
}	
else{
System.out.println("Cannot Click on Submit Rerun");
}
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//Capture the Result1//
String ExpVal2=GeneralFunctions.getText(By.xpath(".//*[@id='successMsgDiv']"));
 System.out.println("The Output is:"  +ExpVal2);

com.alticor.magic.GeneralFunctions.close();
	
 //Test Reports//
if (bStatus) {
      Reports.logResults(LogStatus.PASS, "Test Passed", "MA9732_Q2Test");
} else {
      Reports.logResults(LogStatus.FAIL, "Test Failed", "MA9732_Q2Test");
  }
}
}


