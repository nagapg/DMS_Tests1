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

public class MAGIC_ChangeInMarket {

	/** Init variables */
    private boolean bStatus=false;
    final private String sSuccessValidationMsg="Validation Was SuccessfulS";	//successMessage
    final private String sTranscSuccessMsg="Transaction Successfully Submitted";
	final private String sExpNote="Test Note";
	

	@BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_ChangeInMarket");
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
	
	 // @SuppressWarnings("unused")//
		@Test
		public void test() {
		//Entering Australia Aff//
			GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "030");
			if(bStatus){
	        	System.out.println("Aff-Pass");
	        }	
	        else{
	        	System.out.println("Aff-Fail");
	        }
			
	      
			GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "7700063");
			if(bStatus){
	        	System.out.println("Abo-Pass");
	        }	
	        else{
	        	System.out.println("Abo-Fail");
	        }
			
	 
			
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"062015");
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
	        	System.out.println("Maintanence-Pass");
	        	}	
	        else{
	        	System.out.println("Maintanence-Fail");
	        }
			
			//Maintenance-->LOS//
			
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='LOS']"));
			if(bStatus){
	        	System.out.println("LOS-Pass");
	        }	
	        else{
	        	System.out.println("LOS-Fail");
	        }
			
			//Maintenance-->LOS-->Sponsor change//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Sponsor Change']"));
	        if(bStatus){
			System.out.println("sponsor change clicked");
	        }	
	        else{
	        	System.out.println("unable to click sponsor change");
	        }
			
	        
	      //Maintenance-->LOS-->Sponsor change-->Sponsor Change//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Sponsor Change"));   
	       if(bStatus){
			System.out.println("sponsor change clicked");
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
	       	System.out.println("unable to click LTS");
	       }
	       
	       
	       bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
	       if(bStatus){
			System.out.println("Message Validated successfully");
	       }	
	       else{
	       	System.out.println("unable to click LTS");
	       }
	        
	       
	      bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
	       if(bStatus){
	   		System.out.println("Message Validated successfully");
	          }	
	          else{
	          	System.out.println("unable to click LTS");
	          }
	       
	       
	      bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
	       if(bStatus){
	   		System.out.println("Message Validated successfully");
	          }	
	          else{
	          	System.out.println("unable to click LTS");
	          }
	       
	       
	       
	       bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
	       if(bStatus){
	   		System.out.println("Message Validated successfully");
	          }	
	          else{
	          	System.out.println("unable to click LTS");
	          }
	       
	       
	       bStatus=GeneralFunctions.clickElement(By.id("updateButton"));
	       if(bStatus){
			System.out.println("Message Validated successfully");
	       }	
	       else{
	       	System.out.println("unable to click LTS");
	       }
	       
	       bStatus= GeneralFunctions.getText(By.className("successMessage")).equalsIgnoreCase(sTranscSuccessMsg);
	       if(bStatus){
			System.out.println("Message sTranscSuccessMsg successfully");
	       }	
	       else{
	       	System.out.println("unable to click LTS");
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
	        	System.out.println("submit Passed");
	        }	
	        else{
	        	System.out.println("submit failed");
	        }
			
			
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			if(bStatus){
	        	System.out.println("Maintanence Clicked");
	        	}	
	        else{
	        	System.out.println("Unable to click maintanence");
	        }
			
			//click on GIP//
			
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
	       	System.out.println("unable to click LTS");
	       }
	       
	       
	       bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
	       if(bStatus){
			System.out.println("Message Validated successfully");
	       }	
	       else{
	       	System.out.println("unable to click LTS");
	       }
	        
	       
	      bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
	       if(bStatus){
	   		System.out.println("Message Validated successfully");
	          }	
	          else{
	          	System.out.println("unable to click LTS");
	          }
	       
	       
	      bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
	       if(bStatus){
	   		System.out.println("Message Validated successfully");
	          }	
	          else{
	          	System.out.println("unable to click LTS");
	          }
	       
	       
	       
	       bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
	       if(bStatus){
	   		System.out.println("Message Validated successfully");
	          }	
	          else{
	          	System.out.println("unable to click LTS");
	          }
	       
	       
	       bStatus=GeneralFunctions.clickElement(By.id("updateButton"));
	       if(bStatus){
			System.out.println("Message Validated successfully");
	       }	
	       else{
	       	System.out.println("unable to click LTS");
	       }
	       
	       bStatus= GeneralFunctions.getText(By.className("successMessage")).equalsIgnoreCase(sTranscSuccessMsg);
	       if(bStatus){
			System.out.println("Message sTranscSuccessMsg successfully");
	       }	
	       else{
	       	System.out.println("unable to click LTS");
	       }
	       
	     	
			if(bStatus){
				Reports.logResults(LogStatus.PASS,"Test Pass","MAGIC_ChangeInMarket");
			}
			else
			{
				Reports.logResults(LogStatus.FAIL,"Test Fail","MAGIC_ChangeInMarket");
			}
			
			com.alticor.magic.GeneralFunctions.close();
	
	       
		 }	    



			
		  }


