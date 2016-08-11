/* Users will be able to see notes that are added in MAGIC. We do not expect to see blank records when notes have been added to MAGIC.  */
package alticor.magic.test;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import alticor.magic.pages.Reports;

import com.alticor.magic.GeneralFunctions;
import com.relevantcodes.extentreports.LogStatus;
public class UserNotes_alternateILBAddress {
	
	//Initialization//
	 private boolean bStatus=false;
	 final private String sExpNote="Test Note";
	 
	 @Before
		public void setUp() throws Exception {
	    	alticor.magic.pages.Reports.setTestCaseName("Notes for alternate ILB");
	    	
	    	//Open IE 11 and launch the application//
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
			if(bStatus){
	        	System.out.println("browser launch-Pass");
	        }	
	        else{
	        	System.out.println("browser Launch-Fail");
	        }
		}
		
	 
	 @After
	 public void tearDown() throws Exception {
		 alticor.magic.pages.Reports.endTest();
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
	        
	        //Reporting//
	        if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Pass", "Notes entered on altILB");

	        } else {
	            Reports.logResults(LogStatus.FAIL, "Test Fail", "Notes not entered on altILB");
	        }
	        
	        //close the browser//
	        com.alticor.magic.GeneralFunctions.close();
	    }       
	       }
	 


