/*Open IE 11 and navigate to beta
 * click on the user name
 * Capture the user region*/
package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class MAGIC_SecurityRoles {
	
/** Init variables */
    boolean bStatus=false;
	
@Before 
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
	   }
	

    @Test 
    public void test() {
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



