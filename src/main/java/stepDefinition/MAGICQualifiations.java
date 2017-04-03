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

public class MAGICQualifiations {

	/** Declare variables */
	boolean bStatus;
	
	@Before public void beforeTest() {
		Reports.setTestCaseName("MAGICQualifiations");
    }
	
	@After public void afterTest() {
        Reports.endTest();
    }
	
	@Given("^Open browser and Navigate to MAGIC8$")
	public void Open_browser_and_Navigate_to_MAGIC8() throws Throwable{
		GeneralFunctions.openIEBrowser("https://magic-gamma/EBS_UI_Web/Magic");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
@When("^navigated to Qualifications Screen$")
public void navigated_to_Qualifications_Screen() throws Throwable{
	//Enter Aff:010//
	bStatus =GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"),"010");
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
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//Inquiry//
			bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[2]"));
		        if(bStatus){
		        	System.out.println("Click on Inquiry");
		        }	
		        else{
		        	System.out.println("Cannot Click on Inquiry");
		        }
		         //Inquiry-->Awards//
		      bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[3]/span[1]"));
	   	        if(bStatus){
	   			System.out.println("Click on Awards");
	   	        }	
	   	        else{
	   	        	System.out.println("Cannot Click on Awards");
	   	        }
	   			//Click on Qualification//
		     bStatus=GeneralFunctions.clickElement(By.linkText("Qualifications"));
	   	        if(bStatus){
	   			System.out.println("Click on Qualifications");
	   	        }	
	   	        else{
	   	        	System.out.println("Cannot Click on Qualifications");
	   	        }
}


@Then("^Capture MAGIC Qualifications$")
public void Capture_MAGIC_Qualifications() throws Throwable{
	 //Validating the Expected//
    String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id('IboDashboardAwardsExpand')/x:div[1]"));
    System.out.println("The Output is:"  +ExpVal);
com.alticor.magic.GeneralFunctions.close();
if (bStatus) {
Reports.logResults(LogStatus.PASS, "Test Passed", "MAGICQualifiations");
}
else {
Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGICQualifiations");
}


}

}



