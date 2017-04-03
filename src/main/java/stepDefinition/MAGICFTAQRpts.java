package stepDefinition;

import org.junit.After;
import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGICFTAQRpts {

	/** Declare variables */
	boolean bStatus;
	
	@Before public void beforeTest() {
		Reports.setTestCaseName("MAGICFTAQRpts");
    }
	
	@After public void afterTest() {
        Reports.endTest();
    }
	
	@Given("^Open browser and Navigate to MAGIC6$")
	public void Open_browser_and_Navigate_to_MAGIC6() throws Throwable{
		GeneralFunctions.openIEBrowser("https://magic-gamma/EBS_UI_Web/Magic");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
@When("^navigated to FTAQRpts Screen$")
public void navigated_to_FTAQRpts_Screen() throws Throwable{
	//Enter Aff:010//
	bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
	  if (bStatus) {
    System.out.println("AFF entered");
} else {
    System.out.println("Cannot enter AFF");
}
	  //Enter Abo:9995//
	bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"9995");
	  if (bStatus) {
      System.out.println("ABO entered");
  } else {
      System.out.println("Cannot enter ABO");
  }
	   //Enter Period:022017//
	  bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"022017");
		if(bStatus){
      	System.out.println("Entered Period");
      }	
      else{
      	System.out.println("Cannot Enter Period");
      }
 //Click on submit//
		  bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
		  if (bStatus) {
	        System.out.println("click on Submit");
	    } else {
	        System.out.println("Cannot click on submit");
	    }
		//Reports//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));
			    if(bStatus){
		        	System.out.println("Click on Reports");
		        }	
		        else{
		        	System.out.println("Cannot Click on Reports");
		        }
		   		 //Reports-->Qualification Reports//
		      bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4']/a[7]/span[1]"));
   	        if(bStatus){
   			System.out.println("Click on Qualification Rpts");
   	        }	
   	        else{
   	        	System.out.println("Cannot Click on Qualification Rpts");
   	        }
   			//Reports-->Qualification Reports-->Award Qualification Reports //
   	        bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4_8']/a[1]/span[1]"));   
   	       if(bStatus){
   			System.out.println("Click on Award Qualification Reports");
   	       }	
   	       else{
   	       	System.out.println("Cannot Click on Award Qualification Reports");
   	       }
	  //Reports-->Qualification Reports-->Award Qualification Reports-->First Time Award Qual Rpts //
   	        bStatus=GeneralFunctions.clickElement(By.linkText("First Time Award Qualifier Reports"));   
   	       if(bStatus){
   			System.out.println("Click on First Time Award Qual Rpts");
   	       }	
   	       else{
   	       	System.out.println("Cannot Click on First Time Award Qual Rpts");
   	       }
   	       }


@Then("^Capture MAGIC FTAQRpts$")
public void Capture_MAGIC_FTAQRpts() throws Throwable{
	  //Validating the Expected//
       String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='searchBoxDiv']/div[1]"));
	   System.out.println("The Output is:"  +ExpVal);
	  com.alticor.magic.GeneralFunctions.close();
if (bStatus) {
        Reports.logResults(LogStatus.PASS, "Test Pass", "MAGICFTAQRpts");
        } 
else {
        Reports.logResults(LogStatus.FAIL, "Test Fail", "MAGICFTAQRpts");
    }
}
}





