package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.test.pages.Reports;
import com.alticor.okta.OktaLogin;
import com.alticor.prowl.AmwayProwlRunner;
import com.alticor.prowl.WebDriverManager;
import com.alticor.prowl.provider.EndpointProvider;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

@RunWith(AmwayProwlRunner.class) public class MAGIC_SponsorChangeNoteTest {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_SponsorChangeNoteTest");
        String baseUrl = EndpointProvider.getEndpoint();
        driver = WebDriverManager.getInstance().getDriver();

        oktaLogin = new OktaLogin(driver, null);
        oktaLogin.login("cmns559",
            "our49pot");// TODO: Make this grab password from environment variables
        driver.getTitle();

        magicPage = new MagicPage(driver, null);
        magicPage.setBaseUrl(baseUrl);
        magicPage.aboLookup("010", "9995", "072016");
    }

    @AfterClass public static void tearDown() {
        WebDriverManager.getInstance().close();
        Reports.endTest();
    }

/** Declare variables */
    private boolean bStatus=false;
    final private String sSuccessValidationMsg="Validation Was Successful";	//successMessage
    final private String sTranscSuccessMsg="Transaction Successfully Submitted";
	final private String sExpNote="Test Note";
	
		  @Test
	  public void test() {
			  
		  GeneralFunctions.driver=driver;
			
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
	      
	      com.alticor.magic.GeneralFunctions.close();
	       
	 if (bStatus) {
	          Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_SponsorChangeNoteTest");

	      } else {
	          Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_SponsorChangeNoteTest");
	      }
	

			

	  }
	}


	 



	 

