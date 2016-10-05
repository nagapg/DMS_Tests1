/* Open IE 11 and navigate to beta
 * Go to Reports-->ABO Reports-->ILB bank File
 *  Test Case1:Validating Business Entity Field
 *  Test Case2:Validating values on Business Entity Field*/

package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class MAGIC_BusinessEntity {
	
	/** Init variables */
	boolean bStatus=false;
	
	@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_BusinessEntity");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Naviated to beta");
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

		//Reports//
			GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));
			if(bStatus){
	        	System.out.println("Clicked on Reports");
	        }	
	        else{
	        	System.out.println("Cannot Click on Reports");
	        }
			
			//Reports-->ABO Reports//
			GeneralFunctions.clickElement(By.xpath("//span[text()='ABO Reports']"));
			if(bStatus){
	        	System.out.println("Clicked on ABO Reports");
	        }	
	        else{
	        	System.out.println("Cannot Click on ABO Reports");
	        }
			
			//Reports-->ABO Reports-->ILB bank File//
			GeneralFunctions.clickElement(By.linkText("ILB Alt Name"));
			if(bStatus){
	        	System.out.println("Clicked on ILB Alt name");
	        }	
	        else{
	        	System.out.println("Cannot Click on ILB Alt name");
	        }
			
			//Test Case1:Validating Business Entity Field//
			bStatus=GeneralFunctions.driver.findElement(By.name("searchInputCol2")).getAttribute("value").isEmpty();
			if(bStatus){
	        	System.out.println("BE Field is Empty");
	        }	
	        else{
	        	System.out.println("BE is not Empty");
	        }
			
			//Test Case2:Validating values on Business Entity Field//
			bStatus=GeneralFunctions.clickElement(By.name("searchButtonCol2"));
			if(bStatus){
	        	System.out.println("BE Drop Down list Visible");
	        }	
	        else{
	        System.out.println("BE Drop Down List not Visible");
	        }
			
			com.alticor.magic.GeneralFunctions.close();
			
			//Test Results//
			if(bStatus){
				Reports.logResults(LogStatus.PASS,"Tests Passed","MAGIC_BusinessEntity");
			}
			else{
				Reports.logResults(LogStatus.FAIL,"Tests Failed","MAGIC_BusinessEntity");
			}
			
		
		   }

		   }





