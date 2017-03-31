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

public class MAGICDashboard {
	
	/** Declare variables */
	boolean bStatus;
	
	@Before public void beforeTest() {
		Reports.setTestCaseName("MAGIC_DashboardTest");
    }
	
	@After public void afterTest() {
        Reports.endTest();
    }
	
	@Given("^Open browser and Navigate to MAGIC$")
	public void Open_browser_and_Navigate_to_MAGIC() throws Throwable{
		GeneralFunctions.openIEBrowser("https://magic-gamma/EBS_UI_Web/Magic");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
@When("^Values Entered and clicked on submit$")
public void Values_Entered_and_clicked_on_submit() throws Throwable{
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
					
					  try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	}
	
	@Then("^Capture MAGIC Dashboard$")
    public void Capture_MAGIC_Dashboard() throws Throwable{
		 //Validating the Expected//
	       String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id(\"ABOInfo\")/x:table/x:tbody/x:tr[2]/x:td[2]"));
		   System.out.println("The Output is:"  +ExpVal);
		  
		  com.alticor.magic.GeneralFunctions.close();
		 
		  if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Pass", "DashboardTest");
     } else {
	            Reports.logResults(LogStatus.FAIL, "Test Fail", "DashboardTest");
	        }
	}
	}
	    





