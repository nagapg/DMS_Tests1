package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.test.pages.Reports;
import com.alticor.okta.OktaLogin;
import com.alticor.prowl.AmwayProwlRunner;
import com.alticor.prowl.WebDriverManager;
import com.alticor.prowl.provider.EndpointProvider;
import com.relevantcodes.extentreports.LogStatus;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(AmwayProwlRunner.class) public class MAGIC_MassUploadInvalidABO {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_MassUploadInvalidABO");
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
    boolean bStatus=false;
	
	
	/*@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_MassUploadInvalidABO");
		bStatus=GeneralFunctions.openChormeBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
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
	
		@SuppressWarnings("unused")
		@Test
		public void test() {
			
			GeneralFunctions.driver=driver;
			
			//Processing//
					bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[3]"));
			        if(bStatus){
			        	System.out.println("Click on Processing");
			        }	
			        else{
			        	System.out.println("Cannot Click on Processing");
			        }
					
				
					//Processing-->Mass Upload Adj//
					bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='SubMenu3']/a[7]"));
					if(bStatus){
			        	System.out.println("Click on Mass Upload Adj");
			        }	
			        else{
			        	System.out.println("Cannot Click on Mass Upload Adj");
			        }
			        
					bStatus=GeneralFunctions.fileUpload(By.id("uploadFile"),System.getProperty("user.dir")+"\\"+"drivers\\Data.csv");
					if(bStatus){
			        	System.out.println("Uploaded file");
			        }	
			        else{
			        	System.out.println("Cannot Upload File");
			        }
					
					try {
			    		Thread.sleep(9000);
			    	} catch (InterruptedException e) {
			    		// TODO Auto-generated catch block
			    		e.printStackTrace();
			    	}
					
					//click submit//
					bStatus=GeneralFunctions.clickElement(By.name("submitButton"));
					if(bStatus){
			        	System.out.println("Clicked on Submit");
			        }	
			        else{
			        	System.out.println("Cannot Click on Submit");
			        }
					
				//Validations//
					List<WebElement> failedList=GeneralFunctions.getElemetList(By.xpath("//table[@id='messageTable']/tbody/tr/td/div/font/font"));
						
					for(WebElement list:failedList){
						if(bStatus){
				        	System.out.println("Failed Record details are:");
				        }	
				        else{
				        	System.out.println("No Failed Record details");
				        }
						
						System.out.println(list.getText());
						boolean bStatus=list.getText().trim().equalsIgnoreCase("Invalid ABO Number");
					}	
					
					
					com.alticor.magic.GeneralFunctions.close();
					
			//Test Results//	
			if(bStatus){
				Reports.logResults(LogStatus.PASS,"Test Pass","MAGIC_MassUploadInvalidABO");
			}
			else
			{
				Reports.logResults(LogStatus.FAIL,"Test Fail","MAGIC_MassUploadInvalidABO");
			}
			
		
			
			
			}

		}







