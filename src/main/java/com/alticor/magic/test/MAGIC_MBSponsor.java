package com.alticor.magic.test;
import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.alticor.magic.test.pages.Reports;

import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;

public class MAGIC_MBSponsor {

	/** Init variables */
    private boolean bStatus=false;
    final private String sSuccessValidationMsg="LOS Multi Business Sponsor:Validation was successful";	
    final private String sTranscSuccessMsg="LOS Multi Business Sponsor:Update was successful";
	final private String sExpNote="Test Note";
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_MBSponsor");
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
	
	  @Test
	  public void test() {
		  GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "220");
			if(bStatus){
	        	System.out.println("Aff-Pass");
	        }	
	        else{
	        	System.out.println("Aff-Fail");
	        }
			
	      
			GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "1000293");
			if(bStatus){
	        	System.out.println("Abo-Pass");
	        }	
	        else{
	        	System.out.println("Abo-Fail");
	        }
			
			
			
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"022015");
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
			
			 //Maintenance-->LOS-->Sponsor change//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Sponsor Change']"));
	        if(bStatus){
			System.out.println("sponsor change click-Pass");
	        }	
	        else{
	        	System.out.println("sponsor change click-Fail");
	        }
			
	        
	      //Maintenance-->LOS-->Sponsor change-->MB Sponsor//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Multi-Business Sponsor"));   
	       if(bStatus){
			System.out.println("MB Sponsor-Pass");
	       }	
	       else{
	       	System.out.println("MB Sponsor-Fail");
	       }

	       
	       bStatus=GeneralFunctions.clickElement(By.id("newMBSponsorAffiliateButton"));
	       if(bStatus){
			System.out.println("new Intl Affiliate-Pass");
	       }	
	       else{
	       	System.out.println("new Intl Affiliate-Fail");
	       }
	       try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch blsock
			e.printStackTrace();
		}
	       String countryCode="010";

	       
	       
	       
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

	       
	       bStatus=GeneralFunctions.enterTextToElement(By.id("newMBSponsorNumber"), "1");
	       if(bStatus){
			System.out.println("new MB Sponsor number-Pass");
	       }	
	       else{
	       	System.out.println("new MB Sponsor number-Fail");
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
			System.out.println("Select reason code-Pass");
	       }	
	       else{
	       	System.out.println("Select reason code-Fail");
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
	   		System.out.println("Note-Pass");
	          }	
	          else{
	          	System.out.println("Note-Fail");
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
			System.out.println("Updated-Pass");
	       }	
	       else{
	       	System.out.println("Updated-Fail");
	       }
	       
	       
	       bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
	       if(bStatus){
			System.out.println("Select reason code-Pass");
	       }	
	       else{
	       	System.out.println("Select reason code-Fail");
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
	   		System.out.println("Note-Pass");
	          }	
	          else{
	          	System.out.println("Note-Fail");
	          }
	       
	       
	       
	       bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
	    if(bStatus){
	   		System.out.println("Save-Pass");
	          }	
	          else{
	          	System.out.println("Save-Fail");
	          }
	       
	       
	       bStatus=GeneralFunctions.clickElement(By.id("deleteMBButton"));
	       if(bStatus){
			System.out.println("Delete-Pass");
	       }	
	       else{
	       	System.out.println("Delete-Fail");
	       }
	      
	       
	       
	       if (bStatus) {
	           Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_MBSponsor");

	       } else {
	           Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_MBSponsor");
	       }
	       com.alticor.magic.GeneralFunctions.close();

	 		

	   }
	 }
