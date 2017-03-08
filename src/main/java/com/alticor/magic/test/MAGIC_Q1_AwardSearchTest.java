//Expected:Navigate to  MAGIC Award search Screen//
package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

 public class MAGIC_Q1_AwardSearchTest {

 /** Declare variables */
	private boolean bStatus=false;
	    
	    @Before public void setUp() throws Exception {
	        Reports.setTestCaseName("MAGIC_Q1_AwardSearchTest");
	        //Open Browser and navigate to Gamma//
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
		
		//Enter Aff:010//
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
		  if (bStatus) {
	    System.out.println("AFF entered");
	     } else {
	    System.out.println("Cannot enter AFF");
	     }
		  
		//Enter Abo:9995//
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"9995");
		  if (bStatus) {
	      System.out.println("ABO entered");
	  } else {
	      System.out.println("Cannot enter ABO");
	  }
		  
		  //Enter Period:022017//
		  bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"022017");
			if(bStatus){
	      	System.out.println("Entered Period");
	      }	
	      else{
	      	System.out.println("Cannot Enter Period");
	      }

	      //Click on Submit//
			  bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
			  if (bStatus) {
		        System.out.println("click on Submit");
		    } else {
		        System.out.println("Cannot click on submit");
		    }
			  
			   //Inquiry//
		bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[2]"));
			//bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));//
	        if(bStatus){
	        	System.out.println("Click on Inquiry");
	        }	
	        else{
	        	System.out.println("Cannot Click on Inquiry");
	        }
	   	
		   		
		   	       //Inquiry-->Awards//
		         //  bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[1]/span[1]"));//
		 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[3]/span[1]"));
		   	        if(bStatus){
		   			System.out.println("Click on Awards");
		   	        }	
		   	        else{
		   	        	System.out.println("Cannot Click on Awards");
		   	        }
		   				
		   	        //Inquiry-->Awards-->Award Search//
		   	        bStatus=GeneralFunctions.clickElement(By.linkText("Award Search"));   
		   	       if(bStatus){
		   			System.out.println("Click on Award Search");
		   	       }	
		   	       else{
		   	       	System.out.println("Cannot Click on Award Search");
		   	       }
			  
		   	    //Validating the Expected//
		   	       String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='searchBoxDiv']/div[1]"));
		   		   System.out.println("The Output is:"  +ExpVal);
		   		  
		   		  
             com.alticor.magic.GeneralFunctions.close();
	   			
	   			//Test Reports//
	   			if (bStatus) {
	   		            Reports.logResults(LogStatus.PASS, "Test Pass","AwardSearchTest");

	   		        } else {
	   		            Reports.logResults(LogStatus.FAIL, "Test Fail","AwardSearchTest");
	   		        }
	   	}
	   	}

	  






