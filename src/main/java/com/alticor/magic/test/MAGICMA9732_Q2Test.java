package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGICMA9732_Q2Test {
	
	/** Declare variables */
	boolean bStatus;
	
@Given("^Open Browser and Navigate to MAGIC Gamma$")
	public void Open_Browser_and_Navigate_to_MAGIC_Gamma() throws Throwable{
		
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
	
	@Given("^aff abo per entered Click on submit and Go to  Maintenance GIP  Baseline Rerun$")
public void aff_abo_per_entered_Click_on_submit_and_Go_to_Maintenance_GIP_Baseline_Rerun() throws Throwable{
		
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"430");
		  if (bStatus) {
	    System.out.println("AFF entered");
	} else {
	    System.out.println("Cannot enter AFF");
	}
		  
	bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"46");
		  if (bStatus) {
	      System.out.println("ABO entered");
	  } else {
	      System.out.println("Cannot enter ABO");
	  }
		  
	 bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"042017");
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
       
       try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	@Given("^Enter eff PY$")
	public void  Enter_eff_PY() throws Throwable{
		bStatus=GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='effPerfYear']"),"2016");
		if(bStatus){
        	System.out.println("Enter Eff PY");
        }	
        else{
        	System.out.println("Cannot Enter Eff PY");
        }
	}
		@When("^Click on Rerun button$")
		public void  Click_on_Rerun_button() throws Throwable{
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
	
	@Then("^Capture the success message$")
	public void Capture_the_success_message() throws Throwable{
	
		//Validating Expected//
		 String Sucess=GeneralFunctions.getText(By.xpath(".//*[@id='successMsgDiv']"));
		 System.out.println("##########Expected-Result########################");
		   System.out.println(Sucess);
		   System.out.println("###############################################");
	}
	
		   @And("^Close MAGIC Gamma$")
		   public void Close_MAGIC_Gamma() throws Throwable{   
	//com.alticor.magic.GeneralFunctions.close();//
			   com.alticor.magic.GeneralFunctions.close();
	        }
	
}


