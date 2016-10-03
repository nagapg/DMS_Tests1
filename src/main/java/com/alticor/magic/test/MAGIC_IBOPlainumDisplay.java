/*Open IE 11 and navigate to beta
 * Enter 170/3101003819/062016 and click on submit
 *  Click on Dashboard
 *  Expected 1>Capture Platinum and Sponsor
 *  Expected 2>Both Platinum and sponsor should be equal*/

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

public class MAGIC_IBOPlainumDisplay {

/** Init variables */
  boolean bStatus=false;
  
  @BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_IBOPlainumDisplay");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
      	System.out.println("Navigated to beta");
      }	
      else{
      	System.out.println("Cannot Navigate to beta");
      }
		}
  
  @AfterMethod
  public void tearDown() throws Exception {
  Reports.endTest();
   }
  
  @Test
  public void test() {
		bStatus= GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "170");
		if(bStatus){
        	System.out.println("Entered Aff");
        }	
        else{
        	System.out.println("Cannot Enter Aff");
        }
		
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "3101003819");
		if(bStatus){
        	System.out.println("Entered Abo");
        }	
        else{
        	System.out.println("Cannot Enter Abo");
        }

	bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"062016");
		if(bStatus){
        	System.out.println("Entered Period");
        }	
        else{
        	System.out.println("Cannot Enter Period");
        }
  
		bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
		if(bStatus){
        	System.out.println("Clicked on Submit");
        }	
        else{
        	System.out.println("Cannot Click on Submit");
        }
		
		//Click on Dashboard//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='verticleMenuExpand']/div[4]"));
		if(bStatus){
        	System.out.println("Clicked on Dashboard");
        	}	
        else{
        	System.out.println("Cannot Click on Dashboard");
        }
		
       //Capture Platinum value from dashboard//
		String val1=GeneralFunctions.getText(By.xpath(".//*[@id='ABOInfo']/table/tbody/tr[3]/td[5]/a"));
		System.out.println("The Platinum value is    "  +  val1);
		
		//Capturing Sponsor value from Dashboard//
		String val2=GeneralFunctions.getText(By.xpath(".//*[@id='ABOInfo']/table/tbody/tr[4]/td[2]/a"));
		System.out.println("The Sponsor value is      "  +  val2);
		
		//Comparing the string values//
	   if(val1.equals(val2)){
			System.out.println("IBO Platinum and Sponsor are equal");
			}
		else
		{
			System.out.println("IBO Platinum and Sponsor are not equal");
		}
	   
	   com.alticor.magic.GeneralFunctions.close();
		
		//Test Reports//
		 if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Pass", "MAGIC_IBOPlainumDisplay");

	        } else {
	            Reports.logResults(LogStatus.FAIL, "Test Fail", "MAGIC_IBOPlainumDisplay");
	        }
 
}
}



