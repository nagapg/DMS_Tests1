//Expected:Navigate to Frontliner Map Screen//

package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


import org.junit.Test;

public class MAGIC_FrontlinerMapTest {
	/** Declare variables */
    private boolean bStatus=false;

    @Before
   	public void setUp() throws Exception {
   		Reports.setTestCaseName("MAGIC_AwardBoard");
   		bStatus=GeneralFunctions.openIEBrowser("https://magic-gamma:9452/EBS_UI_Web/Magic");
   		GeneralFunctions.clickElement(By.id("overridelink"));

   		if(bStatus){
           	System.out.println("Application-Pass");
           }	
           else{
           	System.out.println("Application-Fail");
           }
   		}

   	
   	  @After
         public void tearDown() throws Exception {
   	 Reports.endTest();
   	   }

   	  
   	@Test
	  public void test() {
		  
		GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"),"9995");
	   		if(bStatus){
	           	System.out.println("Abo-Pass");
	           }	
	           else{
	           	System.out.println("Abo-Fail");
	           }
	   	
	   		
	   		bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
	   		if(bStatus){
	           	System.out.println("submit-Pass");
	           }	
	           else{
	           	System.out.println("submit-Fail");
	           }
	   		
	   		bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='IboDashboardMapExpand']/div[5]/a"));
	  	  if (bStatus) {
	            System.out.println("Navigated to Frontliner Map Screen");
	        } else {
	            System.out.println("Cannot Navigate to Frontliner Map Screen");
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
	   if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_AwardBoard");

	        } else {
	            Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_AwardBoard");
	        }
	       }
	  }


	
