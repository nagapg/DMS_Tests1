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
import org.openqa.selenium.interactions.Actions;
import java.util.List;

@RunWith(AmwayProwlRunner.class) public class MAGIC_IntlSponChange {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_IntlSponChange");
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
    final private String sSuccessValidationMsg="Validation was successful";	
    final private String sTranscSuccessMsg="International Sponsor Update: Update was successful";
	final private String sExpNote="Test Note";
	
	
	
	/*@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_IntlSponChange");
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
	   }*/
	  
	
	  @Test
		 public void test() {
			 
		/*GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"),"010");
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
	        }*/
		  
		  GeneralFunctions.driver=driver;
			
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
			
			//Maintenance-->LOS-->Sponsor Change//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Sponsor Change']"));
	        if(bStatus){
			System.out.println("Sponsor Change-Pass");
	        }	
	        else{
	        	System.out.println("Sponsor Change-Fail");
	        }
			
	        //Maintenance-->LOS-->Sponsor change-->Intl Sponsor change//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Intl Sponsor Change"));   
	       if(bStatus){
			System.out.println("Intl Sponsor change-Pass");
	       }	
	       else{
	       	System.out.println("Intl Sponsor change-Fail");
	       }
	       
	       
	       bStatus=GeneralFunctions.clickElement(By.id("newIntlAffiliateButton"));
	       if(bStatus){
			System.out.println("new Intl Affiliate-Pass");
	       }	
	       else{
	       	System.out.println("new Intl Affiliate-Fail");
	       }
	       
	       
	       try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block//
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

	       
	       bStatus=GeneralFunctions.enterTextToElement(By.id("newIntlSponsorNumber"), "46");
	       if(bStatus){
			System.out.println("Enter new Intl Sponsor number-Pass");
	       }	
	       else{
	       	System.out.println("Enter new Intl Sponsor number-Fail");
	       }
	       
	       
	        bStatus=GeneralFunctions.clickElement(By.id("submitButton"));
	       if(bStatus){
			System.out.println("submit-Pass");
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
			System.out.println("Reason Code-Pass");
	       }	
	       else{
	       	System.out.println("Reason Code-Fail");
	       }
	       
	        bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
	       if(bStatus){
	   		System.out.println("Select Reason Code-Pass");
	          }	
	          else{
	          	System.out.println("Select Reason Code-Fail");
	          }
	       bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
	       if(bStatus){
	   		System.out.println("Enter note-Pass");
	          }	
	          else{
	          	System.out.println("Enter note-Fail");
	          }
	       
	        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
	    if(bStatus){
	   		System.out.println("note save-Pass");
	          }	
	          else{
	          	System.out.println("note save-Fail");
	          }
	       
	        bStatus=GeneralFunctions.clickElement(By.id("updateButton"));
	       if(bStatus){
			System.out.println("Update-Pass");
	       }	
	       else{
	       	System.out.println("Update-Fail");
	       }
	      

	       GeneralFunctions.driver.switchTo().alert().dismiss();
	       try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	       bStatus=GeneralFunctions.clickElement(By.id("updateButton"));
	       if(bStatus){
			System.out.println("Click on cancel-Pass");
	       }	
	       else{
	    	   System.out.println("Unable to click  cancel-Fail");
	       }

GeneralFunctions.driver.switchTo().alert().accept();
	    
	    try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
	    if(bStatus){
			System.out.println("Reason Code-Pass");
	    }	
	    else{
	    	System.out.println("Reason Code-Fail");
	    }
	    
	     bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
	    if(bStatus){
			System.out.println("Select Reason Code-Pass");
	       }	
	       else{
	       	System.out.println("Select Reason Code-Fail");
	       }
	    
	     bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
	    if(bStatus){
			System.out.println("Enter note-Pass");
	       }	
	       else{
	       	System.out.println("Enter note-Fail");
	       }
	    
 bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
	 if(bStatus){
			System.out.println("note save-Pass");
	       }	
	       else{
	       	System.out.println("note save-Fail");
	       }
	    
	    
	    bStatus=GeneralFunctions.clickElement(By.id("deleteButton"));
	    if(bStatus){
			System.out.println("Delete button-Pass");
	       }	
	       else{
	       	System.out.println("Delete button-Fail");
	       }
	 
	    com.alticor.magic.GeneralFunctions.close();
	    
	 //Test Results//
	    if (bStatus) {
	          Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_IntlSponChange");

	      } else {
	          Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_IntlSponChange");
	      }
	    

			

	  }
	}
	  
	  
