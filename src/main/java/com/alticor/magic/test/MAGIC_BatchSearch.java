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

public class MAGIC_BatchSearch {

	/** Init variables */
    boolean bStatus=false;
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_BatchSearch");
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
			//Processing//
			bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[3]"));
	        if(bStatus){
	        	System.out.println("Processing-Pass");
	        }	
	        else{
	        	System.out.println("Processing-Fail");
	        }
	   		
	   	  //Processing-->Batch Processing//
	   			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Batch Processing']"));
	   	        if(bStatus){
	   			System.out.println("Batch Processing-Pass");
	   	        }	
	   	        else{
	   	        	System.out.println("Batch Processing-Fail");
	   	        }
	   			
	   	        //Processing-->Batch Processing-->Batch Search//
	   	        bStatus=GeneralFunctions.clickElement(By.linkText("Batch Search"));   
	   	       if(bStatus){
	   			System.out.println("Batch Search-Pass");
	   	       }	
	   	       else{
	   	       	System.out.println("Batch Search-Fail");
	   	       }
	   	       
	   	     
	   	       
	   		 
	   	    bStatus=GeneralFunctions.enterTextToElement(By.name("searchBatchNumber"), "18848");
	   			if(bStatus){
	   	        	System.out.println("Enter Batch Number-Pass");
	   	        }	
	   	        else{
	   	        	System.out.println("Enter Batch Number-Fail");
	   	        }
	   			
	   			bStatus=GeneralFunctions.clickElement(By.id("viewButton"));
	   			if(bStatus){
	   	        	System.out.println("Submit-Pass");
	   	        }	
	   	        else{
	   	        	System.out.println("Submit-Fail");
	   	        }
	   			
	   			
	   		  // bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='viewTableDiv']/table/tbody/tr[2]/td[2]/a/span/b"));//s
	   			//bStatus=GeneralFunctions.clickElement(By.linkText("18848"));//
	   			
	   			bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.linkText("18848"));
	   			if(bStatus){
	   			System.out.println("Orange Link Click-Pass");
	   	       }	
	   	       else{
	   	       	System.out.println("Orange Link Click-Fail");
	   	       }
	   			
	   			
	   		 try {
	 			Thread.sleep(6000);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	   	
	   		 
	   	  // bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Back to Batch Search screen']"));//
	   		bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath("//img[@tip='Back to Batch Search screen']"));
	   		 if(bStatus){
			System.out.println("Back Button-Pass");
	       }	
	       else{
	       	System.out.println("Back Button-Fail");
	       }
	   		 
	   		 
	   		 try {
	  			Thread.sleep(6000);
	  		} catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	    	
	   		 
	   		 if (bStatus) {
	             Reports.logResults(LogStatus.PASS, "Test Passed", " MAGIC_BatchSearch");

	         } else {
	             Reports.logResults(LogStatus.FAIL, "Test Failed", " MAGIC_BatchSearch");
	         }
	         com.alticor.magic.GeneralFunctions.close();

	   		

	     }
	   }
