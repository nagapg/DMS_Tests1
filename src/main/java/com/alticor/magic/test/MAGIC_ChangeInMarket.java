/*Open IE 11 and navigate to beta
 * Go to  Maintenance-->LOS-->Sponsor change-->Sponsor Change
 * Validating Australia Aff
 * Validating for South Africa ABO*/
package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class MAGIC_ChangeInMarket {

	/** Init variables */
    private boolean bStatus=false;
    final private String sSuccessValidationMsg="Validation Was SuccessfulS";	//successMessage
    final private String sTranscSuccessMsg="Transaction Successfully Submitted";
	final private String sExpNote="Test Note";
	

	@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_ChangeInMarket");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Navigated to beta");
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
		//Entering Australia Aff//
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "030");
			if(bStatus){
	        	System.out.println("Entered Aff");
	        }	
	        else{
	        	System.out.println("Cannot Enter Aff");
	        }
			
			bStatus= GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "7700063");
			if(bStatus){
	        	System.out.println("Entered Abo");
	        }	
	        else{
	        	System.out.println("Cannot Enter Abo");
	        }
			
	 bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"062015");
			if(bStatus){
	        	System.out.println("Entered Period");
	        }	
	        else{
	        	System.out.println("Cannot Enter Period");
	        }
			
			bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Clicked on Submit");
	        }	
	        else{
	        	System.out.println("Cannot Click on Submit");
	        }
			
			//Maintenance//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			if(bStatus){
	        	System.out.println("Click on Maintanence");
	        	}	
	        else{
	        	System.out.println("Cannot Click on Maintanence");
	        }
			
			//Maintenance-->LOS//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='LOS']"));
			if(bStatus){
	        	System.out.println("Click on LOS");
	        }	
	        else{
	        	System.out.println("Cannot Click on LOS");
	        }
			
			//Maintenance-->LOS-->Sponsor change//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Sponsor Change']"));
	        if(bStatus){
			System.out.println("Click on sponsor change");
	        }	
	        else{
	        	System.out.println("unable to click sponsor change");
	        }
			
	        
	      //Maintenance-->LOS-->Sponsor change-->Sponsor Change//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Sponsor Change"));   
	       if(bStatus){
			System.out.println("Click on sponsor change");
	       }	
	       else{
	       	System.out.println("unable to click Sponsor change");
	       }
	       
	       bStatus=GeneralFunctions.enterTextToElement(By.id("newSponsorNumber"), "3004831");
	       if(bStatus){
			System.out.println("enter new Sponsor number");
	       }	
	       else{
	    	   System.out.println("unable to enter new sponosr number");  
	       }
	       
	       bStatus=GeneralFunctions.clickElement(By.id("submitButton"));
	       if(bStatus){
			System.out.println("click on submit");
	       }	
	       else{
	       	System.out.println("unable to click submit");
	       }
	       
	       bStatus= GeneralFunctions.getText(By.className("successMessage")).equalsIgnoreCase(sSuccessValidationMsg);
	       if(bStatus){
			System.out.println("Message Validated successfully");
	       }	
	       else{
	       	System.out.println("Message not Validated ");
	       }
	       
	      bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
	       if(bStatus){
			System.out.println("Clicked on Notes");
	       }	
	       else{
	       	System.out.println("Cannot Clicked on Notes");
	       }
	        
	       bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
	       if(bStatus){
	   		System.out.println("Message Validated successfully");
	          }	
	          else{
	          	System.out.println("Message not Validated");
	          }
	       
	       
	      bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
	       if(bStatus){
	   		System.out.println("Entered Notes");
	          }	
	          else{
	          	System.out.println("Cannot Enter Notes");
	          }
	       
	      bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
	       if(bStatus){
	   		System.out.println("Clicked on Save");
	          }	
	          else{
	          	System.out.println("Cannot Click on Save");
	          }
	       
	       bStatus=GeneralFunctions.clickElement(By.id("updateButton"));
	       if(bStatus){
			System.out.println("Clicked on Update");
	       }	
	       else{
	       	System.out.println("Cannot Click on Update");
	       }
	       
	       bStatus= GeneralFunctions.getText(By.className("successMessage")).equalsIgnoreCase(sTranscSuccessMsg);
	       if(bStatus){
			System.out.println("Message sTranscSuccessMsg successfully");
	       }	
	       else{
	       	System.out.println("Message not successfull");
	       }
	       
	       //Validating for South Africa ABO//
	       GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "570");
			if(bStatus){
	        	System.out.println("Enter Aff");
	        }	
	        else{
	        	System.out.println("Unable to enter Aff");
	        }
			
	      GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "74903");
			if(bStatus){
	        	System.out.println("Enter Abo");
	        }	
	        else{
	        	System.out.println("Unable to enter Abo");
	        }
			
	    bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Click on submit");
	        }	
	        else{
	        	System.out.println("Cannot Click on submit");
	        }
			
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			if(bStatus){
	        	System.out.println("Click on Maintanence");
	        	}	
	        else{
	        	System.out.println("Unable to click maintanence");
	        }
			
			//Click on LOS//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='LOS']"));
			if(bStatus){
	        	System.out.println("LOS  clicked");
	        }	
	        else{
	        	System.out.println("unable to click LOS");
	        }
			
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Sponsor Change']"));
	        if(bStatus){
			System.out.println("sponsor change clicked");
	        }	
	        else{
	        	System.out.println("unable to click sponsor change");
	        }
			
	        bStatus=GeneralFunctions.clickElement(By.linkText("Sponsor Change"));   
	       if(bStatus){
			System.out.println("sponsor change clicked");
	       }	
	       else{
	       	System.out.println("unable to click Sponsor change");
	       }
	       
	       bStatus=GeneralFunctions.enterTextToElement(By.id("newSponsorNumber"), "1");
	       if(bStatus){
			System.out.println("enter new Sponsor number");
	       }	
	       else{
	    	   System.out.println("unable to enter new sponosr number");  
	       }
	       
	       bStatus=GeneralFunctions.clickElement(By.id("submitButton"));
	       if(bStatus){
			System.out.println("click on submit");
	       }	
	       else{
	       	System.out.println("unable to click submit");
	       }
	       
	       bStatus= GeneralFunctions.getText(By.className("successMessage")).equalsIgnoreCase(sSuccessValidationMsg);
	       if(bStatus){
			System.out.println("Message Validated successfully");
	       }	
	       else{
	       	System.out.println("Unable to Validate message");
	       }
	       
	        bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
	       if(bStatus){
			System.out.println("click on notes");
	       }	
	       else{
	       	System.out.println("unable to click on notes");
	       }
	        
	       bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
	       if(bStatus){
	   		System.out.println("click on notes");
	          }	
	          else{
	          	System.out.println("unable to click notes");
	          }
	       
	       bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
	       if(bStatus){
	   		System.out.println("Enter Notes");
	          }	
	          else{
	          	System.out.println("unable to enter notes");
	          }
	       
	       bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
	       if(bStatus){
	   		System.out.println("Clicked on save");
	          }	
	          else{
	          	System.out.println("unable to click on Save");
	          }
	       
	       bStatus=GeneralFunctions.clickElement(By.id("updateButton"));
	       if(bStatus){
			System.out.println("Clicked on Update");
	       }	
	       else{
	       	System.out.println("unable to click Update");
	       }
	       
	       bStatus= GeneralFunctions.getText(By.className("successMessage")).equalsIgnoreCase(sTranscSuccessMsg);
	       if(bStatus){
			System.out.println("Message sTranscSuccessMsg successfully");
	       }	
	       else{
	       	System.out.println("unable to Capture the message");
	       }
	       
	       com.alticor.magic.GeneralFunctions.close();
	     	
	       //Test Results//
			if(bStatus){
				Reports.logResults(LogStatus.PASS,"Test Pass","MAGIC_ChangeInMarket");
			}
			else
			{
				Reports.logResults(LogStatus.FAIL,"Test Fail","MAGIC_ChangeInMarket");
			}
			}	    
}


