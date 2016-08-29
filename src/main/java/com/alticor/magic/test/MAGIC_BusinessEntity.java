package com.alticor.magic.test;
import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.alticor.magic.test.pages.Reports;

import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;

public class MAGIC_BusinessEntity {
	
	/** Init variables */
	boolean bStatus=false;
	
	@BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_BusinessEntity");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Application-Pass");
        }	
        else{
        	System.out.println("Application-Fail");
        }
		}

	
	  @AfterMethod
      public void tearDown() throws Exception {
	  Reports.endTest();
	   }
	  
	
	  @Test
	  public void test() {

		//Reports//
			GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));
			if(bStatus){
	        	System.out.println("Reports click-Pass");
	        }	
	        else{
	        	System.out.println("Reports Click-Fail");
	        }
			
			//Reports-->ABO Reports//
			GeneralFunctions.clickElement(By.xpath("//span[text()='ABO Reports']"));
			if(bStatus){
	        	System.out.println("ABO Reports-Pass");
	        }	
	        else{
	        	System.out.println("ABO Reports-Fail");
	        }
			
			//Reports-->ABO Reports-->ILB bank File//
			GeneralFunctions.clickElement(By.linkText("ILB Alt Name"));
			if(bStatus){
	        	System.out.println("ILB Alt name click-Pass");
	        }	
	        else{
	        	System.out.println("ILB bAlt name Click-Fail");
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
			
		
			if(bStatus){
				Reports.logResults(LogStatus.PASS,"Tests Passed","MAGIC_BusinessEntity");
			}
			else{
				Reports.logResults(LogStatus.FAIL,"Tests Failed","MAGIC_BusinessEntity");
			}
			
			com.alticor.magic.GeneralFunctions.close();
		   }

		   }


