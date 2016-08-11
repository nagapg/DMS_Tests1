/* Users will be able to see notes that are added in MAGIC. We do not expect to see blank records when notes have been added to MAGIC.*/

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

public class UserNotes_SponsorChange {
	

	/** Init variables */
    private boolean bStatus=false;
    final private String sSuccessValidationMsg="Validation Was Successful";	//successMessage
    final private String sTranscSuccessMsg="Transaction Successfully Submitted";
	final private String sExpNote="Test Note";
	
	
    @Before
	public void setUp() throws Exception {
    	alticor.magic.pages.Reports.setTestCaseName("Notes for Sponsor Change");
    	
    	//Open IE 11 and launch the application//
	bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Application launched-Pass");
        }	
        else{
        	System.out.println("Application launched-Fail");
        }
	}
	
	

	 @After
	 public void tearDown() throws Exception {
		 alticor.magic.pages.Reports.endTest();
	 }
	

	 @Test
	 public void test() {
		 
	
		GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "170");
		if(bStatus){
        	System.out.println("Aff-Pass");
        }	
        else{
        	System.out.println("Aff-Fail");
        }
		
      
		GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "1906266226");
		if(bStatus){
        	System.out.println("Abo-Pass");
        }	
        else{
        	System.out.println("Abo-Fail");
        }

		
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"062016");
		if(bStatus){
        	System.out.println("Period-Pass");
        }	
        else{
        	System.out.println("Period-Fail");
        }
		
		
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
		
		//Maintenance-->LOS//
		
		bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='LOS']"));
		if(bStatus){
        	System.out.println("LOS Click-Pass");
        }	
        else{
        	System.out.println("LOS Click-Fail");
        }
		
		//Maintenance-->LOS-->Sponsor Change//
		bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Sponsor Change']"));
        if(bStatus){
		System.out.println("Sponsor Change Click-Pass");
        }	
        else{
        	System.out.println("Sponsor Change Click-Fail");
        }
		
        
      //Maintenance-->LOS-->Sponsor Change-->Sponsor Change//
        bStatus=GeneralFunctions.clickElement(By.linkText("Sponsor Change"));   
       if(bStatus){
		System.out.println("sponsor change click-Pass");
       }	
       else{
       	System.out.println("sponsor change click-Pass");
       }
       
       
       bStatus=GeneralFunctions.enterTextToElement(By.id("newSponsorNumber"), "3101000003");
       if(bStatus){
		System.out.println("new Sponsor number-Pass");
       }	
       else{
    	   System.out.println("new Sponsor number-Fail");  
       }
       
       bStatus=GeneralFunctions.clickElement(By.id("submitButton"));
       if(bStatus){
		System.out.println("Submit-Pass");
       }	
       else{
       	System.out.println("Submit-Fail");
       }
       
       bStatus= GeneralFunctions.getText(By.className("successMessage")).equalsIgnoreCase(sSuccessValidationMsg);
       if(bStatus){
		System.out.println("Message Verify-Pass");
       }	
       else{
       	System.out.println("Message Verify-Fail");
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
   		System.out.println("Select Note-Pass");
          }	
          else{
          	System.out.println("Select Note-Fail");
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
       
       
       bStatus=GeneralFunctions.clickElement(By.id("updateButton"));
       if(bStatus){
		System.out.println("Update-Pass");
       }	
       else{
       	System.out.println("Update-Fail");
       }
       
       bStatus= GeneralFunctions.getText(By.className("successMessage")).equalsIgnoreCase(sTranscSuccessMsg);
       if(bStatus){
		System.out.println("Message Validated-Pass");
       }	
       else{
       	System.out.println("Message Validated-Fail");
       }
       
       bStatus=GeneralFunctions.clickElement(By.xpath("//span[@tip='Click here to view ABO Notes']"));
       
       if(bStatus){
   		System.out.println("User Notes-Pass");
          }	
          else{
          	System.out.println("User Notes-Fail");
          }
       
       
      bStatus= GeneralFunctions.verifyVisibilityOFElement(By.id("viewTable"));
       if(bStatus){
   		System.out.println("Table-Pass");
          }	
          else{
          	System.out.println("Table-Fail");
          }
       
       
       List<WebElement> objRows=GeneralFunctions.driver.findElement(By.id("viewTable")).findElement(By.tagName("tbody")).findElements(By.tagName("tr"));

       for(int iCounter=1;iCounter<objRows.size();iCounter++){
    	  List<WebElement> objCols=objRows.get(iCounter).findElements(By.tagName("td"));

    	  bStatus=objCols.get(1).findElement(By.tagName("div")).getText().trim().equalsIgnoreCase(sExpNote);
          if(bStatus){
        	  break;
          }
      }
      if(bStatus){
		System.out.println("Note Visible-Pass");
      }	
      else{
      	System.out.println("Note Visible-Fail");
      }
       
      if (bStatus){
    	  alticor.magic.pages.Reports.logResults(LogStatus.PASS, "Test Pass","Validating sponsor Change Notes");
    	  
      }
      else
      {
    	  alticor.magic.pages.Reports.logResults(LogStatus.FAIL, "Test Fail","Validating sponsor Change Notes");
      }
      com.alticor.magic.GeneralFunctions.close();
	}

}

