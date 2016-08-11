
/* Users will be able to see notes that are added in MAGIC. We do not expect to see blank records when notes have been added to MAGIC.  */
package alticor.magic.test;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import com.alticor.magic.GeneralFunctions;
import com.relevantcodes.extentreports.LogStatus;

public class UserNotes_AwardBoard {
	
	/** Init variables */
    private boolean bStatus=false;
    final private String sExpNote="Test Note";
    
    @Before
	public void setUp() throws Exception {
    	alticor.magic.pages.Reports.setTestCaseName("Notes for Award Board");
    	
    	//Open IE 11 and Launch the application//
	bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Application Launch-Pass");
        }	
        else{
        	System.out.println("Application Launch-Fail");
        }
	}
	
    @After
	 public void tearDown() throws Exception {
		 alticor.magic.pages.Reports.endTest();
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
   		
           
		
        //Maintenance//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
		if(bStatus){
        	System.out.println("Maintanence Click-Pass");
        	}	
        else{
        	System.out.println("Maintanence click-Fail");
        }
		
		//Maintenance-->Award Board//
		bStatus=GeneralFunctions.clickElement(By.linkText("Award Board"));   
	       if(bStatus){
			System.out.println("Award Board Click-Pass");
	       }	
	       else{
	       	System.out.println("Award Board Click-Fail");
	       }
	       
	       
	       bStatus=GeneralFunctions.enterTextToElement(By.id("commonName"),  "Tester");
	        if(bStatus){
	    		System.out.println("Input Value-Pass");
	           }	
	           else{
	           	System.out.println("Input Value-Fail");
	           }
	       
	        
	        bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
	        if(bStatus){
	 		System.out.println("Reason Code Select-Pass");
	        }	
	        else{
	        	System.out.println("Reason Code Select-Fail");
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
	    		System.out.println("Enter Note-Pass");
	           }	
	           else{
	           	System.out.println("Enter Note-Fail");
	           }
	        
	        
	        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
	        if(bStatus){
	    		System.out.println("Save-Pass");
	           }	
	           else{
	           	System.out.println("Save-Fail");
	           }
	        
	        
	        
	        bStatus=GeneralFunctions.clickElement(By.id("addButton"));
	        if(bStatus){
	    		System.out.println("add-Pass");
	           }	
	           else{
	           	System.out.println("add-Fail");
	           }
	        
	        
	        bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
	        if(bStatus){
	 		System.out.println("Reason Code Select-Pass");
	        }	
	        else{
	        	System.out.println("Reason Code Select-Fail");
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
	    		System.out.println("Enter Note-Pass");
	           }	
	           else{
	           	System.out.println("Enter Note-Fail");
	           }
	        
	        
	        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
	        if(bStatus){
	    		System.out.println("Save-Pass");
	           }	
	           else{
	           	System.out.println("Save-Fail");
	           }
	        
	        
	        
	        
	        bStatus=GeneralFunctions.clickElement(By.id("editButton"));
	        if(bStatus){
	    		System.out.println("add-Pass");
	           }	
	           else{
	           	System.out.println("add-Fail");
	           }
	        
	        bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
	        if(bStatus){
	 		System.out.println("Reason Code Select-Pass");
	        }	
	        else{
	        	System.out.println("Reason Code Select-Fail");
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
	    		System.out.println("Enter Note-Pass");
	           }	
	           else{
	           	System.out.println("Enter Note-Fail");
	           }
	        
	        
	        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
	        if(bStatus){
	    		System.out.println("Save-Pass");
	           }	
	           else{
	           	System.out.println("Save-Fail");
	           }
	        
	        /* bStatus= GeneralFunctions.getText(By.className("successMessage")).equalsIgnoreCase(sTranscSuccessMsg);
	        if(bStatus){
	 		System.out.println("Message Validated-Pass");
	        }	
	        else{
	        	System.out.println("Message Validated-Fail");
	        }*/
	        
	        //Delete the note//
	        
	        bStatus=GeneralFunctions.clickElement(By.id("deleteButton"));
	        if(bStatus){
	    		System.out.println("Delete-Pass");
	           }	
	           else{
	           	System.out.println("Delete-Fail");
	           }
	        
	        
	        //Click on Ok//
	        GeneralFunctions.driver.switchTo().alert().accept();
	        if(bStatus){
	    		System.out.println("Ok-Pass");
	           }	
	           else{
	        	   System.out.println("Ok-Fail");
	           }
	        
	      
	        //reporting//
	        if (bStatus){
	      	  alticor.magic.pages.Reports.logResults(LogStatus.PASS, "Test Pass","Validating Award Board Notes");
	      	  
	        }
	        else
	        {
	      	  alticor.magic.pages.Reports.logResults(LogStatus.FAIL, "Test Failed","Validating Award Board Notes");
	        }
	        
	        //close the browser//
	        com.alticor.magic.GeneralFunctions.close();
	        
    }

}
