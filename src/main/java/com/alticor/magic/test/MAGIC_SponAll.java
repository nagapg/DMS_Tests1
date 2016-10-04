package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class MAGIC_SponAll {

	/** Init variables */
    private boolean bStatus=false;
    final private String sSuccessValidationMsg="Validation Was SuccessfulS";	
    final private String sTranscSuccessMsg="Transaction Successfully Submitted";
	final private String sExpNote="Test Note";
	
	@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_SponAll");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
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
		  GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "010");
			if(bStatus){
	        	System.out.println("Aff-Pass");
	        }	
	        else{
	        	System.out.println("Aff-Fail");
	        }
			
	      
			GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "1");
			if(bStatus){
	        	System.out.println("Abo-Pass");
	        }	
	        else{
	        	System.out.println("Abo-Fail");
	        }
			
			
			
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"082015");
			if(bStatus){
	        	System.out.println("Period-Pass");
	        }	
	        else{
	        	System.out.println("Period-Fail");
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
	        	System.out.println("Maintanence Click-Fail");
	        }
			
			//Maintenance-->LOS//
			
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='LOS']"));
			if(bStatus){
	        	System.out.println("LOS  click-Pass");
	        }	
	        else{
	        	System.out.println("LOS  click-Fail");
	        	
	        }
			
			//Maintenance-->LOS-->Sponsor Change//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Sponsor Change']"));
	        if(bStatus){
			System.out.println("sponsor change click-Pass");
	        }	
	        else{
	        	System.out.println("sponsor change click-Fail");
	        }
			
	        
	      //Maintenance-->LOS-->Sponsor Change-->MB Sponsor All//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Multi-Business Sponsor - ALL"));   
	       if(bStatus){
			System.out.println("MB Sponsor All click-Pass");
	       }	
	       else{
	       	System.out.println("MB Sponsor All click-Fail");
	       }
	       
	       //click on Add button//
	       bStatus=GeneralFunctions.clickElement(By.id("addButton"));
	       if(bStatus){
			System.out.println("Add-Pass");
	       }	
	       else{
	    	   System.out.println("Add-Fail");  
	       }
	       
	       bStatus=GeneralFunctions.enterTextToElement(By.id("mbAffNo"), "430");
	       if(bStatus){
			System.out.println("new Intl Sponsor number-Pass");
	       }	
	       else{
	       	System.out.println("new Intl Sponsor number-Fail");
	       }

	       
	       bStatus=GeneralFunctions.enterTextToElement(By.id("mbIboNo"), "225");
	       if(bStatus){
			System.out.println("new MbIboNo-Pass");
	       }	
	       else{
	       	System.out.println("new MbIboNo-Fail");
	       }
	       
	       bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
	       if(bStatus){
			System.out.println("Reason code-Pass");
	       }	
	       else{
	       	System.out.println("Reason code-Fail");
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
	   		System.out.println("Enter note-Pass");
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
	       

	    bStatus=GeneralFunctions.clickElement(By.id("applyButton"));
	    if(bStatus){
			System.out.println("Update-Pass");
	    }	
	    else{
	    	System.out.println("Update-Fail");
	    }
	    
	    
	    
	    if (bStatus) {
	        Reports.logResults(LogStatus.PASS, "Test Pass", "MAGIC_SponAll");

	    } else {
	        Reports.logResults(LogStatus.FAIL, "Test Fail", "MAGIC_SponAll");
	    }
	    
	   
	    com.alticor.magic.GeneralFunctions.close();
	}
	
	  }

