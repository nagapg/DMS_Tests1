package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;//

//import java.util.List;//

public class Sample {



    /*boolean bStatus;

    @Before public void setUp() throws Exception {
        Reports.setTestCaseName("User Region:ldap-amw-magic-developer");
       bStatus = GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
        if (bStatus) {
            System.out.println("browser launched sucessfully");
        } else {
            System.out.println("unable to launch browser");
        }
    }



    @Test public void test() {
        GeneralFunctions.clickElement(By.xpath("//span[text()='Naga Prathima Gha']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        List<WebElement> table =
            GeneralFunctions.driver.findElement(By.xpath("//table[@id='innerUserInfoTable']/tbody"))
                .findElements(By.tagName("tr"));
        String text = table.get(table.size() - 1).findElement(By.xpath("td[2]")).getText();
        System.out.println("The User Region Captured  is:" + text);
        if (bStatus) {
            Reports.logResults(LogStatus.PASS, "Capture the User Region", "Capture is successful");

        } else {
            Reports.logResults(LogStatus.FAIL, "Capture the User Region", "Unable to capture");
        }
        GeneralFunctions.close();
    }


    @After public void afterTest() {
        Reports.endTest();
    }
}*/
	
	

/** Declare variables */
    private boolean bStatus=false;
    final private String sExpNote="Test Note";
    
   @Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_AwardBoard");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-gamma:9452/EBS_UI_Web/Magic");
		GeneralFunctions.clickElement(By.id("overridelink"));

		if(bStatus){
        	System.out.println("Application-Pass");
        }	
        else{
        	System.out.println("Application-Fail");
        }
		}

	
	  @After
      public void tearDown() throws Exception {
	 Reports.endTest();
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
	   		
		  //GeneralFunctions.driver=driver;//
	           
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
		        
		        com.alticor.magic.GeneralFunctions.close();
		        
		        //reporting//

		        if (bStatus) {
		            Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_AwardBoard");

		        } else {
		            Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_AwardBoard");
		        }
		       }
		  }

