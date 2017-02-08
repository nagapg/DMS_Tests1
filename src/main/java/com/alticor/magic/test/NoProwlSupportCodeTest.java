package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class NoProwlSupportCodeTest {

	/** Declare variables */
	boolean bStatus;
	
	    @Before public void setUp() throws Exception {
        Reports.setTestCaseName("MAGIC_NoProwlCodeTest");
       bStatus = GeneralFunctions.openIEBrowser("https://magic-gamma/EBS_UI_Web/Magic");
     // GeneralFunctions.clickElement(By.id("overridelink"));//
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
	
   bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"072016");
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
  
  
  
	 //Click on Payment Inquiry//
	bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[3]"));
			if(bStatus){
	        	System.out.println("Clicked on Payment Inquiry");
	        }	
	        else{
	        	System.out.println("Cannot Click on Payment Inquiry");
	        }
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Payment Inquiry-->Invoice Inquiry//
			bStatus=GeneralFunctions.clickElement(By.linkText("Invoice Inquiry"));
			if(bStatus){
	        	System.out.println("Click on Invoice Inquiry");
	        }	
	        else{
	        	System.out.println("Cannot Click on Invoice Inquiry");
	        }
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='invoiceABODataTable']/tbody/tr[2]/td[10]/span/b"));
			if(bStatus){
	        	System.out.println("Clicked on Orange Link");
	        }	
	        else{
	        	System.out.println("Cannot Click on Orange Link click");
	        }
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Validating the Expected//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='viewTableDiv']/table/tbody/tr[2]/td[4]/span/b"));
			if(bStatus){
	        	System.out.println("Amount Details are displayed");
	        }	
	        else{
	        	System.out.println("Cannot display Amount Details");
	        }
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        //Capture the screen//
			bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='div0']/table/tbody/tr[2]/td[1]/div/table/tbody/tr[1]/td[2]"));
				if(bStatus){
				System.out.println("Values present");
     }
      else{
     System.out.println("Values not present");
    }
			
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Close the Screen//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='div0']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/img"));
			if(bStatus){
	        	System.out.println("Close the Screen");
	        }	
	        else{
	        	System.out.println("Cannot Close the Screen");
	        }

			bStatus=GeneralFunctions.clickElement(By.name("viewButton"));
			if(bStatus){
	        	System.out.println("Clicked on Back Button ");
	        }	
	        else{
	        	System.out.println("Cannot Click on Back Button");
	        }
			
			 com.alticor.magic.GeneralFunctions.close();
			 
			
			//Test Results// 
			if (bStatus) {
		          Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_MissingDetails");

		      } else {
		          Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_MissingDetails");
		      }
		     

}
}
