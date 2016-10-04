/* Class to validate the SSL Certificate on Alpha MAGIC
 * Step 1>Open IE 11 and navigate to Alpha
 * Step 2>SSL Certificate page should come 
 * Step 3>When clicked on continue should navigate to Alpha  homepage 
 * Step 4>Enter Aff,Abo and click on Enter*/
package com.alticor.magic.test;
import org.testng.annotations.Test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.alticor.magic.test.pages.Reports;

import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;
public class SampleSSLCertificate {
	
	
	/** Init variables */
	  boolean bStatus=false;
	  
	  @BeforeMethod
		public void setUp() throws Exception {
			Reports.setTestCaseName("MAGIC_SSLCertificate");
			//bStatus=GeneralFunctions.openIEBrowser("https://magic-alpha:9443/EBS_UI_Web/Magic");//
			bStatus=GeneralFunctions.openIEBrowser("https://magic-gamma:9452/EBS_UI_Web/Magic");
			if(bStatus){
		      	System.out.println("Navigation started");
		      }	
		      else{
		      	System.out.println("Cannot Navigate");
		      }
			
			bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.id("overridelink"));
			if(bStatus){
		      	System.out.println("Clicked on SSL Certificate");
		      }	
		      else{
		      	System.out.println("Cannot Click on SSL Certificate");
		      }
			
      try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch blsock
			e.printStackTrace();
		}
		
			}
	  
	  @AfterMethod
	  public void tearDown() throws Exception {
	  Reports.endTest();
	   }
	  
	  @Test
	  public void test() {
			bStatus= GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "170");
			if(bStatus){
	        	System.out.println("Entered Aff");
	        }	
	        else{
	        	System.out.println("Cannot Enter Aff");
	        }
			
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "1707163545");
			if(bStatus){
	        	System.out.println("Entered Abo");
	        }	
	        else{
	        	System.out.println("Cannot Enter Abo");
	        }
			
			bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Clicked on Submit");
	        }	
	        else{
	        	System.out.println("Cannot Click on Submit");
	        }
		
			 com.alticor.magic.GeneralFunctions.close();

}
}

