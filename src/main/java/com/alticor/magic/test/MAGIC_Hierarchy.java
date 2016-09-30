/*Open Chrome and navigate to beta
 * Hierarchy view on  Region Security Screen 
 * Expected 1>Expand/Collapse buttons work
 * Expected 2>Click on any Links*/

package com.alticor.magic.test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.alticor.magic.test.pages.Reports;

import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;

public class MAGIC_Hierarchy {

	/** Init variables */
    private boolean bStatus=false;
    
    
    @BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_Hierarchy");
		bStatus=GeneralFunctions.openChormeBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Navigated to beta");
        }	
        else{
        	System.out.println("Cannot Navigate to beta");
        }
		}

	
	  @AfterMethod
      public void tearDown() throws Exception {
	  Reports.endTest();
	   }
	
	  @Test
	  public void test() {
		  GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"),"010");
	   		if(bStatus){
	           	System.out.println("Entered Aff");
	           }	
	           else{
	           	System.out.println("Cannot Enter Aff");
	           }
	   		
	   	 GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"),"670");
	   		if(bStatus){
	           	System.out.println("Entered Abo");
	           }	
	           else{
	           	System.out.println("Cannot Enter Abo");
	           }
  
	   		bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
	   		if(bStatus){
	           	System.out.println("Clicked submit");
	           }	
	           else{
	           	System.out.println("Cannot click on submit");
	           }
	   		
          //Maintenance//
			
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			if(bStatus){
	        	System.out.println("Clicked on Maintanence");
	        	}	
	        else{
	        	System.out.println("Cannot Click on Maintanence ");
	        }
	   		
	  //Maintenance-->Admin//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Admin']"));
			if(bStatus){
	        	System.out.println("Clicked on Admin");
	        }	
	        else{
	        	System.out.println("Cannot Click on Admin");
	        }
			
			 //Maintenance-->Admin-->Region Security//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Region Security']"));
	        if(bStatus){
			System.out.println("Clicked on Region Security");
	        }	
	        else{
	        	System.out.println("Cannot Click on Region Security");
	        }
			
	        
	      //Maintenance-->Admin-->Region Security-->Region Security//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Region Security"));   
	        if(bStatus){
			System.out.println("Clicked on Region Security");
	        }	
	        else{
	        	System.out.println("Cannot Click on Region Security");
	        }
	        
	        
	        //Validating Hierarchy View//
	         bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='collapsedRegionSecurityScreen']/div/img"));   
	        if(bStatus){
			System.out.println("Clicked on Region Enabled UI Screen");
	        }	
	        else{
	        	System.out.println("Cannot Click on Region Enabled UI Screen");
	        }
	        
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch blsock
				e.printStackTrace();
			}
	        
	        //Validating Expand All//
	        bStatus=GeneralFunctions.clickElement(By.id("expandAll"));   
	        if(bStatus){
			System.out.println("Clicked on Expand All");
	        }	
	        else{
	        	System.out.println("Cannot Click on Expand All");
	        }
	        
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch blsock
				e.printStackTrace();
			}
	        
	        //Click on any link//
	       bStatus=GeneralFunctions.clickElement(By.id("rs_62"));   
	        if(bStatus){
			System.out.println("Clicked on the Link");
	        }	
	        else{
	        	System.out.println("Cannot Click on the Link");
	        }
	        
	      
	        
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        //validating Collapse all//
	        bStatus=GeneralFunctions.clickElement(By.id("collapseAll"));   
	        if(bStatus){
			System.out.println("Clicked on Collapse All");
	        }	
	        else{
	        	System.out.println("Cannot Click on Collapse All");
	        }
	        
	        
			//GeneralFunctions.close();//
	        com.alticor.magic.GeneralFunctions.close();
			
			//Test Results//
			 if (bStatus) {
		            Reports.logResults(LogStatus.PASS, "Test Pass", "MAGIC_Hierarchy");

		        } else {
		            Reports.logResults(LogStatus.FAIL, "Test Fail", "MAGIC_Hierarchy");
		        }
	  
	  }
	  }
