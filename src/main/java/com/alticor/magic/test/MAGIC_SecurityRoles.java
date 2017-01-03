
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

@RunWith(AmwayProwlRunner.class) public class MAGIC_SecurityRoles {
	
	static WebDriver driver;
    static MagicPage magicPage;
    static OktaLogin oktaLogin;
    @Rule public ErrorCollector collector = new ErrorCollector();

    @BeforeClass public static void setup() {
    	
    	Reports.setTestCaseName("MAGIC_SecurityRoles");
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
	Reports.setTestCaseName("MAGIC_SecurityRoles");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Beta Opened");
        }	
        else{
        	System.out.println("Cannot open beta");
        }
		}

@After 
    public void tearDown() throws Exception {
	Reports.endTest();
	   }*/
	

    @Test 
    public void test() {
    	
  	  
		  GeneralFunctions.driver=driver;
	  GeneralFunctions.clickElementByJavascriptExecutor(By.xpath("//span[text()='Naga Prathima Gha']"));
    	//GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='leftPaneTD']/form/div[3]/span"));//
    	try {
          Thread.sleep(2000);
      } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
      List<WebElement> table =
          GeneralFunctions.driver.findElement(By.xpath("//table[@id='innerUserInfoTable']/tbody"))
              .findElements(By.tagName("tr"));
      String text = table.get(table.size() - 1).findElement(By.xpath("td[2]")).getText();
      System.out.println("The User Region Captured  is:" + text);
      
      com.alticor.magic.GeneralFunctions.close();
      
      //Test Reports//
       if (bStatus) {
          Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_SecurityRoles");

      } else {
          Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_SecurityRoles");
      }
      

		

  }
}



