package com.alticor.magic.test;

import org.junit.After;
import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleTest {
	
	/** Declare variables */
	boolean bStatus;
	
	@Before public void beforeTest() {
		Reports.setTestCaseName("SampleTest");
    }
	
	@After public void afterTest() {
        Reports.endTest();
    }
	
	@Given("^Open Browser and Navigate to MAGIC Gamma1$")
	public void Open_Browser_and_Navigate_to_MAGIC_Gamma1() throws Throwable{
		
		GeneralFunctions.openIEBrowser("https://magic-gamma/EBS_UI_Web/Magic");
		if (bStatus) {
		    System.out.println("Navigated to MAGIC QA");
		} else {
		    System.out.println("Cannot Navigated to MAGIC QA");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	//Okta Login//
	GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input26']"),"cmns559");
	GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input33']"),"our49pot");
	GeneralFunctions.clickElement(By.xpath(".//*[@id='form17']/div[2]/input"));
	
	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Given("^\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" entered Click on submit and Go to  Maintenance GIP  Baseline Rerun1$")
public void aff_abo_period_entered_Click_on_submit_and_Go_to_Maintenance_GIP_Baseline_Rerun1(String aff,String abo,String period) throws Throwable{
		
	
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),aff);
		  if (bStatus) {
	    System.out.println("AFF entered");
	} else {
	    System.out.println("Cannot enter AFF");
	}
		  
	
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),abo);
		  if (bStatus) {
	      System.out.println("ABO entered");
	  } else {
	      System.out.println("Cannot enter ABO");
	  }
		  
	
		  bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),period);
			if(bStatus){
	      	System.out.println("Entered Period");
	      }	
	      else{
	      	System.out.println("Cannot Enter Period");
	      }
         
	
			
			  bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
			  if (bStatus) {
		        System.out.println("Click on Submit");
		    } else {
		        System.out.println("Cannot click on submit");
		    }

	

		//Maintenance//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[3]"));
		if(bStatus){
        	System.out.println("Click on Maintanence");
        }	
        else{
        	System.out.println("Cannot Click on Maintanence");
        }
		
		//Maintenance-->GIP//
		bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='SubMenu2']/a[14]/span[1]"));
		if(bStatus){
        	System.out.println("Click on GIP");
        }	
        else{
        	System.out.println("Cannot Click on GIP");
        }
		
      //Maintenance-->GIP-->Baseline Rerun//
        bStatus=GeneralFunctions.clickElement(By.linkText("Baseline Rerun"));   
       if(bStatus){
		System.out.println("Click on Baseline Rerun");
       }	
       else{
       	System.out.println("Cannot Click on Baseline Rerun");
       }
}


	
	//Validating Scenario-2//
	@Given("^User is in Baseline Rerun Screen1$")
	public void User_is_in_Baseline_Rerun_Screen1() throws Throwable{
		
		 String Screen=GeneralFunctions.getTitle(By.xpath(".//*[@id='rerunDiv']/div"));
		   System.out.println("User is in :"  +Screen);
		  }
	
	
	@Given("^Enter eff PY1$")
	public void  Enter_eff_PY1() throws Throwable{
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bStatus=GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='effPerfYear']"),"2016");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(bStatus){
        	System.out.println("Enter Eff PY");
        }	
        else{
        	System.out.println("Cannot Enter Eff PY");
        }
	}
		@When("^Click on Rerun button1$")
		public void  Click_on_Rerun_button1() throws Throwable{
		
bStatus=GeneralFunctions.clickElement(By.id("rerunBaselineButton"));
		if(bStatus){
        	System.out.println("Click on Submit Rerun");
        }	
        else{
        System.out.println("Cannot Click on Submit Rerun");
        }
		
try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("^Capture the success message1$")
	public void Capture_the_success_message1() throws Throwable{
	
		//Validating Expected//
		 String Sucess=GeneralFunctions.getText(By.xpath(".//*[@id='successMsgDiv']"));
		 System.out.println("##########Expected-Result########################");
		   System.out.println(Sucess);
		   System.out.println("###############################################");
	}	
	
	@And("^Close the browser1$")
	public void Close_the_browser1() throws Throwable{   
		
		com.alticor.magic.GeneralFunctions.close();
		 if (bStatus) {
	            Reports.logResults(LogStatus.PASS, "Test Pass", "SampleTest");
  } else {
	            Reports.logResults(LogStatus.FAIL, "Test Fail", "SampleTest");
	        }
	}
	}

