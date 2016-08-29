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

public class MAGIC_ILBAddress {

	/** Init variables */
    boolean bStatus=false;
    final private String sExpNote="Test Note";
	
	@BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_ILBAddress");
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
		//Enter values//
			 GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "9995");
			if(bStatus){
	        	System.out.println("Abo-Pass");
	        }	
	        else{
	        	System.out.println("Abo-Fail");
	        }
			
			//Click on submit//
		   bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Submit-Pass");
	        }	
	        else{
	        	System.out.println("Submit-Fail");
	        }
			
	        //Maintenance//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			if(bStatus){
	        	System.out.println("Maintanence Click-Pass");
	        	}	
	        else{
	        	System.out.println("Maintanence Click-Fail");
	        }
			
			
			//Maintenance-->Alternate ILB Add//
			bStatus=GeneralFunctions.clickElement(By.linkText("Alternate ILB Address"));   
		       if(bStatus){
				System.out.println("Alt ILB Add Click-Pass");
		       }	
		       else{
		       	System.out.println("Alt ILB Add Click-Fail");
		       }
		       
		       	//Enter Name//
		       	bStatus=GeneralFunctions.enterTextToElement(By.id("nameOne"),  "Tester");
		        if(bStatus){
		    		System.out.println("Enter Name-Pass");
		           }	
		           else{
		           	System.out.println("Enter Name-Fail");
		           }
		        
		        //Enter Note//
		        bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
		        if(bStatus){
		 		System.out.println("Reason Code Select to enter the note-Pass");
		        }	
		        else{
		        	System.out.println("Reason Code Select to enter the note-Fail");
		        }
		         
		        
		       bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
		        if(bStatus){
		    		System.out.println("Note Select-Pass");
		           }	
		           else{
		           	System.out.println("Note Select-Fail");
		           }
		        
		        
		       bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
		        if(bStatus){
		    		System.out.println("Note Enter-Pass");
		           }	
		           else{
		           	System.out.println("Note Enter-Fail");
		           }
		        
		        
		        //Save the note//
		        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
		        if(bStatus){
		    		System.out.println("Save-Pass");
		           }	
		           else{
		           	System.out.println("Save-Fail");
		           }
		        

		        
		        bStatus=GeneralFunctions.clickElement(By.id("submitButton"));
		        if(bStatus){
		    		System.out.println("Submit-Pass");
		           }	
		           else{
		           	System.out.println("Submit-Fail");
		           }
		        
		        
		        //Delete the note//
		        bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
		        if(bStatus){
		 		System.out.println("Reason Code to delete the note-Pass");
		        }	
		        else{
		        	System.out.println("Reason Code to delete the note-Fail");
		        }
		         
		        
		       bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
		        if(bStatus){
		    		System.out.println("Note Select-Pass");
		           }	
		           else{
		           	System.out.println("Note Select-Fail");
		           }
		        
		        
		       bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
		        if(bStatus){
		    		System.out.println("Note Enter-Pass");
		           }	
		           else{
		           	System.out.println("Note Enter-Fail");
		           }
		        
		        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
		        if(bStatus){
		    		System.out.println("Save to delete the note-Pass");
		           }	
		           else{
		           	System.out.println("Save to delete the note-Fail");
		           }
		        
		        
		        bStatus=GeneralFunctions.clickElement(By.id("deleteButton"));
		        if(bStatus){
		    		System.out.println("Delete button-Pass");
		           }	
		           else{
		           	System.out.println("Delete button-Fail");
		           }
		        
		        //Confirm the delete//
		        GeneralFunctions.driver.switchTo().alert().accept();
		        if(bStatus){
		    		System.out.println("Note Deleted-Pass");
		           }	
		           else{
		        	   System.out.println("Note Deleted-Fail");
		           }
		        
		        
		        if (bStatus) {
		            Reports.logResults(LogStatus.PASS, "Test Pass", "MAGIC_ILBAddress");

		        } else {
		            Reports.logResults(LogStatus.FAIL, "Test Fail", "MAGIC_ILBAddress");
		        }
		        
		        
		        com.alticor.magic.GeneralFunctions.close();
		    }       
		       }
		 





