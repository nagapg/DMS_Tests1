package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.report.Reports;
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
import org.openqa.selenium.interactions.Actions;

@RunWith(AmwayProwlRunner.class) public class MAGIC_BatchProcessing {

	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_BatchProcessing");
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
		Reports.setTestCaseName("MAGIC_BatchProcessing");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Naviagted to beta");
        }	
        else{
        	System.out.println("Cannot Naviaget to beta");
        }
		}

	
	  @After
      public void tearDown() throws Exception {
	  Reports.endTest();
	   }*/
	
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
			
		
			//Processing-->Batch Processing//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Batch Processing']"));
			if(bStatus){
	        	System.out.println("Click on Batch Processing");
	        }	
	        else{
	        	System.out.println("Cannot Click on Batch Processing");
	        }
	        
	      //Maintenance-->Batch Processing-->Batch Search//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Batch Search"));   
	       if(bStatus){
			System.out.println("Click on Batch Search");
	       }	
	       else{
	       	System.out.println("Cannot Click on Batch Search");
	       }
	        
	       //Enter Batch Search//
	       bStatus=GeneralFunctions.enterTextToElement(By.name("searchBatchNumber"),"35361");
			if(bStatus){
	        	System.out.println("Enter Batch Search Number");
	        }	
	        else{
	        	System.out.println("Cannot Enter Batch Search Number");
	        }

		//Click on search button//
			bStatus=GeneralFunctions.clickElement(By.id("viewButton"));   
		       if(bStatus){
				System.out.println("Click on Search");
		       }	
		       else{
		       	System.out.println("Cannot Click on Search");
		       }
		       
		      bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.linkText("35361"));   
		       if(bStatus){
				System.out.println("Click on Batch Search");
		       }	
		       else{
		       	System.out.println("Cannot Click on Batch Search");
		       }
try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		       GeneralFunctions.verifyVisibilityOFElement(By.id("batcTransList"));
		       List<WebElement> rows=GeneralFunctions.driver.findElement(By.xpath("//table[@id='batcTransList']/tbody")).findElements(By.tagName("tr"));
		       WebElement element= rows.get(1).findElements(By.tagName("td")).get(1);
		     new Actions(GeneralFunctions.driver).moveToElement(element).doubleClick().build().perform();    
		         if(bStatus){
				System.out.println("Click on row");
		       }	
		       else{
		       	System.out.println("Cannot Click on row");
		       }
 
              bStatus=GeneralFunctions.clickElement(By.id("EditButton"));
		    	  if(bStatus){
		          	System.out.println("Click on Edit");
		          }	
		          else{
		          	System.out.println("Cannot Click on Edit");
		          }
		  		
		    	  bStatus=GeneralFunctions.enterTextToElement(By.id("aboText"),"78514");
		    	  if(bStatus){
		          	System.out.println("Enter New ABO");
		          }	
		          else{
		          	System.out.println("Cannot Enter New ABO");
		          }
		    	  
		    	  bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Apply changes to Database']"));
		          if(bStatus){
		   		System.out.println("Click on Save");
		          }	
		          else{
		          	System.out.println("Cannot Click on Save");
		          }
		          
		          try {
			    		Thread.sleep(9000);
			    	} catch (InterruptedException e) {
			    		// TODO Auto-generated catch block
			    		e.printStackTrace();
			    	}
		         
		          System.out.println(GeneralFunctions.driver.switchTo().alert().getText());
		          try {
			      		Thread.sleep(9000);
			      	} catch (InterruptedException e) {
			      		// TODO Auto-generated catch block
			      		e.printStackTrace();
			      	}
		   GeneralFunctions.driver.switchTo().alert().accept();
		     
		     bStatus=GeneralFunctions.enterTextToElement(By.id("aboText"),"1");
		    	  if(bStatus){
		          	System.out.println("Enter New ABO");
		          }	
		          else{
		          	System.out.println("Cannot Enter New ABO");
		          }
		    	  
		    	  bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Apply changes to Database']"));
		          if(bStatus){
		   		System.out.println("Click on Save");
		          }	
		          else{
		          	System.out.println("Cannot Click on Save");
		          }
		          
		          com.alticor.magic.GeneralFunctions.close();
		          
		          //Test Results//
		          if (bStatus) {
		              Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_BatchProcessing");

		          } else {
		              Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_BatchProcessing");
		          }
		       

		    		

		      }
		    }


