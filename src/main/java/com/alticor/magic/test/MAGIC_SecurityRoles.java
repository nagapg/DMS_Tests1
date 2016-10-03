/*Open IE 11 and navigate to beta
 * click on the user name
 * Capture the user region*/
package com.alticor.magic.test;
import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.alticor.magic.test.pages.Reports;

import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;


public class MAGIC_SecurityRoles {
	
	
	/** Init variables */
    boolean bStatus=false;
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_SecurityRoles");
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
	  GeneralFunctions.clickElement(By.xpath("//span[text()='Naga Prathima Gha']"));
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
      
       if (bStatus) {
          Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_SecurityRoles");

      } else {
          Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_SecurityRoles");
      }
      com.alticor.magic.GeneralFunctions.close();

		

  }
}



