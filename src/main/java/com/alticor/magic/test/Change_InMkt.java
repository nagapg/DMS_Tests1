/*Given a user visits the In-Market Sponsor Change Screen in 0.8
When they select an abo from Australia/New Zealand or South Africa affiliates
Then they should be allowed to make the change*/


package alticor.magic.test;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import alticor.magic.pages.Reports;

import com.alticor.magic.GeneralFunctions;
import com.relevantcodes.extentreports.LogStatus;
public class Change_InMkt {
	
	/** Init variables */
    private boolean bStatus=false;
    final private String sSuccessValidationMsg="Validation Was SuccessfulS";	//successMessage
    final private String sTranscSuccessMsg="Transaction Successfully Submitted";
	final private String sExpNote="Test Note";
	
	 @Before
		public void setUp() throws Exception {
	    	alticor.magic.pages.Reports.setTestCaseName("MA 6100");
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
	       
	       bStatus=GeneralFunctions.enterTextToElement(By.id("newSponsorNumber"), "2099860");
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
	       
	     //Reporting//	
			if(bStatus){
				Reports.logResults(LogStatus.PASS,"Test Pass","Change inmarket Sponsor");
			}
			else
			{
				Reports.logResults(LogStatus.FAIL,"Test Fail","Change inmarket Sponsor");
			}
			
			com.alticor.magic.GeneralFunctions.close();
	
	       
		 }	    

}
