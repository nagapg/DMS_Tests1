
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
public class UserNotes_BusOwner {
	

	/** Init variables */
    private boolean bStatus=false;
    final private String sSuccessValidationMsg="Validation Was Successful";	//successMessage
    final private String sTranscSuccessMsg="Transaction Successfully Submitted";
	final private String sExpNote="Test Note";
	
	

    @Before
	public void setUp() throws Exception {
    	alticor.magic.pages.Reports.setTestCaseName("Notes for Bus Owner Deatils");
    	
    	//Open IE 11 and launch the application//
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
    	GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "9995");
		if(bStatus){
        	System.out.println("Abo-Pass");
        }	
        else{
        	System.out.println("Abo-Fail");
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
		
		//Maintenance-->LOS-->Bus Owner Attribute Links//
		bStatus=GeneralFunctions.clickElement(By.linkText("Bus Owner Attribute Links"));   
	       if(bStatus){
			System.out.println("Bus Owner Attribute Click-Pass");
	       }	
	       else{
	       	System.out.println("Bus Owner Attribute Click-Fail");
	       }
		
        
           //Enter Reason code//
	       bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
	       if(bStatus){
			System.out.println("Reason code-Pass");
	       }	
	       else{
	       	System.out.println("Reason code-Fail");
	       }
	        
	       
	      bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
	       if(bStatus){
	   		System.out.println("Note Selected-Pass");
	          }	
	          else{
	          	System.out.println("Note Selected-Fail");
	          }
	       
	       
	      bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
	       if(bStatus){
	   		System.out.println("Note enter-Pass");
	          }	
	          else{
	          	System.out.println("Note enter-Fail");
	          }
	       
	       bStatus=GeneralFunctions.clickElement(By.id("update"));
	       if(bStatus){
			System.out.println("Update-Pass");
	       }	
	       else{
	       	System.out.println("Update-Fail");
	       }
	       
        
	       
	       try {
	   		Thread.sleep(2000);
	   	} catch (InterruptedException e) {
	   		// TODO Auto-generated catch block
	   		e.printStackTrace();
	   	}

	          //Click on Ok//
	       GeneralFunctions.driver.switchTo().alert().accept();
	       if(bStatus){
	   		System.out.println("Ok-Pass");
	          }	
	          else{
	       	   System.out.println("Ok-Fail");
	          }
	       
	       //Reporting//
	       if (bStatus){
	    	   	  alticor.magic.pages.Reports.logResults(LogStatus.PASS, "Test Pass","Validating Bus Owner Notes");
	    	   	  
	    	     }
	    	     else
	    	     {
	    	   	  alticor.magic.pages.Reports.logResults(LogStatus.FAIL, "Test Fail","Validating Bus Owner Notes");
	    	     }
 
                //Close the browser//	       
	    	   com.alticor.magic.GeneralFunctions.close();
	       

    }

}
