
/* Users will be able to see notes that are added in MAGIC. We do not expect to see blank records when notes have been added to MAGIC.  */
package alticor.magic.test;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import alticor.magic.pages.Reports;

import com.alticor.magic.GeneralFunctions;
import com.relevantcodes.extentreports.LogStatus;
public class UserNotes_AnnualIntlSponChange {
	
	/** Init variables */
    private boolean bStatus=false;
    final private String sSuccessValidationMsg="Validation Was Successful";	//successMessage
    final private String sTranscSuccessMsg="Transaction Successfully Submitted";
	final private String sExpNote="Test Note";
	
	
	 @Before
		public void setUp() throws Exception {
	    	alticor.magic.pages.Reports.setTestCaseName("Notes for Annual Intl Sponsor Change");
	    	
	    	//Open IE 11 and navigate to the application//
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

		 
		 //Enter values//
		GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "010");
		if(bStatus){
        	System.out.println("Aff-Pass");
        }	
        else{
        	System.out.println("Aff-Fail");
        }
		GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "9995");
		if(bStatus){
        	System.out.println("Abo-Pass");
        }	
        else{
        	System.out.println("Abo-Fail");
        }
       bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"072016");
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
        	System.out.println("LOS Click-Pass");
        }	
        else{
        	System.out.println("LOS Click-Fail");
        }
		
		//Maintenance-->LOS-->Sponsor change//
		bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Sponsor Change']"));
        if(bStatus){
		System.out.println("sponsor change click-Pass");
        }	
        else{
        	System.out.println(" sponsor change click-Fail");
        }
		
       bStatus=GeneralFunctions.clickElement(By.linkText("Annual Intl Sponsor Change"));   
       if(bStatus){
		System.out.println("Annual Intl sponsor change click-Pass");
       }	
       else{
       	System.out.println("Annual Intl sponsor change click-Fail");
       }
       
       
       bStatus=GeneralFunctions.clickElement(By.id("newAnnualIntlAffiliateButton"));
       if(bStatus){
		System.out.println("new Intl Affiliate-Pass");
       }	
       else{
       	System.out.println("new Intl Affiliate-Fail");
       }
       try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       String countryCode="430";

       
       
       
     try{
    	 GeneralFunctions.verifyVisibilityOFElement(By.xpath("//div[@id='glossAffiliateList']/table/tbody/tr"));
      List<WebElement> objRows= GeneralFunctions.driver.findElements(By.xpath("//div[@id='glossAffiliateList']/table/tbody/tr"));
      for(WebElement objRow:objRows){
    	 List<WebElement> objCols=objRow.findElements(By.tagName("td"));
    	 if(objCols.get(0).getText().equalsIgnoreCase(countryCode)){
    		 new Actions(GeneralFunctions.driver).moveToElement(objRow).doubleClick().build().perform();
    	 }
      }
      
     }catch(Exception e){};

       
       bStatus=GeneralFunctions.enterTextToElement(By.id("newAnnualIntlSponsorNumber"), "46");
       if(bStatus){
		System.out.println("new Intl Sponsor number-Pass");
       }	
       else{
       	System.out.println("new Intl Sponsor number-Fail");
       }
       
       
       bStatus=GeneralFunctions.clickElement(By.id("annualSubmitButton"));
       if(bStatus){
		System.out.println("Submit-Pass");
       }	
       else{
       	System.out.println("Submit-Fail");
       }
      
     
       bStatus= GeneralFunctions.getText(By.className("successMessage")).equalsIgnoreCase(sSuccessValidationMsg);
       if(bStatus){
		System.out.println("Verify-Pass");
       }	
       else{
       	System.out.println("Verify-Fail");
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
       
       
       bStatus=GeneralFunctions.clickElement(By.id("annualUpdateButton"));
       if(bStatus){
		System.out.println("Update-Pass");
       }	
       else{
       	System.out.println("Update-Fail");
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
       
       
       bStatus=GeneralFunctions.clickElement(By.id("annualDeleteButton"));
       if(bStatus){
   		System.out.println("Delete button-Pass");
          }	
          else{
          	System.out.println("Delete button-Fail");
          }
    
       
     //Reporting//
       if (bStatus) {
           Reports.logResults(LogStatus.PASS, "Test Pass", "Notes entered on altILB");

       } else {
           Reports.logResults(LogStatus.FAIL, "Test Fail", "Notes not entered on altILB");
       }
       

       
       com.alticor.magic.GeneralFunctions.close();
		}

	}


