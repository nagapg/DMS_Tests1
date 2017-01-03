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


@RunWith(AmwayProwlRunner.class) public class MAGIC_MBSponsor {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_MBSponsor");
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
    final private String sSuccessValidationMsg="LOS Multi Business Sponsor:Validation was successful";	
    final private String sTranscSuccessMsg="LOS Multi Business Sponsor:Update was successful";
	final private String sExpNote="Test Note";
	
	
/*	@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_MBSponsor");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Navigated to beta");
        }	
        else{
        	System.out.println("Cannot navigate to beta");
        }
		}

	
	  @After
      public void tearDown() throws Exception {
		 Reports.endTest();
	   }*/
	
	  @Test
	  public void test() {
		 /* GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "220");
			if(bStatus){
	        	System.out.println("Entered Aff");
	        }	
	        else{
	        	System.out.println("Cannot enter Aff");
	        }
			
	      
			GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "1000293");
			if(bStatus){
	        	System.out.println("Entered Abo");
	        }	
	        else{
	        	System.out.println("Cannot enter Abo");
	        }
			
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"022015");
			if(bStatus){
	        	System.out.println("Entered Period");
	        }	
	        else{
	        	System.out.println("Cannot enter Period");
	        }
			
			
			bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Clicked on submit");
	        }	
	        else{
	        	System.out.println("Cannot click on submit");
	        }*/
		  
		  
		  GeneralFunctions.driver=driver;
			
	        //Maintenance//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			if(bStatus){
	        	System.out.println("Clicked on Maintanence");
	        	}	
	        else{
	        	System.out.println("Cannot click on Maintanence");
	        }
			
			 //Maintenance-->LOS//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='LOS']"));
			if(bStatus){
	        	System.out.println("Clicked on  LOS");
	        }	
	        else{
	        	System.out.println("Cannot Clicked on LOS");
	        }
			
			 //Maintenance-->LOS-->Sponsor change//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Sponsor Change']"));
	        if(bStatus){
			System.out.println("Clicked on  sponsor change");
	        }	
	        else{
	        	System.out.println("Cannot Click on  sponsor change");
	        }
			
	        
	      //Maintenance-->LOS-->Sponsor change-->MB Sponsor//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Multi-Business Sponsor"));   
	       if(bStatus){
			System.out.println("Clicked on MB Sponsor");
	       }	
	       else{
	       	System.out.println("Cannot Click on MB Sponsor");
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
			System.out.println("Clicked on Submit");
	       }	
	       else{
	       	System.out.println("Cannot Click on Submit");
	       }
	       
	       bStatus= GeneralFunctions.getText(By.className("successMessage")).equalsIgnoreCase(sSuccessValidationMsg);
	       if(bStatus){
			System.out.println("Message Verified");
	       }	
	       else{
	       	System.out.println("Message cannot be  Verified");
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
	      
	       com.alticor.magic.GeneralFunctions.close();
	       
	       //Test Results//
	       if (bStatus) {
	           Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_MBSponsor");

	       } else {
	           Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_MBSponsor");
	       }
	      

	 		

	   }
	 }
